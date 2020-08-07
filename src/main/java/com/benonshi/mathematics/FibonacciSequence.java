package com.benonshi.mathematics;

/**
 * @author BenOniShi
 * @date 2020/5/17 1:17
 */
public class FibonacciSequence {

    public static int fib1(int n) {
        int h = 0;
        int k = 1;
        while (0 < n--) {
            k += h;
            h = k - h;
        }
        return k;
    }

    public static int fib2(int n) {
        if (n == 1) {
            return 1;
        }
        if ( n == 2) {
            return 2;
        }
        return fib2(n - 1) + fib2(n - 2);
    }


    public static void main(String[] args) {
        System.out.println(fib1(15));
//        System.out.println(fib2(2));
    }


}
