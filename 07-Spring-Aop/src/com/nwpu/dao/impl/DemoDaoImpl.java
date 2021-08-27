package com.nwpu.dao.impl;

import com.nwpu.dao.DemoDao;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 8:57 2021/8/27
 * @Modified By:
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public void insert() {
        System.out.println("[dao] insert方法被调用...");
    }
}
