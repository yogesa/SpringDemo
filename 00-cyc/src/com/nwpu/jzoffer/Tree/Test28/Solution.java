package com.nwpu.jzoffer.Tree.Test28;

/**
 * @Author: ch
 * @Description: 二叉树的镜像
 *                  操作给定的二叉树，将其变换为源二叉树的镜像
 * @Date: Created in 21:23 2021/9/9
 * @Modified By:
 */
public class Solution {

    public TreeNode Mirror (TreeNode pRoot) {
        if( pRoot == null){
            return pRoot;
        }
        TreeNode node = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = node ;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
   }



    /*
    public TreeNode Mirror (TreeNode pRoot) {
        if( pRoot == null)
            return pRoot;
        TreeNode node = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = node;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
    */
}
