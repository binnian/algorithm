package com.benonshi.array;

/**
 * 子数组最大平均数 I
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 *
 * @Author: BenOnSHI
 * @Date: 2021/2/6 11:46
 **/
public class FindMaxAverage {

    public static double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        int left = 0;
        for (int i = k; i < len ; i++) {
            sum = sum-nums[left++] + nums[i++];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum*1.0 / k;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 123, 5};
        double maxAverage = findMaxAverage(nums, 2);
        System.out.println(maxAverage);
    }

}
