package com.benonshi.mathematics;

/**
 * 7. 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 *
 * @Author: BenOnSHI
 * @Date: 2020/5/12 11:44
 **/
public class NumberReverse {

    public static int reverse(int x) {
        int n = 0, k = 0;
        while (x != 0) {
            k = x % 10;
            x /= 10;
            if (n >= Integer.MAX_VALUE || n <= Integer.MIN_VALUE) return 0;
            n = (n * 10) + k;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1221351351));
    }
}
