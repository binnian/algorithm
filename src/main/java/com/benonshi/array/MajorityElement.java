package com.benonshi.array;

/**
 * 169. 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 *
 * @author BenOniShi
 * @date 2020/9/29 16:25
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int num = 1;
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != ans) {
                num--;
            } else {
                num++;
            }
            if (num == 0) {
                ans = nums[i];
                num++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 4, 6, 6}));
    }
}
