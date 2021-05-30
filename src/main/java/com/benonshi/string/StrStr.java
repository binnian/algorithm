package com.benonshi.string;

/**
 * 实现strStr()函数。
 * <p>
 * 给定一个haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/11 10:43
 **/
public class StrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }
        char first = needle.charAt(0);
        int max = haystack.length() - needle.length();
        for (int i = 0; i <= max; i++) {
            if (getChar(haystack, i) != first) {
                while (++i <= max && getChar(haystack, i) != first) ;
            }
            if (i <= max) {
                int j = i + 1;
                int end = j + needle.length() - 1;
                for (int k = 1; j < end; j++, k++) {
                    if (haystack.charAt(j) == needle.charAt(k)) ;
                }
                if (j == end) {
                    return i;
                }
            }

        }
        return -1;
    }

    private static char getChar(String haystack, int i) {
        return haystack.charAt(i);
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ll";
        int i = strStr(s1, s2);
        System.out.println(i);

    }
}