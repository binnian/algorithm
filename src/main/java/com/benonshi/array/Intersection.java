package com.benonshi.array;

import java.util.*;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *
 * @author BenOniShi
 * @date 2021/1/14 22:20
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : nums1) {
            map.put(item, 1);
        }
        for (int value : nums2) {
            if (map.containsKey(value)) {
                map.put(value, 2);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> next : map.entrySet()) {
            if (next.getValue() == 2) {
                list.add(next.getKey());
            }
        }
        int [] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
