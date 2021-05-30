package com.benonshi.array;

import java.util.*;

/**
 * 1710. 卡车上的最大单元数
 * 请你将一些箱子装在 一辆卡车 上。给你一个二维数组 boxTypes ，其中 boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi] ：
 * <p>
 * numberOfBoxesi 是类型 i 的箱子的数量。
 * numberOfUnitsPerBoxi 是类型 i每个箱子可以装载的单元数量。
 * 整数 truckSize 表示卡车上可以装载 箱子 的 最大数量 。只要箱子数量不超过 truckSize ，你就可以选择任意箱子装到卡车上。
 * <p>
 * 返回卡车可以装载单元 的 最大 总数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-units-on-a-truck
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/30 12:21
 **/
public class MaximumUnits {

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
        int ans = 0;
        int max = 0;
        for (int[] box : boxTypes) {
            if (max + box[0] > truckSize) {
                ans += (truckSize - max) * box[1];
                break;
            } else {
                ans += box[0] * box[1];
                max += box[0];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] ans = new int[][]{{2, 1}, {4, 4}, {3, 1}, {4, 1}, {2, 4}, {3, 4}, {1, 3}, {4, 3}, {5, 3}, {5, 3}};
        int i = maximumUnits(ans, 13);
        System.out.println(i);
    }
}
