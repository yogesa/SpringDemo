package com.nwpu.Test;

import javafx.beans.binding.ObjectExpression;
import org.springframework.ui.context.Theme;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 15:23 2021/9/15
 * @Modified By:
 */
public class LockSupportDemo {
    public static Object u = new Object();
    static ChangeObjectThread t1 = new ChangeObjectThread("t1");
    static ChangeObjectThread t2 = new ChangeObjectThread("t2");
    public static  class ChangeObjectThread extends Thread{
        public  ChangeObjectThread(String name){
            super(name);
        }

        @Override
        public void run() {
            synchronized (u){
                System.out.println("in " + getName());
                LockSupport.park();
                if(Thread.interrupted()){
                    System.out.println(getName() + "被中断了");
                }
            }
            System.out.println(getName() + "执行结束");

        }
    }

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        Thread.sleep(1000);
        t2.start();



       // t1.interrupt();
        LockSupport.unpark(t1);

         //LockSupport.unpark(t2);
       t1.join();
       t2.join();
    }
}
