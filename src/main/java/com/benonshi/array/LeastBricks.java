package com.benonshi.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 554. 砖墙
 * 你的面前有一堵矩形的、由 n 行砖块组成的砖墙。这些砖块高度相同（也就是一个单位高）但是宽度不同。每一行砖块的宽度之和应该相等。
 * <p>
 * 你现在要画一条 自顶向下 的、穿过 最少 砖块的垂线。如果你画的线只是从砖块的边缘经过，就不算穿过这块砖。你不能沿着墙的两个垂直边缘之一画线，这样显然是没有穿过一块砖的。
 * <p>
 * 给你一个二维数组 wall ，该数组包含这堵墙的相关信息。其中，wall[i] 是一个代表从左至右每块砖的宽度的数组。你需要找出怎样画才能使这条线 穿过的砖块数量最少 ，并且返回 穿过的砖块数量 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/brick-wall
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/2 15:18
 **/
public class LeastBricks {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> cur = new HashMap<>();
        //遍历行
        for (List<Integer> integers : wall) {
            // 行总数
            int size = integers.size();
            // 距右边缘距离
            int sum = 0;
            for (int i = 0; i < size - 1; i++) {
                // 前缀和
                Integer integer = integers.get(i);
                sum += integer;
                // 更新前缀和
                cur.put(sum, cur.getOrDefault(sum, 0) + 1);

            }
        }
        int max = 0;
        // 求最大前缀和
        Set<Map.Entry<Integer, Integer>> entries = cur.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            max = Math.max(max, entry.getValue());
        }
        return wall.size() - max;
    }
}
