package com.benonshi.mathematics;

/**
 * 实现int sqrt(int x)函数。
 * 计算并返回x的平方根，其中x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 *
 * @Author: BenOnSHI
 * @Date: 2021/1/17 11:55
 **/
public class MySqrt {

    //二分查询
    public int mySqrt(int x) {
        // 左边界0 右边界为x 结果
        int left = 0, ans = -1, right =x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }


}
