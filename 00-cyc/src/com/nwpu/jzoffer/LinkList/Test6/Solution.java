package com.nwpu.jzoffer.LinkList.Test6;

import com.nwpu.jzoffer.LinkList.ListNode;
import com.nwpu.jzoffer.LinkList.MyPrintLinkUtil;

/**
 * @Author: ch
 * @Description: 反转链表
 * @Date: Created in 20:51 2021/9/2
 * @Modified By:
 */
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int i = 1; i<=6 ; i++) {
            ListNode node = new ListNode(i);
            p.next = node;
            p = p.next;
        }
        head = new Solution().ReverseList(head);
        MyPrintLinkUtil.printListNode(head);

    }

    //递归求解你只链表
    public ListNode ReverseList1(ListNode head) {
        ListNode newnode = new ListNode(0);
        if (head == null || head.next == null) {
            return head;
        }
        while (head.next != null ) {
            newnode = ReverseList1(head.next);
            head.next.next = head;
            head.next = null;
        }
        return newnode;
    }
    //采用头插法
    public ListNode ReverseList(ListNode head) {
        ListNode p = new ListNode(-1);
        p.next = null;
        ListNode tnode = head;
        while( tnode != null){
            head = head.next;
            tnode.next = p.next;
            p.next = tnode;
            tnode = head;
        }
        return p.next;
    }

}