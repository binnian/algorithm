package com.benonshi;

import java.util.*;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 来源：力扣（LeetCode）
 * 链接： https://leetcode-cn.com/problems/longest-common-prefix/
 *
 * @author BenOniShi
 * @date 2020/3/9 17:28
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length() && j < ans.length(); j++) {
                if (strs[i].charAt(j) != ans.charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0, j);

            if (ans.equals("")) {
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = longestCommonPrefix(new String[]{"flow", "fl", "f"});
        System.out.println(s);
        Map<Integer, Integer> map = new HashMap();

    }
}
