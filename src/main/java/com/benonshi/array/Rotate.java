package com.benonshi.array;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 189. 旋转数组
 * 来源: leetcode
 * 链接: https://leetcode-cn.com/problems/rotate-array/
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/9 10:54
 **/
public class Rotate {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // 反转一遍数组
        reverse(nums, 0, nums.length - 1);
        // k个位置  反转
        reverse(nums, 0, k - 1);
        // k到结尾位置反转
        reverse(nums, k + 1, nums.length - 1);
    }

    public static void reverse(int[] nums, int lo, int hi) {
        if (lo < hi) {
            int temp = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = temp;
            reverse(nums, ++lo, --hi);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 2);
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
