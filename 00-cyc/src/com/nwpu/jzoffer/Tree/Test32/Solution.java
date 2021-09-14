package com.nwpu.jzoffer.Tree.Test32;

import java.util.*;

/**
 * @Author: ch
 * @Description:
 * 按之字形顺序打印二叉树
 * 给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）
 * @Date: Created in 20:18 2021/9/11
 * @Modified By:
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>>  arrayLists =  new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int layer = 0;
        while(!queue.isEmpty()){
            int count  =  queue.size();
            layer++;
            while (count-- > 0){
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                queue.add(treeNode.left);
                queue.add(treeNode.right);
            }
            if(list.size() != 0){
                if( layer % 2 == 0){
                    Collections.reverse(list);
                }
                arrayLists.add(list);
            }
        }
        return arrayLists;
    }
}
