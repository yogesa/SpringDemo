package com.nwpu.jzoffer.Array.test2;

public class Martrix {

    private boolean Solution(int[][] M,int target){
        if(M == null || M.length==0 || M[0].length ==0)
            return false;
        int r = 0;
        int c = M[0].length-1;
        int rowMax = M.length-1;
        do{
            if(M[r][c] == target){
                return true;
            }
            if(M[r][c]>target){
                c--;
            }
            else if(M[r][c]<target){
                r++;
            }
        }while(c>=0 && r <= rowMax);
        return false;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        System.out.println(new Martrix().Solution(a,46));
    }
}
