package com.benonshi.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 525. 连续数组
 * 给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 *
 * @author BenOniShi
 * @date 2021/6/3 22:40
 */
public class FindMaxLength {

    public int findMaxLength(int[] nums) {
        int len = nums.length;
        int sum = 0, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        //初始化
        map.put(0, -1);
        for (int i = 0; i < len; i++) {
            // 判断数组是否存在连续 0 1   0 （-1）  1 （+1）
            sum += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(sum)) {
                ans = Math.max(i - map.get(sum), ans);
            } else {
                map.put(sum, i);
            }
        }
        return ans;
    }
}
