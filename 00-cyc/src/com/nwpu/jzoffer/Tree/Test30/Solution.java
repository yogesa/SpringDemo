package com.nwpu.jzoffer.Tree.Test30;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: ch
 * @Description:
 * 从上往下打印二叉树
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * algorithm :
 * 将树的根节点入队，若队列不为空，队列大小--，出队，若为空跳出这次操作，否则，加入数组，并且左右孩子入队
 * @Date: Created in 15:56 2021/9/11
 * @Modified By:
 */
public class Solution {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode>  queue = new LinkedList<>();
        queue.add(root);
        while ( !queue.isEmpty())
        {
            TreeNode t = queue.poll();
            if(t == null){
               continue;
            }
            list.add(t.val);
            queue.add(t.left);
            queue.add(t.right);
        }
         return list;

    }

}
