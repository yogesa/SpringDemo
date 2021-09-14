package com.nwpu.jzoffer.Tree.Test26;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 19:38 2021/9/9
 * @Modified By:
 */
public class TreeLinkNode {

    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null; // 指向父结点的指针

    TreeLinkNode(int val) {
        this.val = val;
    }
}