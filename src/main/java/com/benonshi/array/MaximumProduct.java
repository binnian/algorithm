package com.benonshi.array;

import java.util.Arrays;

/**
 * 三个数的最大乘积
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * @Author: BenOnSHI
 * @Date: 2021/1/20 10:53
 **/
public class MaximumProduct {

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        return Math.max((nums[0] * nums[1] * nums[n]),
                (nums[n] * nums[n - 1] * nums[n - 2]));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int i = maximumProduct(nums);
        System.out.println(i);
    }
}
