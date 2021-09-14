package com.nwpu.jzoffer.Test;

import sun.reflect.generics.tree.Tree;

import javax.smartcardio.TerminalFactory;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 14:28 2021/9/14
 * @Modified By:
 */
public class Testlockinterruptibly implements Runnable{
    public static ReentrantLock lock1 = new ReentrantLock();
    public static ReentrantLock lock2 = new ReentrantLock();
    int lock;
    public Testlockinterruptibly(int lock){
        this.lock = lock;
    }
    @Override
    public void run(){
        try{
            if(lock == 1){
                lock1.lockInterruptibly();
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){}
                lock2.lockInterruptibly();
            }else{
                lock2.lockInterruptibly();
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){}
                lock1.lockInterruptibly();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            if(lock1.isHeldByCurrentThread()){
                lock1.unlock();
            }
            if(lock2.isHeldByCurrentThread()){
                lock2.unlock();
            }
            System.out.println(Thread.currentThread().getId()+":线程退出");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Testlockinterruptibly r1 = new Testlockinterruptibly(1);
        Testlockinterruptibly r2 = new Testlockinterruptibly(2);
        Thread thread = new Thread(r1);
        Thread thread1 = new Thread(r2);
        thread.start();;
        thread1.start();
        Thread.sleep(1000);
        thread1.interrupt();
    }
}
