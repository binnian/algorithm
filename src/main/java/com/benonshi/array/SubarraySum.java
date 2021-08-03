package com.benonshi.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 和为K的子数组
 * 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/24 12:16
 **/
public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        int res = 0;
        int sum = 0;
        // key 为 和  value 子数组的个数
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            //每个元素对应一个“前缀和”
            //遍历数组，根据当前“前缀和”，在 map 中寻找「与之相减 == k」的历史前缀和
            //当前“前缀和”与历史前缀和，差分出一个子数组，该历史前缀和出现过 n 次，
            //等价于当前项找到 n 个子数组求和等于 k。
            //遍历过程中，n 不断加给 res，最后返回 res
            sum += num;
            if (map.containsKey(sum - k)) {
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1};
        int i = subarraySum(nums, 1);
        System.out.println(i);
    }
}
