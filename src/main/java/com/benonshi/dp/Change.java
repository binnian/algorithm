package com.benonshi.dp;

/**
 * 518. 零钱兑换 II
 * 给你一个整数数组 coins 表示不同面额的硬币，另给一个整数 amount 表示总金额。
 * <p>
 * 请你计算并返回可以凑成总金额的硬币组合数。如果任何硬币组合都无法凑出总金额，返回 0 。
 * <p>
 * 假设每一种面额的硬币有无限个。
 * <p>
 * 题目数据保证结果符合 32 位带符号整数。
 *
 * @author BenOniShi
 * @date 2021/6/13 16:47
 */
public class Change {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        //初始dp状态
        dp[0] = 1;
        //背包问题
        for (int x : coins) {
            for (int j = x; j <= amount; j++) {
                dp[j] += dp[j - x];
            }
        }
        return dp[amount];
    }
}
