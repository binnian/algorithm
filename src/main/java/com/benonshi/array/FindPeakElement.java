package com.benonshi.array;

import java.util.Vector;

/**
 * @Author: BenOnSHI
 * @Date: 2020/10/11 10:56
 **/
public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        // 循环
        for (int i = 1; i < nums.length; i++) {
            // 如果   i 位置的值大于 前一位 并且大于 后一位
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1] && i + 1 < nums.length) {
                return i;
            }
        }
        return -1;
    }


    public static int findPeakElementForMid(int[] nums) {
        // 左指针
        int left = 0;
        // 邮指针
        int right = nums.length - 1;
        // 循环
        for (; left < right; ) {
            // 二分
            int mid = left + (right - left) / 2;
            //  二分位置大于 mid + 1 位置 表示存在峰值元素
            if (nums[mid] > nums[mid + 1]) {
                //  右指针指向mid
                right = mid;
            } else {
                // 左指针指向mid + 1 位置
                left = mid + 1;
            }
        }
        return left;
    }


    public static void main(String[] args) {
        int peakElement = findPeakElementForMid(new int[]{1, 2, 1, 3, 4, 5, 4});
        System.out.println("peakElement = " + peakElement);
    }
}
