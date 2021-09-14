package com.nwpu.jzoffer.Tree.Test39;

/**
 * @Author: ch
 * @Description:
 *  * 树是二叉查找树
 * @Date: Created in 20:51 2021/9/13
 * @Modified By:
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }
        if(root.val < p.val && root.val < q.val){
           return lowestCommonAncestor(root.right,p,q);
        }
        if(root.val > p.val && root.val > q.val){
            return  lowestCommonAncestor(root.left,p,q);
        }
        return  root;
    }
}
