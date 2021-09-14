package com.nwpu.jzoffer.Tree.Test25;


import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:30 2021/9/7
 * @Modified By:
 */
public class Solution {

    private Map<Integer , Integer> indexForRoot = new HashMap<>();
    //前序遍历的第一个值为根节点的值，使用这个值将中序遍历结果分为两部分，左部分为树的左子树中序遍历结果，右部分为树的中序遍历的结果。然后分别对左右子树递归地求解
    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {
        for (int i = 0; i < vin.length; i++)
            indexForRoot.put(vin[i],i);
       return reConstructBinaryTree(pre,0,pre.length-1, 0);
    }

    /**
     *
     * @param pre   代表先序遍历的数组
     * @param preL  代表先序遍历数组数组中，左子树的第一个节点
     * @param preR  代表先序遍历数组数组中，有子树的第一个节点
     * @param inL
     * @return
     */
    public TreeNode reConstructBinaryTree(int[] pre , int preL, int preR ,int inL){
        if( preL > preR)
            return  null;
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForRoot.get(root.val);
        int leftTreeSize = inIndex - inL;
        root.left = reConstructBinaryTree(pre,preL+1,preL+leftTreeSize,inL);
        root.right = reConstructBinaryTree(pre,preL+leftTreeSize+1,preR,inL + leftTreeSize + 1);
        return root;
    }
}
