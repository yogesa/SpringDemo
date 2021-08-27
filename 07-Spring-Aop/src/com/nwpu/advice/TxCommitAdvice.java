package com.nwpu.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 9:14 2021/8/27
 * @Modified By:
 */
public class TxCommitAdvice implements AfterReturningAdvice  {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        System.out.println("[事务后置通知]：事务提交...");
    }
}
