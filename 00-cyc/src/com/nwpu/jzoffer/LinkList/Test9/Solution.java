package com.nwpu.jzoffer.LinkList.Test9;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:25 2021/9/7
 * @Modified By:
 */
public class Solution {
    public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while( l1 != l2){
            l1 = (l1 == null)?pHead2:l1.next;
            l2 = (l2 == null)?pHead1:l2.next;
        }
        return  l1;

    }
}
