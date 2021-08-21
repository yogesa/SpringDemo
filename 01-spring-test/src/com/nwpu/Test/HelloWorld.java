package com.nwpu.Test;

import com.nwpu.pojo.User;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        System.out.println(user.hashCode());

        User user2 = context.getBean("user",User.class);
        System.out.println(user2.hashCode());
        System.out.println(user2);

        System.out.println(user == user2);

    }
}
