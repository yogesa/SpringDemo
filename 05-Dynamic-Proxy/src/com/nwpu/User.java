package com.nwpu;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:34 2021/8/25
 * @Modified By:
 */
public class User implements Rent {
    public User(){

    }
    @Override
    public Object RentRoom(double money) {
        System.out.println("Room has been rented,acquired :"+money);
        return new Object();
    }

    @Override
    public void SaleRoom(double money) {
        System.out.println("Room has been sale,acquired :"+money);
    }
}
