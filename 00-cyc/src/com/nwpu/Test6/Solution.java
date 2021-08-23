package com.nwpu.Test6;

import java.util.Stack;

public class Solution {

    Stack<Integer> in = new Stack<>() ;
    Stack<Integer> out = new Stack<>();
    public int pop(){
        while(!in.empty()){
            out.push(in.pop());
        }
        int temp = out.pop();
        while (!out.empty()){
            in.push(out.pop());
        }
        return  temp;
    }
    public void push(int elem){
        in.push(elem);
    }


    public static void main(String[] args) {
        Solution queue = new Solution();
        queue.push(1);;
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
