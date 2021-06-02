package com.benonshi.string;

import java.util.*;

/**
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 *
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
            // key 为 当前字符   value  当前字符长度
            map.put(alpha, end + 1);
        }
        return ans;
    }

    public static int lengthOfLongestSubstring2(String s) {
        // 创建一个双端队列
        Deque<Character> deque = new LinkedList<>();
        char[] chars = s.toCharArray();
        int ans = 0;
        for (char aChar : chars) {
            // 如果 队列中有当前字符
            while (deque.contains(aChar)) {
                // 不断移除队列头部元素
                deque.poll();
            }
            // 将当前字符插入
            deque.add(aChar);
            // 获取最大值 （可以认为移除之前 与 移除之后）
            ans = Math.max(deque.size(), ans);
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcc"));
    }

}
