package com.benonshi.array;

/**
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/3 10:49
 **/
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // 若 j != val 时  交换 j 与 i
            // j == val 时  j自增 i 原地不懂   当下一次 j != val 时 交换
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int i = removeElement(new int[]{1, 1, 1, 2, 2, 2, 3, 4, 5}, 1);
        System.out.println("原地移除数组中指定的元素后数组长度为 " + i);
    }
}
