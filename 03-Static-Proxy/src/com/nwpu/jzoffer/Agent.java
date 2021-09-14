package com.nwpu;

/**
 * @Author: ch
 * @Description: 代理类
 * @Date: Created in 8:53 2021/8/25
 * @Modified By:
 */
public class Agent implements Rent{
    public User user;
    public double money;
    Agent(){

    }
    @Override
    public void RentRoom(Double money) {
        if(user == null){
            user = new User();
        }
        System.out.println("中介正在出租...");
         user.RentRoom(money);
        System.out.println("中介出租完毕");
    }
}
