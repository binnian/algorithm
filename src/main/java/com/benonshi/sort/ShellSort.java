package com.benonshi.sort;

/**
 * @author BenOniShi
 * @date 2020/5/9 21:09
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 18, 1, 65, 2, 7, 14, 55, 3};

        int h = 1;
        while (h < arr.length / 3) h = h * 3 + 1;

        while (h > 0) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j > h - 1; j -= h) {
                    if (arr[j] < arr[j - h]) SortUtils.swap(arr, j, j - h);
                }
            }
            h = (h - 1) / 3;
        }


        SortUtils.print(arr);
    }
}
