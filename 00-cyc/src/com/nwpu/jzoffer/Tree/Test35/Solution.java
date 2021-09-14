package com.nwpu.jzoffer.Tree.Test35;

import sun.reflect.generics.tree.Tree;

/**
 * @Author: ch
 * @Description:
 *  序列化二叉树
 *
 * @Date: Created in 18:44 2021/9/13
 * @Modified By:
 */
public class Solution {

    String str;
    String Serialize(TreeNode root) {
        if(root == null)
            return "#";
        return root.val + " " + Serialize(root.left) + " " + Serialize(root.right);
    }

    TreeNode Deserialize(String s) {
        str = s;
        return Deserialize1();
    }

    /*
        总体思想：用一个全局变量保存要分解的str，因为递归调用时，会改变str的值从而影响到下一次递归调用
        具体步骤：
        序列化树：
        采用先序遍历的方法，用字符串保留下来
        字符串反序列化树：
        采用字符串分割的方法，获取第一个，第一个给root
        在递归，序列化序列函数，并返回给相应的root的左节点
        再递归，调用序列化函数，并返回给相应的root的右节点。
        返回 root
     */
    private TreeNode Deserialize1() {
        if(str.length() == 0){
            return null;
        }
        int index = str.indexOf(" ");
        String node  = "";

        //标识已经没有" "，只剩下一个符号
        if(index != -1){
            node = str.substring(0,index);
            str = str.substring(index+1);
        }else
        {
            node = str;
        }

        if(node.equals("#")){
            return null;
        }

        int val = Integer.valueOf(node);

        TreeNode t = new TreeNode(val);
        t.left = Deserialize(str);
        t.right = Deserialize(str);
        return t;
    }

    public static void main(String[] args) {
        System.out.println(1+1);
    }
}
