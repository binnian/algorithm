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

    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 8, 11, 21, 36};
        System.out.println(sum(arr, arr.length));
    }

}
