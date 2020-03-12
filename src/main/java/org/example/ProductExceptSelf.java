package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * 238. 除自身以外数组的乘积
 * 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * 来源：力扣（LeetCode）
 * 链接： https://leetcode-cn.com/problems/product-of-array-except-self/
 *
 * @author BenOniShi
 * @date 2020/3/12 19:20
 */
public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j : map.keySet()) {
                if (j != nums[i]) {
                    sum = sum * j;
                }
            }
            arr[i] = sum;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{1, 2, 3, 4});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
