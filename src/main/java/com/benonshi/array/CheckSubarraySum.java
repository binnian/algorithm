package com.benonshi.array;


import java.util.HashMap;
import java.util.Map;

/**
 * 连续的子数组和
 * 给你一个整数数组 nums 和一个整数k ，编写一个函数来判断该数组是否含有同时满足下述条件的连续子数组：
 * <p>
 * 子数组大小 至少为 2 ，且
 * 子数组元素总和为 k 的倍数。
 * 如果存在，返回 true ；否则，返回 false 。
 * <p>
 * 如果存在一个整数 n ，令整数 x 符合 x = n * k ，则称 x 是 k 的一个倍数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/continuous-subarray-sum
 */
public class CheckSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>(len << 1);
        map.put(0, -1);
        for (int i = 0; i < len; i++) {
            int m = (sum + nums[i]) % k;
            Integer v = map.get(m);
            if (v != null) {
                if (i - v > 1) {
                    return true;
                }
            } else {
                map.put(m, i);
            }
            sum = m;
        }
        return false;
    }
}
