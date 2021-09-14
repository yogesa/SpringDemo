package com.nwpu.factory;

import com.nwpu.pojo.User;

public class StaticUserFactory {

    public StaticUserFactory() {
    }

    public static User getInstance(){
        return new User();
    }
}
