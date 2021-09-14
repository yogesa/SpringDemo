package com.nwpu.jzoffer;

import com.nwpu.jzoffer.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 16:41 2021/8/28
 * @Modified By:
 */
public class TestAspectJ {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        DemoService demoService = context.getBean("DemoService", DemoService.class);
        demoService.demo1();
    }
}
