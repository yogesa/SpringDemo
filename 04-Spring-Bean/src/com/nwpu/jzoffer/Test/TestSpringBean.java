package com.nwpu.jzoffer.Test;

import com.nwpu.jzoffer.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 9:09 2021/8/25
 * @Modified By:
 */
public class TestSpringBean {
    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("classpath:com/nwpu/jzoffer/springconfig/applicationContext.xml");
        System.out.println("-----------------------");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
