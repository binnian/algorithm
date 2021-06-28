package com.benonshi.mathematics;

/**
 * 剑指 Offer 15. 二进制中1的个数
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量).）。
 *
 * @author BenOniShi
 * @date 2021/6/28 22:34
 */
public class HammingWeight {
    public static int hammingWeight1(int n) {
        return Integer.bitCount(n);
    }

    public static int hammingWeight2(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
}
