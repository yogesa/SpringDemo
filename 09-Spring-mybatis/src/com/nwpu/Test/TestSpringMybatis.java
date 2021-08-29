package com.nwpu.Test;

import com.nwpu.mapper.UserMapper;
import com.nwpu.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 15:34 2021/8/29
 * @Modified By:
 */
public class TestSpringMybatis {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/spring/*.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.selAll();
        for (User u : users) {
            System.out.println(u);
        }

    }
}
