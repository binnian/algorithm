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
        //左指针  右指针   ans
        int left = 0, ans = 0, right = height.length - 1;
        // 左边最大值  右边最大值
        int lMax = 0, rMax = 0;
        //如果 left < right
        while (left < right) {
            // 更新左边最大值与右边最大值
            lMax = Math.max(lMax, height[left]);
            rMax = Math.max(rMax, height[right]);
            // 如果当前位置左边 比 右边小
            if (height[left] < height[right]) {
                // 左边雨水 与 左边最高的柱子有关系   右边雨水与 右边最高柱子有关系
                // 当前位置能接的雨水 =   左边最高柱子值 - 当前值
                ans += lMax - height[left];
                ++left;
            } else {
                // 右边同理 右边当前位置能接的雨水 =  右边最高柱子值  -  当前值
                ans += rMax - height[right];
                --right;
            }
        }
        return ans;
    }


    public int dpTrap(int[] height) {
        int len = height.length;
        if (len == 0) return 0;

        int[] lMax = new int[len];
        lMax[0] = height[0];
        for (int i = 1; i < len; i++) {
            lMax[i] = Math.max(lMax[i - 1], height[i]);
        }

        int[] rMax = new int[len];
        rMax[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], height[i]);
        }

        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans += Math.min(lMax[i], rMax[i]) - height[i];
        }
        return ans;
    }


}
