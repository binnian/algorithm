package com.benonshi.array;

/**
 * 非递减数列
 * 给你一个长度为n的整数数组，请你判断在 最多 改变1 个元素的情况下，该数组能否变成一个非递减数列。
 *
 * 我们是这样定义一个非递减数列的：对于数组中所有的i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/non-decreasing-array
 * @Author: BenOnSHI
 * @Date: 2021/2/7 10:41
 **/
public class CheckPossibility {
    public static boolean checkPossibility(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                }
            }
        }
        return count < 2;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,3,5};
        boolean b = checkPossibility(nums);
        System.out.println(b);
    }
}
