package com.benonshi.array;

/**
 * @Author: BenOnSHI
 * @Date: 2020/11/27 13:59
 **/
public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {1, 3, 5, 7, 9, 14, 35, 45};
        int i = binarySearch(ints, 9);
        System.out.println(i);
    }
}
