package com.nwpu.Array.Test7;

import java.util.Stack;

public class Solution2 {

    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();


    public void push(int node) {
        dataStack.push(node);
        if(tempStack.empty() || node <= min()) {
            tempStack.push(node);
        }
    }

    public void pop()  {
       int t = dataStack.pop();
       if(t == min()){
           tempStack.pop();
       }
    }

    public int top() {
        return  dataStack.peek();
    }

    public int min() {
        return tempStack.peek();
    }
    public static void main(String[] args) {

       Solution s =  new Solution();
        s.push(1);
        s.push(20);
        s.push(4);
        s.push(6);
        s.push(10);
        s.pop();
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());

    }
}
