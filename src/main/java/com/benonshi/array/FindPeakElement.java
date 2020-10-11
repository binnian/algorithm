package com.benonshi.array;

import java.util.Vector;

/**
 * @Author: BenOnSHI
 * @Date: 2020/10/11 10:56
 **/
public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1] && i + 1 < nums.length) {
                return i;
            }
        }
        return -1;
    }


    public static int findPeakElementForMid(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        for (; left < right; ) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
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
