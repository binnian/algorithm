package com.benonshi.sort;

/**
 * 计数排序
 *
 * @author BenOniShi
 * @date 2020/5/19 1:23
 */
public class CountSort {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 10, 12, 12, 9, 9, 9, 9};
        int[] sort = sort(arr);
        SortUtils.print(sort);
    }


    public static int[] sort(int[] arr) {
        // 返回结果数组
        int[] result = new int[arr.length];
        // 计数数组
        int[] count = new int[24];
        // 遍历原数组
        for (int i = 0; i < arr.length; i++) {
            // arr[i]即 计数数组的下标位置  每找到一个  计数数组对应的下标位置的的值+1
            count[arr[i]]++;
        }
        //
        for (int i = 0, j = 0; i < count.length; i++) {
            // 如果计数数组 i 位置的值 大于 0  结果数组j 位置就 = i
            while (count[i]-- > 0) result[j++] = i;
        }
        return result;
    }
}
