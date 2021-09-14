package com.nwpu.jzoffer.Tree.Test27;

/**
 * @Author: ch
 * @Description: 判断 B 是否为 A 的子结构
 * @Date: Created in 20:28 2021/9/9
 * @Modified By:
 */
public class Solution {

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if ( root1 == null || root2 == null) {
            return false;
        }
        if( root1.val == root2.val){
            if( Judge(root1,root2)){
                return true;
            }
        }
        return HasSubtree(root1.left,root2) || HasSubtree(root1.right , root2);
    }

    public boolean Judge(TreeNode tree1 , TreeNode tree2){
        if( tree2 == null){
            return true;
        }
        if( tree1 == null){
            return false;
        }
        if( tree1.val == tree2.val){
            return Judge(tree1.left,tree2.left) && Judge(tree1.right,tree2.right);
        }
        return  false;
    }
//    public boolean HasSubtree(TreeNode root1,TreeNode root2){
//        //任何一颗子树为空，返回false
//        if( root2 == null || root1 == null ){
//            return false;
//        }
//        //若两个根相等
//        if( root1.val == root2.val){
//            if( Judge(root1,root2) ){
//                return true;
//            }
//        }
//        //若两个根不等
//        return HasSubtree(root1.left,root2) || HasSubtree( root1.right , root2) ;
//    }

//    public boolean Judge(TreeNode tree1,TreeNode tree2) {
//
//        //若判断到 tree2 为空，说明 tree2 判断结束
//        if( tree2 == null){
//            return true;
//        }
//
//        //若 tree2 不空， tree1 已经为空时，返回false
//        if( tree1 == null){
//            return  false;
//        }
//        //下面的要求比较严格，能够判断出，根相同时，以根为节点的树是否相同
//        if( tree1.val == tree2.val ){
//            return  Judge( tree1.left , tree2.left) && Judge( tree1.right ,tree2.right);
//        }
//
//        return false;
//    }
//}
}
