package com.benonshi.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 森林中的兔子
 * 森林中，每个兔子都有颜色。其中一些兔子（可能是全部）告诉你还有多少其他的兔子和自己有相同的颜色。我们将这些回答放在answers数组里。
 * 返回森林中兔子的最少数量。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rabbits-in-forest
 * @Author: BenOnSHI
 * @Date: 2021/4/4 16:55
 **/
public class NumRabbits {
    public static int numRabbits1(int[] answers) {
        int[] nums = new int[1000];
        int result = 0;
        for (int i : answers) {
            if (nums[i] > 0) {
                nums[i]--;
            } else {
                nums[i] = i;
                result += i + 1;
            }
        }
        return result;
    }

    public static int numRabbits2(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int answer : answers) {
            map.put(answer, map.getOrDefault(answer, 0) + 1);
        }
        var ref = new Object() {
            int ans = 0;
        };
        map.forEach((k,v)->{
            ref.ans += (k+v)/(k+1)*(k+1);
        });
        return ref.ans;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{10, 10, 10};
        System.out.println(numRabbits1(nums));
        System.out.println(numRabbits2(nums));
    }
}
