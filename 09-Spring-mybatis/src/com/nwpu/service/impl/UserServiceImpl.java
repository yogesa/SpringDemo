package com.nwpu.service.impl;

import com.nwpu.pojo.User;
import com.nwpu.mapper.UserMapper;
import com.nwpu.service.UserService;

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
    public List<User> userList() {
        return userMapper.selAll();
    }
}
