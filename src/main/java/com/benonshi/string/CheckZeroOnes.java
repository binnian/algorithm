package com.benonshi.string;

/**
 * 5763. 哪种连续子字符串更长
 * 给你一个二进制字符串 s 。如果字符串中由 1 组成的 最长 连续子字符串 严格长于 由 0 组成的 最长 连续子字符串，返回 true ；否则，返回 false 。
 * <p>
 * 例如，s = "110100010" 中，由 1 组成的最长连续子字符串的长度是 2 ，由 0 组成的最长连续子字符串的长度是 3 。
 * 注意，如果字符串中不存在 0 ，此时认为由 0 组成的最长连续子字符串的长度是 0 。字符串中不存在 1 的情况也适用此规则。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longer-contiguous-segments-of-ones-than-zeros
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/23 13:04
 **/
public class CheckZeroOnes {
    public boolean checkZeroOnes(String s) {
        int len = s.length();
        int ans1 = 0;
        int ans0 = 0;
        int result1 = 0;
        int result0 = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '1') {
                ans0 = 0;
                ans1++;
                result1 = Math.max(ans1, result1);
            } else {
                ans1 = 0;
                ans0++;
                result0 = Math.max(ans0, result0);
            }

        }
        return result1 > result0;
    }
}
