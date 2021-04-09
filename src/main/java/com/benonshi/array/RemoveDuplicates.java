package com.benonshi.array;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/1 11:41
 **/
public class RemoveDuplicates {

    /**
     * 双指针
     * i  j
     * j 移动到不等于 i 的位置  将 j当前位置的值与  i下一个相同位置的值变换
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int removeDuplicatesK(int[] nums) {
        return removeK(nums, 1);
    }

    /**
     * 删除排序数组中的重复元素 k 问题求解
     * @param nums
     * @param k
     * @return
     */
    public static int removeK(int[] nums, int k) {
        int length = nums.length;
        if (length <= k) {
            return k;
        }
        int x = 0;
        for (int num : nums) {
            if (x < k || nums[x-k] != num) {
                nums[x++] = num;
            }
        }
        return x;
    }


    public static void main(String[] args) {
        int i = removeDuplicates(new int[]{1, 1, 1, 1, 2, 3, 4, 4, 5, 6});
        int y = removeDuplicatesK(new int[]{1, 1, 1, 1, 2, 3, 4, 4, 5, 6});
        System.out.println(i);
        System.out.println(y);
    }
}
