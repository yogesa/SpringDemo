package com.nwpu.SaleDemo;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 19:44 2021/8/25
 * @Modified By:
 */
class Ticket{
    private Integer number;
    public synchronized void SaleTicket(){
        if( number > 0 ){
            System.out.println(Thread.currentThread().getName()+" :: "+number--+",剩余票数："+number);
        }
    }
    public Ticket() {
        number = 50;
    }
}

public class SaleTest {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                ticket.SaleTicket();
            }
        },"AA").start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                ticket.SaleTicket();
            }
        },"BB").start();

        new Thread(()->{
            for (int i = 0; i < 40; i++) {
                ticket.SaleTicket();
            }
        },"CC").start();

    }

}
