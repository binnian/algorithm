package com.benonshi.array;

/**
 * 581. 最短无序连续子数组
 * 给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * <p>
 * 请你找出符合题意的 最短 子数组，并输出它的长度。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray
 */
public class FindUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;

        if (len <= 1) return 0;

        int left = 0, right = len - 1, max = nums[0], min = nums[len - 1];

        //从左往右期望是升序的
        for (int i = 0; i < len; i++) {
            //记录左边最大值 从左往右一定是越来越大
            max = Math.max(max, nums[i]);
            //记录右边最小值 从右往左一定是越来越小
            min = Math.min(min, nums[len - 1 - i]);

            //如果当前位置小于最大值 则右边比左边小了 更新left
            if (nums[i] < max) left = i;
            //如果当前位置大于最小值 则左边比右边小了 更新right
            if (nums[len - 1 - i] > min) right = len - 1 - i;
        }

        // left为右边要调整的位置  right是左边要调整的位置
        return left > right ? left - right + 1 : 0;
    }
}
