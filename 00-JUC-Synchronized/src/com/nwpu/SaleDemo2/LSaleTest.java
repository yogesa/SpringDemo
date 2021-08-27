package com.nwpu.SaleDemo2;


import java.util.concurrent.locks.ReentrantLock;

class LTicket{

    private Integer number;
    public LTicket(){
        number = 30;
    }

    final ReentrantLock reentrantLock = new ReentrantLock();

    public void SaleLTicket(){

       reentrantLock.lock();

        if ( number > 0 ){
            System.out.println(Thread.currentThread().getName()+" :: "+number--+",剩余票数："+number);
        }

        reentrantLock.unlock();
    }

}
/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:06 2021/8/25
 * @Modified By:
 */
public class LSaleTest {
    public static void main(String[] args) {
        LTicket lTicket = new LTicket();
        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                lTicket.SaleLTicket();
            }
        },"AA").start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                lTicket.SaleLTicket();
            }
        },"BB").start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                lTicket.SaleLTicket();
            }
        },"CC").start();
    }
}
