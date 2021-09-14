package com.nwpu.jzoffer.pojo;

import java.io.Serializable;

public class MyCard implements Serializable {
    private String cardId;
    private double balance;

    @Override
    public String toString() {
        return "MyCard{" +
                "cardId='" + cardId + '\'' +
                ", balance=" + balance +
                '}';
    }

    public MyCard() {
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
