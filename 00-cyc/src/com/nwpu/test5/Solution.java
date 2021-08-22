package com.nwpu.test5;

import oracle.jrockit.jfr.events.Bits;

import java.util.BitSet;

public class Solution {
    public int FirstNotRepeatingChar(String str){
        int[] flag = new int[128];
        for (int i = 0; i < 128; i++) {
            flag[i] = 0;
        }
        for (int i = 0; i < str.length(); i++) {
            flag[str.charAt(i)]++;
        }
        int i ;
        for (i = 0; i < 128; i++) {
            if(flag[i] == 1){
                return i;
            }
        }
        return -1;
    }
    public int FirstNotRepeatingChar1(String str){
        BitSet bs1 = new BitSet(128);
        BitSet bs2 = new BitSet(128);
        for(char s:str.toCharArray())
        {
            if(!bs1.get(s) && !bs2.get(s))
            {
                bs1.set(s);
            }
            else(bs1.get(s) && !bs1.get(s))
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
        System.out.println((char)new Solution().FirstNotRepeatingChar("google"));
    }
}
