package com.nwpu.Test10;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时间：116ms
 * 超过12.15% 用Java提交的代码
 * 占用内存：14780KB
 * 超过18.04%用Java提交的代码
 */
public class Solution {

    List<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        int len = list.size();
        list.sort((a,b)->{
            return  a - b ;
        });
        if(len % 2 == 0){
            double d = list.get((len-1)/2)+list.get(len/2);
            return  d/2;
        }else
            return (double)list.get(len/2);
    }
    public static void main(String[] args) {
        int[] input = {5,2,3,4,1,6,7,0};
        Solution ob = new Solution();
        for (int i:input) {
            ob.Insert(i);
        }
        System.out.println(ob.GetMedian());

    }
}
