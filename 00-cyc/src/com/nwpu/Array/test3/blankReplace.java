package com.nwpu.Array.test3;

public class blankReplace {

    public static String BR(String str){
        return  str.replaceAll(" ","%20");
    }
    public static void main(String[] args) {
        System.out.println(BR("A B"));
    }
}
