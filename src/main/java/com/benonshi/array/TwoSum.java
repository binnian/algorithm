package com.benonshi.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 * @author BenOniShi
 * @date 2020/3/9 16:28
 */
public class TwoSum {

    /**
     * 一遍hash
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null && nums.length == 0) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<>();
        // arr[0] 开始
        for (int i = 0; i < nums.length; i++) {
            // 循环过程中  如果 target - arr[i] 位置的值 在map中存在
            if (map.containsKey(target - nums[i])) {
                //返回一个新的数组  target - nums[i] 就是 之前存入的 key
                return new int[]{map.get(target - nums[i]), i};
            }
            // 将 数组的值作为 key  下标作为 value  放入map
            map.put(nums[i], i);
        }
        return null;
    }

    /**
     * 暴力法  两遍循环
     *
     * @param target
     * @param nums
     * @return
     */

    public static int[] twoSum(int target, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 10, 9, 11, 15};
        int target = 13;
        int[] ints1 = twoSum(nums, target);
        int[] ints2 = twoSum(20, nums);
        for (int anInt : ints1) {
            System.out.println(anInt);
        }
        for (int anInt : ints2) {
            System.out.println(anInt);
        }
    }
}
