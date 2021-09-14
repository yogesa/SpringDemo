package com.nwpu.jzoffer.LinkList;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 21:16 2021/9/2
 * @Modified By:
 */
public class MyPrintLinkUtil{
    public static void printListNode(ListNode listnode){
        while (listnode != null){
            System.out.print(listnode.val + " ");
            listnode = listnode.next;
        }
    }
}
