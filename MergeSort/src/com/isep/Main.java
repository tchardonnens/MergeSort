package com.isep;

import java.util.Vector;
import MergeSort.MergeSort;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        for(int i = 0; i < 6; i++){
            v.add(2*i);
        }
        for(int i = 0; i < 10; i++){
            w.add(2*i + 1);
        }
        System.out.println("v = " + v);
        System.out.println("w = " + w);
        System.out.println("res = " + MergeSort.mergeSort(v, w));
    }
}
