package com.nwpu.LinkList.Test8;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:18 2021/9/6
 * @Modified By:
 */
public class Solution {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null)
            return null;
        // 插入新节点
        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }
        // 建立 random 链接
        cur = pHead;
        while (cur != null) {
            RandomListNode clone = cur.next;
        //   if (cur.random != null)
                clone.random = cur.random.next;
            cur = clone.next;
        }
        // 拆分
        cur = pHead;
        RandomListNode pCloneHead = pHead.next;
        while (cur != null) {
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next.next;
        }
        return pCloneHead;
    }
    public static void main(String[] args) {


    }
}
