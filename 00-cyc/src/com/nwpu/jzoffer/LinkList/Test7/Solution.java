package com.nwpu.jzoffer.LinkList.Test7;

import com.nwpu.jzoffer.LinkList.ListNode;
import com.nwpu.jzoffer.LinkList.MyPrintLinkUtil;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 21:49 2021/9/2
 * @Modified By:
 */
public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {

        ListNode p1 = list1, p2 = list2;
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while ( p1 != null && p2 != null){
            if(p1.val < p2.val){
                tail.next = p1;
                p1 = p1.next;
                tail = tail.next;

            }else{
                tail.next = p2;
                p2 = p2.next;
                tail = tail.next;
            }
        }
        while ( p1 != null){
            tail.next = p1;
            p1 = p1.next;
            tail = tail.next;
        }
        while ( p2 != null){
            tail.next = p2;
            p2 = p2.next;
            tail = tail.next;
        }
        tail.next = null;
        return  head.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        ListNode p = list1;
        for (int i = 1; i<=10 ; i=i+2) {
            ListNode node = new ListNode(i);
            p.next = node;
            p = p.next;
        }
        System.out.println("list1");
        MyPrintLinkUtil.printListNode(list1);

        ListNode list2 = new ListNode(0);
         p = list2;
        for (int i = 2; i<=10 ; i=i+2) {
            ListNode node = new ListNode(i);
            p.next = node;
            p = p.next;
        }
        System.out.println("\nlist2");
        MyPrintLinkUtil.printListNode(list2);

        ListNode h = new Solution().Merge(list1,list2);

        System.out.println("after merge");
        MyPrintLinkUtil.printListNode(h);


    }

}
