package com.benonshi.array;

/**
 * 11. 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。在坐标内画 n 条垂直线，垂直线 i的两个端点分别为(i,ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/17 10:26
 **/
public class MaxArea {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, ans = 0;
        while (left < right) {
            ans = height[left] < height[right] ?
                    Math.max(ans, (right - left) * height[left++]) :
                    Math.max(ans, (right - left) * height[right--]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = maxArea(nums);
        System.out.println(i);
    }
}
