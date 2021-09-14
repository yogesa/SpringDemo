package com.nwpu.jzoffer.factory;

import com.nwpu.jzoffer.pojo.User;

public class UserFactory {

    public UserFactory() {
    }

    public User getInstance(){
        return new User(124,"李四");
    }

}
