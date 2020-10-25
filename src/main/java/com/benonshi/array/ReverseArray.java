package com.benonshi.array;

/**
 * 反转数组
 * @author BenOniShi
 * @date 2020/3/25 19:23
 */
public class ReverseArray {

    public static void reverse(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            reverse(arr, ++lo, --hi);
        }
    }

    public static void reverse(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        reverse(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
