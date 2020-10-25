package com.benonshi.array;

/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 说明：
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 *
 * @author BenOniShi
 * @date 2020/10/24 23:53
 */
public class MergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 的指针
        int p1 = m - 1;
        // nums2 的指针
        int p2 = n - 1;
        // 最终元素末尾位置
        int p = m + n - 1;
        // 如果 p1 && p2 大于等于 0
        while (p1 >= 0 && p2 >= 0) {
            // p 位置 为 p1 和 p2 位置较大的数
            nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }
        //p1 < 0 遍历结束 将 nums[2] 中未完全拷贝的数据放入 nums[1]中
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{1, 1, 6};
        merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
        }
    }

}
