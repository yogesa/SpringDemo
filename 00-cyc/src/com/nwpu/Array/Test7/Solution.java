package com.nwpu.Array.Test7;

import java.util.Stack;

public class Solution {

    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();


    public void push(int node) {
        dataStack.push(node);
    }

    public void pop()  {
        if(!dataStack.empty()){
            dataStack.pop();
        }
        else
            try {
                throw new Exception("Stack is empty!") ;
            }catch (Exception e){

            }
    }

    public int top() {
      return  dataStack.peek();
    }

    public int min() {
        int min = dataStack.peek();
        while (!dataStack.empty()){
            int temp = dataStack.pop();
            if(temp < min){
                min = temp;
            }
                tempStack.push(temp);
        }
        while (!tempStack.empty()){
            dataStack.push(tempStack.pop());
        }
      return min;
    }

    public static void main(String[] args) {
        Solution s =  new Solution();
        s.push(100);
        s.push(20);
        s.push(40);
        s.push(60);
        s.push(10);
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