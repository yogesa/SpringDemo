package com.nwpu.jzoffer.Search.Test46;

import sun.security.krb5.internal.crypto.Aes128;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: ch
 * @Description:
 * 未解决,太难了
 * @Date: Created in 19:38 2021/9/16
 * @Modified By:
 */
public class Solution {
    ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
      int strLen = str.length();
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < strLen; i++){
          sb.append(str.charAt(i));
      }
    }

    private static char[] swap(char[] arr, int i, int j) {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
        return arr;
    }

    public static void main(String[] args) {
        String s = "abc";
        char[] c = s.toCharArray();
        System.out.println(swap(c,0,1));
        String s1 = new String(swap(c,0,1));
        System.out.println(s1); 




    }
}
