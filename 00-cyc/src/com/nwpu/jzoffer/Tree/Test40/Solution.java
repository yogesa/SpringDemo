package com.nwpu.jzoffer.Tree.Test40;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 19:37 2021/9/14
 * @Modified By:
 */

/**
 *  求最近公共祖先ef
 *
 *  返回的是最近公共祖先
 *  递归返回的是
 *  求递归一棵树，root为空，说明这颗树没有p,q结点
 *  若root不为空，找到了q,p,即root == q ，root == p
 *  若左子树没有找到，右子树找到了，那直接返回左子树的根
 *  若右子树没有找到，左子树找到了，那直接返回右子树的根
 *  若两个都找到了，返回root
 */

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left == null) return right;
        if(right == null) return left;
        return  root;
    }
}
