package com.nwpu.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 9:55 2021/8/26
 * @Modified By:
 */
public class Agent implements MethodInterceptor {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Host proxy = agent.getProxy();
        proxy.rent(300);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("[前置]");
        methodProxy.invokeSuper(o,objects);
        System.out.println("[后置]");
        return null;
    }

    public Host getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Host.class);
        enhancer.setCallback(this);
        return  (Host) enhancer.create();
    }
}
