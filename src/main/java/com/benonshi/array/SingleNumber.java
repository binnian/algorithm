package com.benonshi.array;

import java.util.Arrays;

/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @Author: BenOnSHI
 * @Date: 2021/4/30 10:50
 **/
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        if(nums.length < 2){
            return nums[0];
        }
        Arrays.sort(nums);
        int left;
        int right;
        for (left = 0, right = 1; left < right && right < nums.length; left++, right++) {
            if (nums[left] == nums[right]) {
                left++;
                right++;
            } else {
                return nums[left];
            }
            if (right+1 > nums.length - 1) {
                return nums[right];
            }
        }
        return nums[right];
    }


    public static int singleNumber1(int[] nums) {
        int x = 0;
        for (int num : nums){
            x ^= num;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,3,2,2};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber1(nums));
    }
}
