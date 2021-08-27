package com.nwpu.ThreadCommunication;

/**
 * @Author: ch
 * @Description: 进程通信 测试
 * @Date: Created in 19:53 2021/8/25
 * @Modified By:
 */
class Ticket{
    private Integer number;
    public Ticket(){
        number = 1;
    }
    public synchronized void incr() throws InterruptedException {
        if(number != 0){
            this.wait();
        }
        System.out.println(Thread.currentThread().getName()+" :: "+ number++ +" now is "+number);
        this.notifyAll();
    }
    public synchronized void decr() throws InterruptedException{
        if(number != 1){
            this.wait();
        }
        System.out.println(Thread.currentThread().getName()+" :: "+ number-- +" now is "+number);
        this.notifyAll();
    }
}

public class ThreadCommTest {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                try {
                    ticket.incr();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"AA").start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                try {
                    ticket.decr();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"BB").start();

    }

}
