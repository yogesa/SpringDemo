package com.nwpu.jzoffer.Tree.Test37;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:17 2021/9/13
 * @Modified By:
 */

/**
 *  用一个全局遍历递归
 */
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = TreeDepth(root.left) + 1;
        int r = TreeDepth(root.right) + 1;
        return  l>r? l:r;
    }
}
