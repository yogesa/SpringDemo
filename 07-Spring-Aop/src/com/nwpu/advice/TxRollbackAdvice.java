package com.nwpu.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 9:17 2021/8/27
 * @Modified By:
 */
public class TxRollbackAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception e){
        System.out.println("[事务异常通知]:事务回滚...");
    }
}
