package com.nwpu.jzoffer.Test;

import com.nwpu.jzoffer.factory.StaticUserFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //通过构造器，构造对象
//        User user = context.getBean("user", User.class);
//        System.out.println(user);
//        System.out.println(user.hashCode());
//
//        User user2 = context.getBean("user",User.class);
//        System.out.println(user2.hashCode());
//        System.out.println(user2);

//        System.out.println(user == user2);

//        通过工厂构造对象
//        UserFactory userFactory = context.getBean("userFactory", UserFactory.class);
//        System.out.println(userFactory.getInstance());

//        通过静态工厂构造对象
        System.out.println(StaticUserFactory.getInstance());
    }

    @Test
    public void testJunit(){
        int a = 4;
        int b = 5;
        System.out.println(a+b);
    }
}
