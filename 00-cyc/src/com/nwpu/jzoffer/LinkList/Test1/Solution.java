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
     ArrayList<Integer> ret = new ArrayList<>();
     public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         if (listNode != null) {
             printListFromTailToHead(listNode.next);
             ret.add(listNode.val);
         }
         return ret;
     }

    /**
     *
     * @param listNode
     * @return
     */
     public ListNode printListFromTailToHead_reverse(ListNode listNode){
         ListNode p = listNode;
         if( p.next== null){
             return p;
         }
         ListNode newnode =  printListFromTailToHead_reverse(p.next);
         p.next.next = p;
         p.next = null;
         return newnode;
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
        ListNode newnode = new Solution().printListFromTailToHead_reverse(listNode );
        while (newnode != null){
            System.out.println(newnode.val);
            newnode = newnode.next;
        }

    }
}
