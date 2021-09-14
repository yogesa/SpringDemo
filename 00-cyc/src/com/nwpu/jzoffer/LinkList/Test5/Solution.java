package com.nwpu.jzoffer.LinkList.Test5;

import java.util.HashSet;

/**
 * 先找到第一个重复的，输出，
 *
 * @Author: ch
 * @Description:
 * @Date: Created in 19:42 2021/9/2
 * @Modified By:
 */
public class Solution {

    //方法一：第一遍遍历将所有节点放在set中，当元素不能放进set中时，说明了已经遍历到了入口
    public ListNode EntryNodeOfLoop1(ListNode pHead) {
        HashSet<ListNode> set = new HashSet<>();
        while(pHead != null){
            if (set.contains(pHead)){
                break;
            }
            set.add(pHead);
            pHead = pHead.next;
        }
        return pHead;
    }

    //快慢指针，fast与slow  通过计算路径关系，可以得出，当慢指针从起点出发，快指针从终点出发，它们一定会在入口相遇
    public ListNode EntryNodeOfLoop(ListNode pHead) {
       ListNode fast = pHead, slow = pHead;
       if(pHead == null || pHead.next == null){
           return null;
       }
       if(fast.next.next != null){
           do {
               fast = fast.next.next;
               slow = slow.next;
           }while (fast != slow && fast!=null );
       }else
           return null;

       slow = pHead;
       while (fast != slow){
           slow = slow.next;
           fast = fast.next;
       }
        return slow;
    }
    public static class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }
}
