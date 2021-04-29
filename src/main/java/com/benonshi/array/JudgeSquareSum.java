package com.benonshi.array;

/**
 * 平方数之和
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 * @Author: BenOnSHI
 * @Date: 2021/4/29 13:13
 **/
public class JudgeSquareSum {
    public static boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while (i <= j) {
            int i1 = 0;
            if ((i1 = i * i + j * j) == c) {
                return true;
            } else if (i1 > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = judgeSquareSum(5);
        System.out.println(b);
    }
}
