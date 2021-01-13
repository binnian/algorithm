package com.benonshi.array;

/**
 * 198. 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 *
 * @author BenOniShi
 * @date 2021/1/13 21:00
 */
public class Rob {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= n; i++) {
            /**
             动态转移方程 ：dp[n] = MAX( dp[n-1], dp[n-2] + num )
             当前房间 可偷窃值  1. 上个房间的值
             2.  当前房间值 + 上上个房间值
             */
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 7, 6};
        int rob = rob(nums);
        System.out.println(rob);

    }

}
