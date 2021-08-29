package com.nwpu.Array.Test15;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:22 2021/8/28
 * @Modified By:
 */
public class Solution {
    public String ReverseSentence(String str) {
        String[] s = str.split(" ");
        String stemp;
        for (int i = 0; i < (s.length/2); i++) {
            stemp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = stemp;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i <s.length ; i++){
            sb.append(s[i]);
            if(i != s.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().ReverseSentence("\"nowcoder. a am I\""));
    }
}
