package com.benonshi.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 和相同的二元子数组
 * 给你一个二元数组 nums ，和一个整数 goal ，请你统计并返回有多少个和为 goal 的 非空 子数组。
 * <p>
 * 子数组 是数组的一段连续部分。
 */
public class NumSubArraysWithSum {

    public int numSubArraysWithSum(int[] nums, int goal) {
        int res = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        // 若 sum(i,j)区间和为goal ze sum(j) - sum(i) =  goal
        for (int num : nums) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            //前缀累加和
            sum += num;
            // 累加结果
            res += map.getOrDefault(sum - goal, 0);
        }
        return res;
    }
}
