package com.benonshi.dp;

/**
 * 1871. 跳跃游戏 VII
 * 给你一个下标从 0 开始的二进制字符串s和两个整数minJump 和maxJump。一开始，你在下标0处，且该位置的值一定为'0'。当同时满足如下条件时，你可以从下标i移动到下标j处：
 * <p>
 * i + minJump <= j <= min(i + maxJump, s.length - 1)且
 * s[j] == '0'.
 * 如果你可以到达 s的下标s.length - 1处，请你返回true，否则返回false。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jump-game-vii
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/23 12:22
 **/
public class CanReach {
    public boolean canReach(String s, int minJump, int maxJump) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int i = 0; i < len; i++) {
            if (!dp[i]) {
                continue;
            }
            for (int j = i + minJump; j <= i + maxJump && j < len && !dp[j]; j++) {
                dp[j] = s.charAt(j) == '0';
            }
        }
        return dp[len - 1];
    }
}
