package com.nwpu.jzoffer.pojo;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {
    private int myId;
    private Integer myAge;
    private String myName;
    private String[] myHob;
    private Date myBirthday;
    private Address myAddress;
    private List<Address> myAddrs;
    private Set<MyCard> myCard;
    private Map<String,MyCard> cardMap;
    private Properties info;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "\nmyId=" + myId +
                "\n, myAge=" + myAge +
                "\n, myName='" + myName + '\'' +
                "\n, myHob=" + Arrays.toString(myHob) +
                "\n, myBirthday=" + myBirthday +
                "\n, myAddress=" + myAddress +
                "\n, myAddrs=" + myAddrs +
                "\n, myCard=" + myCard +
                "\n, cardMap=" + cardMap +
                "\n, info=" + info +
                '}';
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    public Integer getMyAge() {
        return myAge;
    }

    public void setMyAge(Integer myAge) {
        this.myAge = myAge;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String[] getMyHob() {
        return myHob;
    }

    public void setMyHob(String[] myHob) {
        this.myHob = myHob;
    }

    public Date getMyBirthday() {
        return myBirthday;
    }

    public void setMyBirthday(Date myBirthday) {
        this.myBirthday = myBirthday;
    }

    public Address getMyAddress() {
        return myAddress;
    }

    public void setMyAddress(Address myAddress) {
        this.myAddress = myAddress;
    }

    public List<Address> getMyAddrs() {
        return myAddrs;
    }

    public void setMyAddrs(List<Address> myAddrs) {
        this.myAddrs = myAddrs;
    }

    public Set<MyCard> getMyCard() {
        return myCard;
    }

    public void setMyCard(Set<MyCard> myCard) {
        this.myCard = myCard;
    }

    public Map<String, MyCard> getCardMap() {
        return cardMap;
    }

    public void setCardMap(Map<String, MyCard> cardMap) {
        this.cardMap = cardMap;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }
}
