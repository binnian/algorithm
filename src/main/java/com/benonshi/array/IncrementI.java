package com.benonshi.array;

/**
 * @author BenOniShi
 * @date 2020/6/27 23:02
 */
public class IncrementI {

    public static void main(String[] args) {
        int i = 1;
        i = i++;

        System.out.println(i);
        int k = i++;
         int j = ++i;

        System.out.println(k);
        System.out.println(i);
        System.out.println(j);
    }
}
