package com.benonshi.string;



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
        // 设置ans 为数组第一个字符串
        String ans = strs[0];
        // 外层循环循环数组每一个位置
        for (int i = 1; i < strs.length; i++) {
            // 内层循环比较每一个字符串的字符是否相等
            int j = 0;
            // 如果j < ans.length   && < 外层循环控制的每一个字符串长度
            for (; j < strs[i].length() && j < ans.length(); j++) {
                // 如果当前比较的字符串不相等
                if (strs[i].charAt(j) != ans.charAt(j)) {
                    // 退出循环
                    break;
                }
            }
            // ans 为 当前字符串 0 开始到 j 的位置
            ans = ans.substring(0, j);
            // 如果比较完之后 ans为空  则直接返回ans
            if (ans.equals("")) {
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("longestCommonPrefix(new String[]{\"flow\", \"fl\", \"f\"}) = "
                + longestCommonPrefix(new String[]{"flow", "fl", "f"}));
    }
}
