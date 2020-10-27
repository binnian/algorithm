package com.benonshi.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author BenOniShi
 * @date 2020/10/27 23:32
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int num : nums) {
            if (set.contains(num)){
                return num;
            }else {
                set.add(num);
            }
        }
        return 0;
    }
}
