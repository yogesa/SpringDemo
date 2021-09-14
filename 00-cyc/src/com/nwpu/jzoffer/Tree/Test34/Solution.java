package com.nwpu.jzoffer.Tree.Test34;

import java.util.ArrayList;

/**
 *[注]这道题很难，看不懂
 * @Author: ch
 * @Description:
 * 二叉树中和为某一值的路径
 * @Date: Created in 21:43 2021/9/11
 * @Modified By:
 */
public class Solution {

    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root,target,new ArrayList<>());
        return ret;
    }
    private void backtracking(TreeNode root, int target,ArrayList<Integer> path) {
        if(root == null){
            return;
        }
        path.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null){
            //要添加对象，而不能是引用，很重要！！！
            ret.add(new ArrayList<>(path));
        }
        else{
            backtracking(root.left,target,path);
            backtracking(root.right,target,path);
        }
        path.remove(path.size() - 1);
    }
}
