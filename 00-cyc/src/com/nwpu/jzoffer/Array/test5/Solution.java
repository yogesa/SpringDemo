package com.nwpu.jzoffer.Array.test5;

import java.util.BitSet;

public class Solution {

    public int FirstNotRepeatingChar(String str){
        BitSet bs1 = new BitSet(128);
        BitSet bs2 = new BitSet(128);
        for(char s:str.toCharArray())
        {
            if(!bs1.get(s) && !bs2.get(s))
            {
                bs1.set(s);
            }
            else if(bs1.get(s) && !bs2.get(s))
            {
                bs2.set(s);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(bs1.get(c) && !bs2.get(c)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().FirstNotRepeatingChar("google"));
    }
}
