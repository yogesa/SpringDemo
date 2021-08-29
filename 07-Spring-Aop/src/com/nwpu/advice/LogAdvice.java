package com.nwpu.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @Author: ch
 * @Description:环绕通知，用于日志记录
 * @Date: Created in 10:01 2021/8/27
 * @Modified By:
 */
public class LogAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        Method method = invocation.getMethod();
        Object returnValue = null;
        //调用真实方法
        try{

            System.out.println("[日志前置:]"+method.getName()+"被调用...");
            returnValue = invocation.proceed();
            System.out.println("[日志后置]"+method.getName()+"执行完毕...");

        }catch (Exception e){

            System.out.println("[日志异常]"+method.getName()+"出现了异常");

            throw new RuntimeException("异常传递...");
        }


        return returnValue;
    }
}
