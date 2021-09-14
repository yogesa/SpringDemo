package com.nwpu.jzoffer.service.impl;

import com.nwpu.jzoffer.mapper.UserMapper;
import com.nwpu.jzoffer.pojo.User;
import com.nwpu.jzoffer.service.UserService;

import java.util.List;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 17:00 2021/8/29
 * @Modified By:
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void DelUser(int id) {
        userMapper.DelUser(id);
    }

    @Override
    public List<User> userList() {
        return userMapper.selAll();
    }


}
