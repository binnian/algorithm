package com.benonshi.array;

/**
 * 1720. 解码异或后的数组
 * 未知 整数数组 arr 由 n 个非负整数组成。
 * <p>
 * 经编码后变为长度为 n - 1 的另一个整数数组 encoded ，
 * 其中 encoded[i] = arr[i] XOR arr[i + 1] 。例如，arr = [1,0,2,1] 经编码后得到 encoded = [1,2,3] 。
 * <p>
 * 给你编码后的数组 encoded 和原数组 arr 的第一个元素 first（arr[0]）。
 * <p>
 * 请解码返回原数组 arr 。可以证明答案存在并且是唯一的。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decode-xored-array
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/6 12:21
 **/
public class Decode {


    public int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] code = new int[len + 1];
        code[0] = first;
        // encoded[i] = arr[i] XOR arr[i + 1]     a ^ b = c
        // 可得 b = c ^ a
        for (int i = 0; i < len; i++) {
            code[i + 1] = encoded[i] ^ code[i];
        }
        return code;
    }
    /*
    1.任何数与 0 异或等于它本身
    2.任何数与它本身异或等于 0
    3.异或满足交换律和结合率
     */

    public static void main(String[] args) {
        // a ^ b  =  c
        System.out.println(1 ^ 4); // 5
        // a ^ b ^ a = c ^ a
        System.out.println(1 ^ 4 ^ 1);// 4
        // a ^ a ^ b = c ^ a
        System.out.println(1 ^ 1 ^ 4);// 4
        // b ^ 0 =  c ^ a
        System.out.println(0 ^ 4); // 4
        // b = c ^ a
        System.out.println(5 ^ 1); // 1
    }

}
