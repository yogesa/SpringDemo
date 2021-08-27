package com.nwpu.ThreadCommunication2;

/**
 * @Author: ch
 * @Description: 虚假唤醒测试，当多个线程进行对临界区资源操作时候，在判断的时候应该讲if换成while来判断
 * @Date: Created in 20:27 2021/8/25
 * @Modified By:
 */
class Ticket{
    private Integer number;
    public Ticket(){
        number = 1;
    }
    public synchronized void incr() throws InterruptedException {
        while (number != 0){
            this.wait();
        }
        System.out.println(Thread.currentThread().getName()+" :: "+ number++ +" now is "+number);
        this.notifyAll();
    }
    public synchronized void decr() throws InterruptedException{
        while (number != 1){
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

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                try {
                    ticket.incr();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"CC").start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                try {
                    ticket.decr();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"DD").start();
    }

}
