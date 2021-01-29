package com.benonshi.array;

/**
 * 寻找数组的中心索引
 * 给你一个整数数组nums，请编写一个能够返回数组 “中心索引” 的方法。
 * 数组 中心索引 是数组的一个索引，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心索引，返回 -1 。如果数组有多个中心索引，应该返回最靠近左边的那一个。
 * 注意：中心索引可能出现在数组的两端。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-pivot-index
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/29 11:06
 **/
public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < len; i++) {
            leftSum += nums[i];
            if (leftSum == sum) {
                return i;
            }
            sum -= nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1,1,1,0,0};
        int i = pivotIndex(nums);
        System.out.println(i);
    }
}
