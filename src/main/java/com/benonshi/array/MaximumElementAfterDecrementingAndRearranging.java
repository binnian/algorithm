package com.benonshi.array;

import java.util.Arrays;

/**
 * 减小和重新排列数组后的最大元素
 * 给你一个正整数数组arr。请你对 arr执行一些操作（也可以不进行任何操作），使得数组满足以下条件：
 * <p>
 * arr中 第一个元素必须为1。
 * 任意相邻两个元素的差的绝对值 小于等于1，也就是说，对于任意的 1 <= i < arr.length（数组下标从 0 开始），
 * 都满足abs(arr[i] - arr[i - 1]) <= 1。abs(x)为x的绝对值。
 * 你可以执行以下 2 种操作任意次：
 * <p>
 * 减小 arr中任意元素的值，使其变为一个 更小的正整数。
 * 重新排列arr中的元素，你可以以任意顺序重新排列。
 * 请你返回执行以上操作后，在满足前文所述的条件下，arr中可能的 最大值。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-element-after-decreasing-and-rearranging
 */
public class MaximumElementAfterDecrementingAndRearranging {
    public int maximumElementAfterDecrementingAndRearranging1(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            // 将arr[i] 更新为 (i,i-1) 位置最小的数
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }
        return arr[len - 1];
    }

    public int maximumElementAfterDecrementingAndRearranging2(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            //贪心
            if (arr[i] - arr[i - 1] > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr[len - 1];
    }
}
