package com.benonshi.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 大餐计数
 * 大餐 是指 恰好包含两道不同餐品 的一餐，其美味程度之和等于 2 的幂。
 * <p>
 * 你可以搭配 任意 两道餐品做一顿大餐。
 * <p>
 * 给你一个整数数组 deliciousness ，其中 deliciousness[i] 是第 i 道餐品的美味程度，返回你可以用数组中的餐品做出的不同 大餐 的数量。结果需要对 109 + 7 取余。
 * <p>
 * 注意，只要餐品下标不同，就可以认为是不同的餐品，即便它们的美味程度相同。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-good-meals
 */
public class CountPairs {
    public int countPairs(int[] deliciousness) {
        final int MOD = 1000000007;
        int maxValue = 0;
        for (int i : deliciousness) {
            maxValue = Math.max(i, maxValue);
        }
        int maxSum = maxValue * 2;
        int pairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : deliciousness) {
            for (int sum = 1; sum <= maxSum; sum <<= 1) {
                // 计算当前出现元素配对的元素总和为2的幂的个数
                int count = map.getOrDefault(sum - val, 0);
                pairs = (pairs + count) % MOD;
            }
            // 存储元素出现次数
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return pairs;
    }
}
