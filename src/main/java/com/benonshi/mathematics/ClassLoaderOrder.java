package com.benonshi.mathematics;

/**
 * @Author: BenOnSHI
 * @Date: 2020/5/8 11:00
 **/
public class ClassLoaderOrder {

    public static void main(String[] args) {
        f1();
    }

    static ClassLoaderOrder classLoaderOrder = new ClassLoaderOrder();

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    public ClassLoaderOrder() {
        System.out.println("3");
        System.out.println("a = " + a + "," + "b =" + b);
    }

    public static void f1() {
        System.out.println("4");
    }

    int a = 110;
    static int b = 120;
}
