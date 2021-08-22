package com.nwpu.factory;

import com.nwpu.pojo.User;

public class UserFactory {

    public UserFactory() {
    }

    public User getInstance(){
        return new User(124,"李四");
    }

}
