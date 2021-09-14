package com.nwpu.jzoffer.Advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 16:31 2021/8/28
 * @Modified By:
 */
public class Advice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("[前置通知]");
        Object result = methodInvocation.proceed();
        System.out.println("[后置通知]");
        return result;
    }
}
