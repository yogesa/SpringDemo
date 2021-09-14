package com.nwpu.jzoffer.LinkList.Test3;

/**
 * 删除重复的节点，有相同的全部删除
 */
public class Solution {

    //保留第一个重复的节点
    public ListNode deleteDuplication(ListNode pHead) {
        if( pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode next = pHead.next;
        if( pHead.val == next.val ){
            while ( next != null && pHead.val == next.val ){
                next = next.next;
            }
            return deleteDuplication(pHead.next);
        }else {
             pHead.next = deleteDuplication(pHead.next);
             return pHead;
        }
    }

    //删除所有重复的节点 1 2 2 2 3 3 5 -> 1 5
    public ListNode deleteDuplication1(ListNode pHead) {
        if( pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode next = pHead.next;
        //若有重复的，先删除除了第一个重复的
        if( pHead.val == next.val ){
            while ( next != null && pHead.val == next.val ){
                next = next.next;
            }
            //删除重复值的第一个元素
            pHead.val = next.val;
            pHead.next = next.next;

            return deleteDuplication1(pHead);
        }else {
            pHead.next = deleteDuplication1(pHead.next);
            return pHead;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(2);

        listNode.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next.next= new ListNode(5);

        ListNode head = new Solution().deleteDuplication1(listNode);

        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    public  static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
}
