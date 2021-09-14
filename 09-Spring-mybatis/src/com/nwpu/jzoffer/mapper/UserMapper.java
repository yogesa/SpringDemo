package com.nwpu.jzoffer.mapper;

import com.nwpu.jzoffer.pojo.User;

import java.util.List;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 17:02 2021/8/29
 * @Modified By:
 */
public interface UserMapper {
    List<User> selAll();

    /**
     * 根据 id 删除 User
     * @param id
     */
    void DelUser(int id);
}
