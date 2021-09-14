package com.nwpu.jzoffer.service;

import com.nwpu.jzoffer.pojo.User;

import java.util.List;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 15:26 2021/8/29
 * @Modified By:
 */
public interface UserService  {
    List<User>  userList();

    void DelUser(int id);
}
