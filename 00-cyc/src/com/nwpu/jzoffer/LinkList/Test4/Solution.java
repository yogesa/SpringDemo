package com.nwpu.LinkList.Test4;

import java.util.List;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 21:49 2021/9/1
 * @Modified By:
 */

public class Solution {

    public ListNode FindKthToTail (ListNode pHead, int k) {
        int length = 0;
        if( k <= 0){
            return null;
        }
        ListNode  p = pHead ;
        ListNode pk = new ListNode();
        while( p != null ){
            length++;
            p = p.next;
        }
        if( k > length){
            return null;
        }
        p = pHead;
        for(int i=1 ; i < k ;i++){
            pk = p.next;
            p = p.next;
        }
        p = pHead;
        while (pk.next != null ){
            p = p.next;
            pk = pk.next;
        }
        return p ;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(2);

        listNode.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next.next= new ListNode(5);


        ListNode l = new Solution().FindKthToTail(listNode,3);

        printListNode(l);
    }

    public static void printListNode(ListNode listnode){
        while (listnode != null){
            System.out.print(listnode.val + " ");
            listnode = listnode.next;
        }
    }
      public static class ListNode {
       int val;
        ListNode next = null;
        public ListNode(){
        }
        public ListNode(int val) {
          this.val = val;
        }
    }

}
