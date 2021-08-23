package com.nwpu.Test8;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    //12345 45321 53421


    /**
     * while(
     * !s.empty())
     * 若pushA的 i 与 popA j 指向的值相同，去除pushA值与popA中的值 , i--.j++
     * 若不同，j++
     *
     * @param pushA
     * @param popA
     * @return
     */
    public boolean IsPopOrder (int [] pushA,int [] popA) {
        int i = 0 ,j = 0;
        Stack<Integer> s = new Stack<>();
        while( i < pushA.length ){
            while(pushA[i] != popA[j]){
                s.push(pushA[i]);
                i++;
            }
            j++;
            i++;
            while(!s.empty() && s.peek() == popA[j]){
                j++;
                s.pop();
            }
        }
        if(s.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,3,5,2,1};
        System.out.println(new Solution().IsPopOrder(pushA,popA));
    }
}