package com.benonshi.mathematics;

/**
 * 810. 黑板异或游戏
 * 黑板上写着一个非负整数数组 nums[i] 。Alice 和 Bob 轮流从黑板上擦掉一个数字，Alice 先手。
 * 如果擦除一个数字后，剩余的所有数字按位异或运算得出的结果等于 0 的话，当前玩家游戏失败。
 * (另外，如果只剩一个数字，按位异或运算得到它本身；如果无数字剩余，按位异或运算结果为0。）
 * <p>
 * 换种说法就是，轮到某个玩家时，如果当前黑板上所有数字按位异或运算结果等于 0，这个玩家获胜。
 * <p>
 * 假设两个玩家每步都使用最优解，当且仅当 Alice 获胜时返回 true。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/chalkboard-xor-game
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/22 11:36
 **/
public class XORGame {

    public boolean xorGame(int[] nums) {
        // 博弈论
        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }
        // 后手必胜
        return sum == 0 || nums.length % 2 == 0;
    }
}
