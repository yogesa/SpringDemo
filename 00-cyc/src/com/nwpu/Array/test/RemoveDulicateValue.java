package com.nwpu.Array.test;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDulicateValue {
    @Test
    public void test(){
        int[] a = {2,3,1,0,2,5};
        System.out.println(Dulicate1(a));
    }
    public int Dulicate(int[] a){
        for (int i = 0; i < a.length; i++) {
            while (a[i] != i){
                if(a[i] == a[a[i]])
                    return a[i];
                Reverse(a,i,a[i]);
            }
        }
        return -1;
    }
        public void Reverse(int[] a,int i,int j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        public int Dulicate1(int[] a){
            Set s = new HashSet();
            for (int i = 0; i < a.length; i++) {
                if(!s.add(a[i]))
                    return a[i];
            }
            return -1;
        }



}
