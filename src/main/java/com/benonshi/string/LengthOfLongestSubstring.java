package com.benonshi.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @author BenOniShi
 * @date 2020/3/9 16:48
 */
public class LengthOfLongestSubstring {
    /**
     * 滑动窗口解法
     */
    public static int lengthOfLongestSubstring(String s) {

        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            // 获取当前位置字符
            char alpha = s.charAt(end);
            // 如果map 包含这个key
            if (map.containsKey(alpha)) {
                //end - start 区间有相同字符  获取 当前字符的value 更新start
                start = Math.max(map.get(alpha), start);
            }
            // 更新结果
            ans = Math.max(ans, end - start + 1);
            // 每次将 当前当前位置的 字符放入map中
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abccabcdsgb"));
    }

}
