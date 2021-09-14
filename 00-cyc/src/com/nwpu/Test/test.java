package com.nwpu.Test;

import com.nwpu.jzoffer.Tree.Test30.Solution;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 10:33 2021/9/12
 * @Modified By:
 */

/**
 * 子类重写父类方法
 */
class SonThread extends Thread{
    @Override
    public void run() {
        System.out.println("我是子类中实现的run()方法");;
    }
}

/**
 * 通过实现Callable接口通过FutureTask包装器来创建Thread线程
 */

class TestCallable implements Callable{
    @Override
    public Object call() throws Exception {
        System.out.println("我是Callable接口下的call方法");
        return new Object();
    }
}

public class test {

    public static void main(String[] args) {

        //匿名内部类，重写Thread的run的方法
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("hello , I am t1~!");;
            }
        };
        t1.start();

        //使用lamda表达式实现接口中的runnable
        Thread t2 = new Thread(()->{
            System.out.println("hello , I am runnable 重写的run方法~！");
        });
        t2.start();

        //使用子类继承父类重写父类run方法
       Thread t3 =  new SonThread();
       t3.start();

       //子类实现callable接口，重写call方法
       Callable t4 = new TestCallable();

        try {
            t4.call();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Todo 使用线程池实现
    }
}
