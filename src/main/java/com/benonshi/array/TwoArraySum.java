package com.benonshi.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: BenOnSHI
 * @Date: 2020/7/24 14:31
 **/
public class TwoArraySum {

    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 84, 6, 45, 6, 1, 5};
        int[] b = new int[]{2, 24, 4, 5, 87, 54, 45, 54};
        int target = 25;
        Map map = new HashMap(a.length);
        for (int i = 0; i < a.length; i++) {
            map.put((target - a[i]), i);
        }
        for (int i = 0; i < b.length; i++) {
            if (map.containsKey( b[i])) {
                System.out.println(a[(int) map.get( b[i])]);
                System.out.println(b[i]);
            }
        }
    }
}
