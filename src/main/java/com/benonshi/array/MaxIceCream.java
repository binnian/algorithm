package com.benonshi.array;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 1833. 雪糕的最大数量
 * 夏日炎炎，小男孩 Tony 想买一些雪糕消消暑。
 * <p>
 * 商店中新到 n 支雪糕，用长度为 n 的数组 costs 表示雪糕的定价，其中 costs[i] 表示第 i 支雪糕的现金价格。Tony 一共有 coins 现金可以用于消费，他想要买尽可能多的雪糕。
 * <p>
 * 给你价格数组 costs 和现金量 coins ，请你计算并返回 Tony 用 coins 现金能够买到的雪糕的 最大数量 。
 * <p>
 * 注意：Tony 可以按任意顺序购买雪糕。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-ice-cream-bars
 */
public class MaxIceCream {
    public int maxIceCream1(int[] costs, int coins) {
        int res = 0, sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);

        for (int cost : costs) {
            sum += cost;
            queue.offer(cost);
            res++;

            if (sum < coins) {
                sum -= queue.poll();
                res--;
            }
        }
        return res;
    }

    public int maxIceCream2(int[] costs, int coins) {
        Arrays.sort(costs);
        int res = 0;
        for (int cost : costs) {
            if (coins > cost) {
                res++;
                coins -= cost;
            }
        }
        return res;
    }
}
