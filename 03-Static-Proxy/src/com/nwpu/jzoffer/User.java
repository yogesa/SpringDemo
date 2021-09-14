package com.nwpu.jzoffer;

/**
 * @Author: ch
 * @Description: 真实类
 * @Date: Created in 8:52 2021/8/25
 * @Modified By:
 */
public class User implements Rent {

    User(){

    }

    @Override
    public void RentRoom(Double money) {
        System.out.println("User rent room，get" + money);
    }
}
