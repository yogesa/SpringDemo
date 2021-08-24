package com.nwpu.Test11;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;


/**
 * @Author: ch
 * @Description:
 * @Date: Created in 19:25 2021/8/24
 * @Modified By:
 */
public class Solution {
    private int[] cnts = new int[128];
    private List<Character>  list = new LinkedList<>();

    //Insert one char from stringstream
    public void Insert(char ch)
    {
        cnts[ch]++;
        list.add(ch);
        while (!list.isEmpty() && cnts[list.get(0)]>1){
            list.remove(0);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
       return list.isEmpty()? '#': list.get(0);
    }

    public static void main(String[] args) {

        String str = new String("google");
        Solution s = new Solution();
        for (int i = 0; i < str.length(); i++) {
            s.Insert(str.charAt(i));
            System.out.println(s.FirstAppearingOnce());
        }
    }
}
