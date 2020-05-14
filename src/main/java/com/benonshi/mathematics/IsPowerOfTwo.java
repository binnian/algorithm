package com.benonshi.mathematics;



/**
 * 231. 2的幂
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-two/
 * @Author: BenOnSHI
 * @Date: 2020/4/18 12:01
 **/
public class IsPowerOfTwo {


    public static  Boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println("isPowerOfTwo(16) = " + isPowerOfTwo(16));
    }

}
