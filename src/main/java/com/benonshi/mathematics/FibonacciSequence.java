package com.benonshi.mathematics;

/**
 * @author BenOniShi
 * @date 2020/5/17 1:17
 */
public class FibonacciSequence {

    public static int fib(int n) {
        int h = 0;
        int k = 1;
        while (0 < n--) {
            k += h;
            h = k - h;
        }
        return k;
    }


    public static void main(String[] args) {
        System.out.println(fib(3));
    }


}
