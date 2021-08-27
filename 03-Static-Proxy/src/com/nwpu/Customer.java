package com.nwpu;

/**
 * @Author: ch
 * @Description: 通过代理类，来是实现真实类的方法
 * @Date: Created in 8:55 2021/8/25
 * @Modified By:
 */
public class Customer {
    public static void main(String[] args) {

        Agent age = new Agent();
        age.RentRoom(4000.0);
    }
}
