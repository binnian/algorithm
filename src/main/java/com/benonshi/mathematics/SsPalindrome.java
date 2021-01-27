package com.benonshi.mathematics;

/**
 * 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * @author BenOniShi
 * @date 2021/1/27 20:28
 */
public class SsPalindrome {


    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if (s.contains("-")) {
            return false;
        }
        int l = 0;
        int len = s.length() - 1;
        for (; l < len; l++, len--) {
            if (s.charAt(l) != s.charAt(len)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(1221);
        System.out.println(palindrome);
    }
}
