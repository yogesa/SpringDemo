package com.nwpu.LinkList.Test1;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: ch
 * @Description: 链表逆序输出
 * @Date: Created in 20:47 2021/8/28
 * @Modified By:
 */

 class ListNode {
         int val;
         ListNode next = null;
         ListNode(int val) {
             this.val = val;
         }
    }
public class Solution {
     //暴力解法
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        if(listNode == null){
//            return arrayList;
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        while (listNode != null){
//            stack.add(listNode.val);
//            listNode = listNode.next;
//        }
//        while(!stack.isEmpty()){
//            arrayList.add(stack.pop());
//        }
//        return arrayList;
//    }
    //递归解法
     public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         ArrayList<Integer> ret = new ArrayList<>();
         if (listNode != null) {
             printListFromTailToHead(listNode.next);
             ret.add(listNode.val);
         }
         return ret;
     }


    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while(listNode != null){
            list.add(0,listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        System.out.println(new Solution().printListFromTailToHead2(listNode));
    }
}
