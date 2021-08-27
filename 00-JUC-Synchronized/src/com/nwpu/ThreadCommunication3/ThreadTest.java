package com.nwpu.ThreadCommunication3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: ch
 * @Description: 使用 unlock 实现线程之间的通信
 * @Date: Created in 19:06 2021/8/26
 * @Modified By:
 */

class Share{
    private int number = 0;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void incr()  {
        try {
            lock.lock();

            while ( number != 0){
                condition.await();
            }

            System.out.println(Thread.currentThread().getName()+" :: "+ number++ +" now is "+number);

            condition.signal();
        }catch (Exception e){
            System.out.println(e);
        }finally {
           lock.unlock();
        }
    }

    public void decr(){
        try{

            lock.lock();

            while (number != 1){
                condition.await();
            }

            System.out.println(Thread.currentThread().getName()+" :: "+ number-- +" now is "+number);

            condition.signal();

        }catch (Exception e){

            lock.unlock();
        }
    }
}
public class ThreadTest {

    public static void main(String[] args) {
        Share share = new Share();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                    share.incr();
            }
        },"AA").start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                    share.decr();
            }
        },"BB").start();

    }
}
