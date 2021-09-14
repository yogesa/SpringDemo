package com.nwpu.jzoffer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:37 2021/8/25
 * @Modified By:
 */
public class DynamicDemo implements InvocationHandler {


    private Rent user;

    private Object object;
    DynamicDemo(){

    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        user = new User();
        System.out.println("签订合同...");
        method.invoke(user,args);
        System.out.println("客户登记...");
        return null;
    }

    Rent getProxy(){
        return (Rent) Proxy.newProxyInstance(DynamicDemo.class.getClassLoader(), new Class<?>[]{Rent.class},this);
    }
    public Rent getUser() {
        return user;
    }

    public void setUser(Rent user) {
        this.user = user;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
