package com.benonshi;

/**
 * @author BenOniShi
 * @date 2020/3/25 18:43
 */
public class ArraySum {

    public static int sum(int[] arr, int n) {
        return
                n < 1 ?
                        0 : sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(sum(arr, arr.length));
    }

}
