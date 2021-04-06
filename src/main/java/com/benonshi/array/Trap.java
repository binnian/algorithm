package com.benonshi.array;

/**
 * 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 * @Author: BenOnSHI
 * @Date: 2021/4/3 13:03
 **/
public class Trap {
    public int trap(int[] height) {
        int left = 0, ans = 0, right = height.length - 1;
        int lMax = 0, rMax = 0;
        while (left < right) {
            lMax = Math.max(lMax, height[left]);
            rMax = Math.max(rMax, height[right]);
            if (height[left] < height[right]) {
                ans += lMax - height[left];
                ++left;
            } else {
                ans += rMax - height[right];
                --right;
            }
        }
        return ans;
    }


}
