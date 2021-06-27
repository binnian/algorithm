package com.benonshi.array;

/**
 * 45. 跳跃游戏 II
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * <p>
 * 假设你总是可以到达数组的最后一个位置。
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jump-game-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author BenOniShi
 * @date 2021/6/22 23:47
 */
public class Jump {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 1, j = 0; i < n; i++) {
            while (j + nums[j] < i) {
                j++;
            }
            dp[i] = dp[j] + 1;
        }
        return dp[n - 1];
    }
}
