package com.nwpu.Test;

import com.nwpu.dao.DemoDao;
import com.nwpu.dao.impl.DemoDaoImpl;
import com.nwpu.service.DemoService;
import com.nwpu.service.Impl.DemoServiceImpl;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 8:58 2021/8/27
 * @Modified By:
 * servlet ---> service（对事务进行管理） --->dao --->DB
 */
public class TestAop {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        //使用jDK动态代理
        //如果想使用jdk 动态代理，就不应该继承接口，并且getBean输入的类，为接口类。

        //使用CGlib
        DemoServiceImpl proxy = Context.getBean("proxy", DemoServiceImpl.class);
        proxy.add();
    }
}
