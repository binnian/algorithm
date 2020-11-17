package com.benonshi.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 *
 * @author BenOniShi
 * @date 2020/3/9 16:48
 */
public class LengthOfLongestSubstring {
    /**
     * 滑动窗口解法
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            // end 开始
            char alpha = s.charAt(end);
            // 如果map 包含这个key
            if (map.containsKey(alpha)) {
                //
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

}
