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
        if (x < 0) return false;
        int cur = 0;
        int num = x;
        while (num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(1221);
        System.out.println(palindrome);
    }
}
