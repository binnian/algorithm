package com.benonshi.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别 正好是 1 。
 *
 * 现在，给你一个整数数组 nums ，请你在所有可能的子序列中找到最长的和谐子序列的长度。
 *
 * 数组的子序列是一个由数组派生出来的序列，它可以通过删除一些元素或不删除元素、且不改变其余元素的顺序而得到。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-harmonious-subsequence
 * @Author: BenOnSHI
 * @Date: 2021/4/2 10:22
 **/
public class FindLHS {

    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        var ans = new Object() {
            int ans = 0;
        };
        map.forEach((k, v) -> {
            if (map.containsKey(k + 1)) {
                ans.ans = Math.max(ans.ans, v + map.get(k + 1));
            }
            if (map.containsKey(k - 1)) {
                ans.ans = Math.max(ans.ans, v + map.get(k - 1));
            }
        });
        return ans.ans;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
        int lhs = findLHS(nums);
        System.out.println(lhs);
    }
}
