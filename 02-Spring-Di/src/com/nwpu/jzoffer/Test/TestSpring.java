package com.nwpu.jzoffer.Test;

import com.nwpu.jzoffer.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext Context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        User user = Context.getBean("user", User.class);
        System.out.println(user);

        System.out.println(user.getInfo().getProperty("driver"));

    }
}
