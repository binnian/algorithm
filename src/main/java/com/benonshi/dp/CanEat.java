package com.benonshi.dp;

/**
 * 1744. 你能在你最喜欢的那天吃到你最喜欢的糖果吗？
 * 给你一个下标从 0 开始的正整数数组 candiesCount ，其中 candiesCount[i] 表示你拥有的第 i 类糖果的数目。同时给你一个二维数组 queries ，其中 queries[i] = [favoriteTypei, favoriteDayi, dailyCapi] 。
 * <p>
 * 你按照如下规则进行一场游戏：
 * <p>
 * 你从第 0 天开始吃糖果。
 * 你在吃完 所有 第 i - 1 类糖果之前，不能 吃任何一颗第 i 类糖果。
 * 在吃完所有糖果之前，你必须每天 至少 吃 一颗 糖果。
 * 请你构建一个布尔型数组 answer ，满足 answer.length == queries.length 。answer[i] 为 true 的条件是：在每天吃 不超过 dailyCapi 颗糖果的前提下，你可以在第 favoriteDayi 天吃到第 favoriteTypei 类糖果；否则 answer[i] 为 false 。注意，只要满足上面 3 条规则中的第二条规则，你就可以在同一天吃不同类型的糖果。
 * <p>
 * 请你返回得到的数组 answer 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/can-you-eat-your-favorite-candy-on-your-favorite-day
 *
 * @author BenOniShi
 * @date 2021/6/1 19:42
 */
public class CanEat {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int cn = candiesCount.length;
        long[] dp = new long[cn + 1];
        dp[0] = 0;
        for (int i = 1; i <= cn; i++) {
            // 前缀和
            // {7，4，5，3，8}
            // 吃某类糖果之前 需要吃完 所有之前的糖果
            // 即吃2 类糖果之前需要吃掉 7（o类）+ 4（1类） 共计11 个的糖果数量
            // 吃三类糖果需要吃掉之前  （7（o类）+ 4（1类）dp[i - 1]） + (5 (2类)candiesCount[i - 1])
            dp[i] = dp[i - 1] + candiesCount[i - 1];
        }
        int qn = queries.length;
        boolean[] answer = new boolean[qn];
        for (int i = 0; i < qn; i++) {
            // 糖果类型
            int t = queries[i][0];
            // 糖果天数
            int d = queries[i][1] + 1;
            // 糖果可以吃的数量
            int c = queries[i][2];


            // dp[t + 1] 可以获取到 该类型糖果之前需要吃掉的糖果总数
            long sum = dp[t + 1];
            // 获取每天 都以  可以吃到最大的数量吃糖果  需要的天数
            long avg = dp[t] / c + 1;

            // avg <= d ： 每天最大数量吃糖果需要的天数 小于 限定要吃掉的天数
            // d <= sum :  当前限定要吃掉的天数 不能没有糖吃
            answer[i] = avg <= d && d <= sum;
        }
        return answer;
    }
}
