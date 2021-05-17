package com.benonshi.array;

/**
 * 421. 数组中两个数的最大异或值
 * 给你一个整数数组 nums ，返回 nums[i] XOR nums[j] 的最大运算结果，其中 0 ≤ i ≤ j < n 。
 * <p>
 * 进阶：你可以在 O(n) 的时间解决这个问题吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-xor-of-two-numbers-in-an-array
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/16 11:02
 **/
public class FindMaximumXOR {

    public int findMaximumXOR(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                temp = Math.max(nums[i] ^ nums[j], temp);
            }
        }
        return temp;
    }
}
