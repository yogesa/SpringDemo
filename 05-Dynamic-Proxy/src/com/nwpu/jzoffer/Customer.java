package com.nwpu.jzoffer;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:58 2021/8/25
 * @Modified By:
 */
public class Customer {
    public static void main(String[] args) {
        DynamicDemo dynamicDemo = new DynamicDemo();
        dynamicDemo.setUser(new User());
        Rent proxy = dynamicDemo.getProxy();
        proxy.SaleRoom(200.0);



    }
}
