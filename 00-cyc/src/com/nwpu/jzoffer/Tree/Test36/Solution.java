package com.nwpu.jzoffer.Tree.Test36;

/**
 * @Author: ch
 * @Description:
 *  二叉查找树的第 K 个结点
 * @Date: Created in 20:03 2021/9/13
 * @Modified By:
 */

/**
 * 算法总体思路：
 *  用一个全局变量 cnt 记录，到了 k 时 ，就把它返回
 *  递归
 *  当 root 为空
 *      return；
 *  递归遍历左子树
 *  处理
 *  递归遍历有子树
 */
public class Solution {
    private TreeNode ret;
    private int cnt = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        inorder(pRoot,k);
        return  ret;
    }

    private void inorder(TreeNode pRoot,int k) {
        if(pRoot == null){
            return;
        }
        inorder(pRoot.left,k);
        cnt++;
        if(cnt == k){
            ret = pRoot;
        }
        inorder(pRoot.right,k);
    }
}
