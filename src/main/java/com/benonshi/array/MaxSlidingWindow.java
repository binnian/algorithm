package com.benonshi.array;

import java.util.*;

/**
 * 滑动窗口最大值
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回滑动窗口中的最大值。
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/21 10:34
 **/
public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] result = new int[len - k + 1];
        Deque<Integer> queue =  new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            //
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
            // 末尾添加当前下标
            queue.addLast(i);
            // 队列头的元素下标是否有效
            if (queue.element() <= i - k) {
                queue.poll();
            }
            // 窗口长度为k时  保存最大元素
            if (i + 1 >= k) {
                result[i + 1 - k] = nums[queue.element()];
            }
        }
            return result;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{5, 3, 4};
        int[] ints = new MaxSlidingWindow().maxSlidingWindow(nums, 1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}
