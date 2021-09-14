package com.nwpu.jzoffer.Tree.Test29;

/**
 * @Author: ch
 * @Description: 判断树是否是对称的
 * @Date: Created in 21:45 2021/9/9
 * @Modified By:
 */
public class Solution {

    boolean isSymmetrical( TreeNode pRoot) {
        if( pRoot == null){
            return  true;
        }
        return isSymmetrical(pRoot.left,pRoot.right);

    }

    private boolean isSymmetrical(TreeNode left, TreeNode right) {
        if( left == null && right == null){
            return true;
        }
        if( left == null || right == null){
            return false;
        }
        if( left.val != right.val){
            return false;
        }
        return isSymmetrical(left.left,right.right) && isSymmetrical(left.right,right.left);
    }


//    boolean isSymmetrical( TreeNode pRoot) {
//        if( pRoot == null){
//            return true;
//        }
//        return isSymmetrical( pRoot.left , pRoot.right );
//
//    }
//
//    private boolean isSymmetrical(TreeNode left, TreeNode right) {
//        if( left == null && right == null){
//            return true;
//        }
//        if( left != null || right != null){
//            return false;
//        }
//        if( left.val == right.val){
//            return  isSymmetrical(left.left,right.right) && isSymmetrical(left.right,right.left);
//        }
//        return false;
//    }

}
