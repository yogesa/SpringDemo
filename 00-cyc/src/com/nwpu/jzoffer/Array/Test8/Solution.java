package com.nwpu.jzoffer.Array.Test8;

import java.util.Stack;

public class Solution {

    /**
     * while(
     * !s.empty())
     * 若pushA的 i 与 popA j 指向的值相同，去除pushA值与popA中的值 , i--.j++
     * 若不同，j++
     *
     * @param pushA
     * @param popA
     * @return
     *
     * 若pushA的i所指向的值，不等于popA的j所指向的下标值，则将i执行指向的值放入临时栈中，否则，跳出循环，直到i==pushA.length
     * i++，j++
     * 当值相同的时，可能出现出栈操作，
     */

    public boolean IsPopOrder (int [] pushA,int [] popA) {
        int i = 0 ,j = 0;
        Stack<Integer> s = new Stack<>();
        while( i < pushA.length  ){
            while(i < pushA.length ){
               if(pushA[i] != popA[j]) {
                   s.push(pushA[i]);
                   i++;
               }
               else{
                   s.push(pushA[i]);
                   break;
               }
            }
            //是否要考虑数组越界问题
            while( !s.isEmpty() ){
                if( s.peek() == popA[j] ){
                    j++;
                    s.pop();
                }
               else
                  break;
            }
        }
       return s.empty();
    }

    //从A中取出一个数放在临时栈中，循环判断，当栈中不空，并且栈顶元素等于pop[j}，并且j<N时执行出栈操作。
    //若循环结束后，返回栈的内容
    public boolean IsPopOrder_modify (int [] pushA,int [] popA) {
        int i = 0 ,j = 0;
        int n = pushA.length;
        Stack<Integer> s = new Stack<>();
        for( i = 0,j = 0; i < n ; i++ ){
            s.push(pushA[i]);
            while(j < n && !s.isEmpty() && popA[i]==s.peek()){
                s.pop();
                j++;
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,3,2,6,5};
        System.out.println(new Solution().IsPopOrder_modify(pushA,popA));
    }
}