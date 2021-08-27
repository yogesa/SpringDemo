package com.nwpu.service.Impl;

import com.nwpu.dao.DemoDao;
import com.nwpu.service.DemoService;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 8:53 2021/8/27
 * @Modified By:
 */
public class DemoServiceImpl {

    private DemoDao demoDao ;

    public DemoDao getDemoDao() {
        return demoDao;
    }

    public void setDemoDao(DemoDao demoDao) {
        this.demoDao = demoDao;
    }



    //@Override
    public void add() {

        System.out.println("[service] add方法被调用...");
        demoDao.insert();
        throw new RuntimeException("抛出异常...");
    }
}
