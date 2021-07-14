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
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0, sum = 0;
        for (int num : nums) {
            //设置前缀和并更新次数
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            sum += num;
            res += map.getOrDefault(sum - goal, 0);
        }
        return res;
    }
}
