package com.nwpu.Test11;

import java.util.*;


/**
 * @Author: ch
 * @Description:
 * @Date: Created in 19:25 2021/8/24
 * @Modified By:
 */
public class Solution {
    private int[] cnts = new int[128];
    private Queue   queue  = new LinkedList<>();

    //Insert one char from stringstream
    public void Insert(char ch)
    {
        cnts[ch]++;
        queue.add(ch);
        while (!queue.isEmpty() && cnts[(char)queue.peek()]>1){
            queue.poll();
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
       return queue.isEmpty()? '#': (char)queue.peek();
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
