package com.benonshi.array;

/**
 * 283. 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @Author: BenOnSHI
 * @Date: 2021/5/12 12:24
 **/
public class MoveZeroes {
    public static void moveZeroes1(int[] nums) {
        int right = 0;
        //双指针
        for (int left = 0; left < nums.length; left++) {
            // 已知数组尾部全部为0 且不为0 顺序相对
            if (nums[left] != 0) {
                //  覆盖数组
                nums[right++] = nums[left];
            }
        }
        // 判断是否到达尾部  设置为0
        while (right < nums.length) {
            nums[right++] = 0;
        }
    }

    public static void moveZeroes2(int[] nums) {
        int right = 0;
        for (int left = 0; left < nums.length; left++) {
            if (nums[left] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right++] = temp;
            }
        }
    }
}
