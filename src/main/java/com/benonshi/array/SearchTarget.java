package com.benonshi.array;


/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/9 10:40
 **/
public class SearchTarget {

    public int search(int[] nums, int target) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                num++;
            }
        }
        return num;
    }
}
