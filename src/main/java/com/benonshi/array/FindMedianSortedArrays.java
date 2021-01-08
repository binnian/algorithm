package com.benonshi.array;

/**
 * 寻找两个正序数组的中位数
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/8 10:52
 **/
public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;
        int[] result = new int[nums1.length + nums2.length];
        int i = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            result[i++] = nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
        }
        while (p1 < nums1.length) {
            result[i++] = nums1[p1++];
        }
        while (p2 < nums2.length) {
            result[i++] = nums2[p2++];
        }
        if (result.length % 2 == 0) {
            return (result[result.length / 2] + result[result.length / 2 - 1]) * 1.0 / 2;
        } else {

            return result[result.length / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 4};
        int[] nums2 = new int[]{3};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}
