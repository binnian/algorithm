package com.benonshi;

/**
 * 插入排序
 *
 * @author BenOniShi
 * @date 2020/3/8 23:46
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 1, 7, 3, 8};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
