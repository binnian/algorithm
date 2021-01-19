package com.benonshi.array;

import java.util.Arrays;

/**
 * 两个数组的交集 II
 *
 * @author BenOniShi
 * @date 2021/1/19 22:29
 */
public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int len1 = nums1.length, len2 = nums2.length;
        int p1 = 0, p2 = 0, p3 = 0;
        int[] result = new int[Math.min(len1, len2)];

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                result[p3++] = nums1[p1];
                p1++;
                p2++;
            }
        }
        return Arrays.copyOfRange(result, 0, p3);
    }
}
