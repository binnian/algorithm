package com.benonshi.mathematics;

import java.util.HashSet;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/happy-number
 *
 * @Author: BenOnSHI
 * @Date: 2020/5/4 15:17
 **/
public class IsHappy {
    public Boolean isHappy(int n) {
        HashSet set = new HashSet();
        set.add(n);
        while (true) {
            n = reset(n);
            if (1 == n) {
                return true;
            }
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
    }

    public int reset(int n) {
        int i = 0;
        while (n != 0) {
            i += n % 10 * (n % 10);
            n /= 10;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(new IsHappy().isHappy(19));
    }
}
