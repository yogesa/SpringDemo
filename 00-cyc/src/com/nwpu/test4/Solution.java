package com.nwpu.test4;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static ArrayList<Integer>  printMatrix(int[][] a){
        // 0 1 2 3
        ArrayList<Integer> list = new ArrayList<>();
        int r1 = 0;
        int r2 = a.length-1;
        int c1= 0;
        int c2 = a[0].length-1;
        while (r1 <= r2 && c1 <= c2){
            for (int i = c1; i <= c2; i++) {
                list.add(a[r1][i]);
            }
            for (int j = r1+1; j <= r2; j++) {
                System.out.println(a[j][c2]);
                list.add(a[j][c2]);
            }
            if(r1 != r2)
                for (int i = c2-1; i >=c1 ; i--) {
                    list.add(a[r2][i]);
                }
            if(c1 != c2)
                for (int i = r2-1; i >r1 ; i--) {
                    list.add(a[i][c1]);
                }

            r1++;
            r2--;
            c1++;
            c2--;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] a= {{0},{1},{2},{3}};
        System.out.println(printMatrix(a));
    }
}
