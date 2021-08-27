package com.nwpu.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 9:09 2021/8/27
 * @Modified By:
 */
public class TxBeginAdvice implements MethodBeforeAdvice {

    /**
     * 前置通知 - 开启事务通知
     * @param method 当前被调用的方法
     *
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println("[事务前置通知]：开启事务管理...");
    }
}
