package com.benonshi.array;

/**
 * 1486. 数组异或操作
 * 给你两个整数，n 和 start 。
 * <p>
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 * <p>
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xor-operation-in-an-array
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/7 11:05
 **/
public class XOROperation {

    public static int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result = result ^ (start + i * 2);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(3 ^ 5 ^ 7 ^ 9);
        System.out.println(xorOperation(4, 3));
    }
}
