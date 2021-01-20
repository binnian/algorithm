package com.benonshi.mathematics;

/**
 * 在一个 XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为 x、纵坐标为 y 的点。
 * 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-it-is-a-straight-line
 *
 * @author BenOniShi
 * @date 2021/1/17 22:39
 */
public class CheckStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        /*
         *          3,4 [x3,y3]         k1 =    (y3 - y2)   /  (x3 - x2)
         *      2,3 [x2,y2]             k2 =   (y2 - y1)   /  (x2 - x1)
         *   1,2 [x1,y1]                k1  = k2   斜率相等
         */
        int len = coordinates.length - 1;
        int y1 = coordinates[1][1] - coordinates[0][1];
        int x1 = coordinates[1][0] - coordinates[0][0];
        for (int i = 1; i < len; i++) {
            int y2 = coordinates[i + 1][1] - coordinates[i][1];
            int x2 = coordinates[i + 1][0] - coordinates[i][0];
            if (y1 * x2 != y2 * x1) {
                return false;
            }
        }
        return true;
    }
}
