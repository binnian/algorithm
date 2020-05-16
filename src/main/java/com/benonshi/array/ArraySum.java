package com.benonshi.array;


/**
 * 数组所有位置之和
 *
 * @author BenOniShi
 * @date 2020/3/25 18:43
 */
public class ArraySum {

    public static int sum(int[] arr, int n) {
        return n < 1 ? 0 : arr[n - 1] + sum(arr, n - 1);
    }


    public static int sum(int[] arr, int lo, int hi) {
        if (lo == hi) return arr[lo];
        int mid = (lo + hi) >> 1;
        return sum(arr, lo, mid) + sum(arr, mid + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 8, 11, 21, 36};
        System.out.println(sum(arr, 0, arr.length - 1));
        System.out.println(sum(arr, arr.length));
    }

}
