package com.nwpu.jzoffer.Tree.Test33;

/**
 * @Author: ch
 * @Description:
 * 搜索二叉树特点，最后一个节点一定比左边子树的所有节点都要小，比右边子树的所有节点都要大
 *
 * @Date: Created in 20:49 2021/9/11
 * @Modified By:
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0){
            return false;
        }
        return Judge(sequence,0,sequence.length - 1);
    }

    private boolean Judge(int[] sequence, int left, int right) {
            if( left == right){
                return true;
            }
            int a = left;
            while(sequence[a] < sequence[right]){
                a++;
            }
            for(int i = a ; i < right ;i++){
                if(sequence[i] > sequence[right]){
                    return false;
                }
            }
        return Judge(sequence,left,a-1) && Judge(sequence , a,right-1);
    }

}
