package com.benonshi.array;


/**
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/19 10:38
 **/
public class Exchange {
    public static int[] exchange1(int[] nums) {
        int len = nums.length;
        int right = 0;
        for (int i = 0; i < nums.length && right < len; i++) {
            if ((nums[i] & 1) == 0) {
                while (right < i) {
                    right++;
                }
                while (right < len && ((nums[right] & 1) == 0)) {
                    right++;
                }
                if (right < len) {
                    swap(nums, i, right);
                }
            }
        }
        return nums;
    }


    public static int[] exchange2(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while ((nums[left] & 1) == 1 && left < right) {
                left++;
            }
            while ((nums[right] & 1) == 0 && right > 0) {
                right--;
            }
            if (left < right) {
                nums[left] = nums[left] ^ nums[right];
                nums[right] = nums[left] ^ nums[right];
                nums[left] = nums[left] ^ nums[right];
            }
        }
        return nums;
    }

    public static void swap(int[] arr, int p1, int p2) {
        arr[p1] = arr[p1] ^ arr[p2];
        arr[p2] = arr[p1] ^ arr[p2];
        arr[p1] = arr[p1] ^ arr[p2];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        exchange1(arr);
        for (int i : arr) {
            System.out.println(i);

        }
    }
}
