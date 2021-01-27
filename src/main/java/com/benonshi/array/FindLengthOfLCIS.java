package com.benonshi.array;


/**
 * 最长连续递增序列
 * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
 * 连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，
 * 那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence
 * @Author: BenOnSHI
 * @Date: 2021/1/24 10:55
 **/
public class FindLengthOfLCIS {
    public static int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int left = 0;
        int ans = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] < nums[i]) {
                ans = Math.max(ans, i - left + 1);
            } else {
                left = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,2,2,2,2};
        int lengthOfLCIS = findLengthOfLCIS(nums);
        System.out.println(lengthOfLCIS);
    }
}
