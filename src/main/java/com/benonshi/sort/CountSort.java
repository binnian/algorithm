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
            //   要排序的数组的值是计数数组的小标  计数数组下标对应的值从0开始
            //   每找到一个同样的值  计数数组下标对应的值进行 +1 操作
            //   如 arr[0] 的值 是 9   则计数数组 count[9] 位置的值则为 1 每找到一个 对应计数数组的值则+1
            count[arr[i]]++;
        }
        //  遍历count 数组   两个变量i 和  j
        for (int i = 0, j = 0; i < count.length; i++) {
            // 如果计数数组 i 位置的值 大于 0  结果数组j 位置就 = i
            while (count[i]-- > 0) result[j++] = i;
        }
        return result;
    }
}
