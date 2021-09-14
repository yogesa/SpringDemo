package com.nwpu.jzoffer.Tree.Test31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: ch
 * @Description:
 * 把二叉树打印成多行
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 辅助二维数组,一维数组和队列
 * 第一步：根放入队列中
 * 第二步：当队列不空，并记录队列大小，
 * 第三步：当队列size大于0，size--
 *         出队一个，
 *         若为空，跳出本次循环
 *         否则
 *             加入一维数组，并将该节点的左右孩子入队
 * 结束第三步时，判断，若一维数组不空，将一维数组加入二维数组
 *
 * @Date: Created in 16:15 2021/9/11
 * @Modified By:
 */
public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int count = queue.size();
            while(count-- >0){
                TreeNode t = queue.poll();
                if(t == null){
                    continue;
                }
                list.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
            if(list.size() != 0){
                result.add(list);
            }
        }
        return result;
    }
}
