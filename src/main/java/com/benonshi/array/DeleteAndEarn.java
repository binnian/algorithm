package com.benonshi.array;


/**
 * 740. 删除并获得点数
 * 给你一个整数数组nums，你可以对它进行一些操作。
 * <p>
 * 每次操作中，选择任意一个nums[i]，删除它并获得nums[i]的点数。之后，你必须删除 所有 等于nums[i] - 1 和 nums[i] + 1的元素。
 * <p>
 * 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/delete-and-earn
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/5 11:53
 **/
public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        int[] sum = new int[max + 1];
        for (int num : nums) {
            sum[num] += num;
        }
        return rob(sum);
    }

    private int rob(int[] sum) {
        int n = sum.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = Math.max(sum[0], sum[1]);
        for (int i = 2; i < sum.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + sum[i]);
        }
        return dp[n - 1];
    }

}
