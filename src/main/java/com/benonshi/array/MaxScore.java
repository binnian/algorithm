package com.benonshi.array;


/**
 * 可获得的最大点数
 * 几张卡牌 排成一行，每张卡牌都有一个对应的点数。点数由整数数组 cardPoints 给出。
 * <p>
 * 每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌。
 * <p>
 * 你的点数就是你拿到手中的所有卡牌的点数之和。
 * <p>
 * 给你一个整数数组 cardPoints 和整数 k，请你返回可以获得的最大点数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-points-you-can-obtain-from-cards
 *
 * @Author: BenOnSHI
 * @Date: 2021/2/6 10:59
 **/
public class MaxScore {
    public static int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length - 1;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        int left = k - 1, result = sum;
        while (left >= 0) {
            sum = sum - cardPoints[left--] + cardPoints[len--];
            result = Math.max(result, sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 7, 7};
        int i = maxScore(nums, 2);
        System.out.println(i);
    }
}
