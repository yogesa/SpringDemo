package com.nwpu.jzoffer.LinkList.Test2;

/**
 * @Author: ch
 * @Description: 在 O(1) 时间内删除链表节点
 * @Date: Created in 21:06 2021/8/28
 * @Modified By:
 *
 */
public class Solution {
    public static   ListNode deleteNode(ListNode head , ListNode  tobeDelete){
        if(head == null || tobeDelete == null){
            return null;
        }
        //用 tobeDelete.next 指向 next.next ，可以删除 tobeDelete 节点，是因为第二步时，删除节点和删除几点的值想相同了
        if(tobeDelete.next != null){//节点数大于2
            ListNode next = tobeDelete.next;
            tobeDelete.val = next.val;
            tobeDelete.next = next.next;
        }else {
            if(head == tobeDelete){
                head = null;
            }else
            {
                ListNode h = head;
                while(h.next != tobeDelete){
                    h = h.next;
                }
                h.next = null;
            }
        }
        return  head;
    }

    public static void main(String[] args) {
        ListNode h = new ListNode(0);
        ListNode t = h ;
        ListNode[] listNodes = new ListNode[9];
        for(int i = 1; i < 9; i++){
            listNodes[i] = new ListNode(i);
            t.next = listNodes[i] ;
            t = listNodes[i] ;
        }
        ListNode shchu = new ListNode();
        shchu = listNodes[5];
        deleteNode(h,shchu);

        while (h != null){
            System.out.println(h.val);
            h = h.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
        ListNode(){}

    }
}
