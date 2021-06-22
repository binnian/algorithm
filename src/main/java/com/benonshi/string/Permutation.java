package com.benonshi.string;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 38. 字符串的排列
 *
 * @author BenOniShi
 * @date 2021/6/22 23:41
 */
public class Permutation {
    List<String> res = new LinkedList<>();
    char[] c;

    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    void dfs(int x) {
        if (x == c.length - 1) {
            // 添加排列方案
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            // 对重复 剪枝
            if (set.contains(c[i])) {
                continue;
            }
            set.add(c[i]);
            // 交换，将 c[i] 固定在第 x 位
            swap(i, x);
            // 开启固定第 x + 1 位字符
            dfs(x + 1);
            // 恢复交换
            swap(i, x);
        }
    }

    private void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }
}
