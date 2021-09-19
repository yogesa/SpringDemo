package com.nwpu.jzoffer.Search.Test44;

/**
 * @Author: ch
 * @Description:
 * 回溯 + DFS + BFS
 * @Date: Created in 20:49 2021/9/15
 * @Modified By:
 */
public class Solution {
    public char[][] matrixs;
    public String words;
    public boolean hasPath (char[][] matrix, String word) {
        matrixs = matrix;
        words = word;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int k) {
        if (i < 0 || i > matrixs[0].length-1 || j < 0 || j > matrixs.length-1 || matrixs[i][j]!= words.charAt(k)){
            return false;
        }
        if (k == words.length()-1) {
            return true;
        }
        char c = matrixs[i][j];
        matrixs[i][j] = 0;
        boolean ret = dfs(i-1,j,k+1) || dfs(i,j - 1,k + 1) || dfs(i+1,j,k+1) || dfs(i,j+1,k+1);
        matrixs[i][j] = c;
        return ret;
    }
}
