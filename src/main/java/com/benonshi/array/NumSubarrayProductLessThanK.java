package com.benonshi.array;

/**
 * 乘积小于K的子数组
 * 给定一个正整数数组 nums。
 * <p>
 * 找出该数组内乘积小于 k 的连续的子数组的个数。
 *
 * @Author: BenOnSHI
 * @Date: 2021/2/27 10:55
 **/
public class NumSubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0 || k == 1) {
            return 0;
        }
        // 左指针  乘积累积  结果
        int left = 0, product = 1, ans = 0;
        // 右指针
        for (int i = 0; i < nums.length; i++) {
            // 乘积
            product *= nums[i];
            // 如果大于k
            while (product >= k) {
                // left 右移一位
                product /= nums[left++];
            }
            // 1+2+...+len-1+len个
            ans += i - left + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int i = numSubarrayProductLessThanK(new int[]{10,9,10,4,3,8,3,3,6,2,10,10,9,3},19);
        System.out.println(i);
    }

}
