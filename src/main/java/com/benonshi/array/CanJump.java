package com.benonshi.array;

/**
 * 55. 跳跃游戏
 * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 判断你是否能够到达最后一个下标。
 *
 * @author BenOniShi
 * @date 2021/6/23 0:03
 */
public class CanJump {
    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            // 如果超过了能跳的范围
            if (i > k) {
                return false;
            }
            // 将每次能跳跃的最远距离更新
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }
}
