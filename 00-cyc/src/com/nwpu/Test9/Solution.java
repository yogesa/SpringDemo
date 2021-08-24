package com.nwpu.Test9;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }
    public static void main(String[] args) {

    }
}
