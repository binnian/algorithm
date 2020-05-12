package com.benonshi.sort;

/**
 * @author BenOniShi
 * @date 2020/5/9 21:22
 */
public class SortUtils {


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void print(int[] arr) {
        for (int x : arr) {
            System.out.print( x+" ");
        }
    }

}
