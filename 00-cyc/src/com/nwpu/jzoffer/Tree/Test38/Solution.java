package com.nwpu.jzoffer.Tree.Test38;

/**
 * @Author: ch
 * @Description:
 * 平衡二叉树
 * @Date: Created in 20:25 2021/9/13
 * @Modified By:
 */
public class Solution {
    private  boolean isBalance = true;
    public boolean IsBalanced_Solution(TreeNode root) {
       inorder(root);
       return isBalance;
    }

    private int inorder(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l  = inorder(root.left) + 1;
        int r  = inorder(root.right) + 1;
        if(Math.abs(l-r)>1){
            isBalance = false;
        }
        return Math.max(l,r);
    }

}
