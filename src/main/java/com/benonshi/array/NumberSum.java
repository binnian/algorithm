package com.benonshi.array;

/**
 * @author BenOniShi
 * @date 2020/5/11 22:35
 */
public class NumberSum {

    public static int sum(int n) {
        return 1 == n ? 1 : n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
