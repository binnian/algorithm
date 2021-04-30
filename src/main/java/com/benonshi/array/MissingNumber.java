package com.benonshi.array;


/**
 * 丢失的数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * @Author: BenOnSHI
 * @Date: 2021/4/30 11:15
 **/
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length +1) /2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1}));
    }
}
