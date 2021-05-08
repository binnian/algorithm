package com.benonshi.array;

/**
 * 75. 颜色分类
 * 给定一个包含红色、白色和蓝色，一共n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * <p>
 * 此题中，我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-colors
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/8 11:03
 **/
public class SortColors {

    public void sortColors(int[] nums) {
        int p1 = 0, p2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            //假设已经完成
            nums[i] = 2;
            //如果小于2  设为1 移动指针
            if (num < 2) {
                nums[p2++] = 1;
            }
            //如果小于1  设为0 移动指针
            if (num < 1) {
                nums[p1++] = 0;
            }
        }
    }
}
