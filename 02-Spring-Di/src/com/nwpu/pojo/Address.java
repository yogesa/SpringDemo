package com.nwpu.pojo;

import java.io.Serializable;

public class Address implements Serializable {
    private String myCity;

    @Override
    public String toString() {
        return "Address{" +
                "myCity='" + myCity + '\'' +
                '}';
    }

    public Address() {
    }

    public Address(String myCity) {
        this.myCity = myCity;
    }

    public String getMyCity() {
        return myCity;
    }

    public void setMyCity(String myCity) {
        this.myCity = myCity;
    }
}
