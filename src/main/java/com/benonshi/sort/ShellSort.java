package com.benonshi.sort;

/**
 * @author BenOniShi
 * @date 2020/5/9 21:09
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 18, 1, 65, 2, 7, 14, 55, 3};
        //确定一个值
        int h = 1;
        while (h < arr.length / 3) h = h * 3 + 1;
        //
        while (h > 0) {
            //i 从 h 的位置开始  如果小于数组的长度 i++
            for (int i = h; i < arr.length; i++) {
                // j 从 i 的位置开始 j 大于 h - 1   j = j-h
                for (int j = i; j > h - 1; j -= h) {
                    // 如果 arr[j] 位置的值 小于 arr [j-h] 的值  做交换
                    if (arr[j] < arr[j - h]) SortUtils.swap(arr, j, j - h);
                }
            }
            // 循环完了之后  h 每次 -1 再 除3
            h = (h - 1) / 3;
        }


        SortUtils.print(arr);
    }
}
