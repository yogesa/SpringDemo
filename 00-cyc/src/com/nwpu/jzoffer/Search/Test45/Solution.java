package com.nwpu.jzoffer.Search.Test45;
/**
 * @Author: ch
 * @Description:
 * @Date: Created in 19:13 2021/9/16
 * @Modified By:
 */
public class Solution {
    boolean[][] visited;
    public int cnt;
    public int movingCount(int threshold, int rows, int cols) {
         visited = new boolean[rows][cols];
        dfs(0,0,rows,cols,threshold);
        return cnt;
    }

    private void dfs(int i, int j, int rows, int cols, int threshold) {
        //如果出界，就返回
        if( i < 0 || j < 0 || i >= rows || j >= cols) {
            return;
        }
        //如果[i][j]已经被访问过
        if (visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        int x = i , y = j;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        while (y > 0) {
            sum += y % 10;
            y /= 10;
        }
        if (sum <= threshold){
            cnt++;
        }else{
            return;
        }
        dfs(i - 1, j, rows, cols, threshold);
        dfs(i , j + 1, rows, cols, threshold);
        dfs(i + 1, j, rows, cols, threshold);
        dfs(i, j + 1, rows, cols, threshold);
    }
}
