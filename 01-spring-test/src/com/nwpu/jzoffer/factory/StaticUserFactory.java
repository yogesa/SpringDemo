package com.nwpu.jzoffer.factory;

import com.nwpu.jzoffer.pojo.User;

public class StaticUserFactory {

    public StaticUserFactory() {
    }

    public static User getInstance(){
        return new User();
    }
}
