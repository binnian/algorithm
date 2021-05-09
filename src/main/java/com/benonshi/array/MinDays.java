package com.benonshi.array;

/**
 * 1482. 制作 m 束花所需的最少天数
 * 给你一个整数数组 bloomDay，以及两个整数 m 和 k 。
 * <p>
 * 现需要制作 m 束花。制作花束时，需要使用花园中 相邻的 k 朵花 。
 * <p>
 * 花园中有 n 朵花，第 i 朵花会在 bloomDay[i] 时盛开，恰好 可以用于 一束 花中。
 * <p>
 * 请你返回从花园中摘 m 束花需要等待的最少的天数。如果不能摘到 m 束花则返回 -1 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-number-of-days-to-make-m-bouquets
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/9 11:12
 **/
public class MinDays {
    /**
     * @param bloomDay 数组
     * @param m        m 束花
     * @param k        k 每束花需要的个数
     * @return
     */
    public int minDays(int[] bloomDay, int m, int k) {
        // 如果需要的花超过了长度
        if (bloomDay.length < k * m) {
            return -1;
        }
        //双指针
        int left = 0, right = -1;
        //假定最大天数
        for (int i : bloomDay) {
            right = Math.max(right, i);
        }
        while (left < right) {
            int day = left + (right - left) / 2;
            // 寻找 day 能完成的花束总数
            int count = getCount(bloomDay, day, k);
            // 如果 可完成数量 >= m
            if (count >= m) {
                right = day;
            } else {
                left = day + 1;
            }
        }
        return left;
    }

    /**
     * @param bloomDay 数组
     * @param day      天数
     * @param k        天数跨度
     * @return
     */
    private int getCount(int[] bloomDay, int day, int k) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            // 第 i 朵花会在 bloomDay[i] 时盛开   如果<=假定的天数
            if (bloomDay[i] <= day) {
                temp++;
            } else {
                temp = 0;
            }
            // 当累计个数可以制作一束花时
            if (temp == k) {
                //计数器+1
                count += 1;
                temp = 0;
            }
        }
        return count;
    }
}
