package com.benonshi.string;

/**
 * 罗马数字转整数
 * 例如， 罗马数字 2 写做II，即为两个并列的 1。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 */
public class RomanToInt {

    public int romanToInt(String s) {
        int len = s.length();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = getVal(s.charAt(i));
            if (i < len - 1 && val < getVal(s.charAt(i + 1))) {
                ans -= val;
            } else {
                ans += val;
            }
        }
        return ans;
    }


    private int getVal(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
