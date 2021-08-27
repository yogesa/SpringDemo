package com.nwpu.pojo;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 9:09 2021/8/25
 * @Modified By:
 */
public class User {

    private String name;
    User(){
        System.out.println("User 正在构造中....");
    }

    public  void init(){
        System.out.println("User is 初始化...");
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
