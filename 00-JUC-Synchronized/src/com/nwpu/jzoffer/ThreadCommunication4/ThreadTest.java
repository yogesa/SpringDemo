package com.nwpu.jzoffer.ThreadCommunication4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: ch
 * @Description: 实现线程之间的定制化通信，让AA线程打印5次，BB线程打印10次，CC线程打印15次，轮回打印10次
 *
 * @Date: Created in 19:20 2021/8/26
 * @Modified By:
 */

class ShareRource{

    private int flag = 1;

    private  Lock lock = new ReentrantLock();

    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void print5(int loop) throws InterruptedException {
            lock.lock();
            try{
                while ( flag != 1){
                    c1.await();
                }

                for (int i = 0; i < 5 ; i++) {
                    System.out.println(Thread.currentThread().getName()+" :: "+ i +",轮次："+loop);
                }

                flag = 2;
                c2.signal();

            }finally {

                lock.unlock();
            }



    }

    public void print10(int loop) throws InterruptedException {

        lock.lock();
        try{
            while ( flag != 2){
                c2.await();
            }

            for (int i = 0; i < 10 ; i++) {
                System.out.println(Thread.currentThread().getName()+" :: "+ i +",轮次："+loop);
            }

            flag = 3;
            c3.signal();
        }finally {
            lock.unlock();
        }

    }
    public void print15(int loop) throws InterruptedException {
        lock.lock();
        try{
            while ( flag != 3){
                c3.await();
            }

            for (int i = 0; i < 15 ; i++) {
                System.out.println(Thread.currentThread().getName()+" :: "+ i +",轮次："+loop);
            }

            flag = 1;
            c1.signal();
        }finally {
            lock.unlock();
        }

    }



}
public class ThreadTest {
    public static void main(String[] args) {

        ShareRource share = new ShareRource();

        new Thread(()->{
            for (int j = 0; j < 10; j++) {
                try {
                    share.print5(j);
                } catch (InterruptedException e) {
                    System.out.println(e);;
                }
            }
        },"AA").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    share.print10(i);
                } catch (InterruptedException e) {
                    System.out.println(e);;
                }
            }
        },"BB").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    share.print15(i);
                } catch (InterruptedException e) {
                    System.out.println(e);;
                }
            }
        },"CC").start();

    }
}
