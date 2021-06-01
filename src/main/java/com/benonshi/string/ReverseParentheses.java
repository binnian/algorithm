package com.benonshi.string;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 1190. 反转每对括号间的子串
 * 给出一个字符串s（仅含有小写英文字母和括号）。
 * <p>
 * 请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。
 * <p>
 * 注意，您的结果中 不应 包含任何括号。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-substrings-between-each-pair-of-parentheses
 * 输入：s = "(ed(et(oc))el)"
 * 输出："leetcode"
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/29 12:41
 **/
public class ReverseParentheses {
    public static String reverseParentheses(String s) {
        Deque<String> deque = new LinkedList<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                // 左括号把 当前拼接的字符入队
                deque.offerFirst(builder.toString());
                builder.setLength(0);
            } else if (c == ')') {
                // 右括号处理 字符  先进行反转
                builder.reverse();
                // 把当前顶端元素拼接到前面
                builder.insert(0, deque.pollFirst());
            } else {
                // 字符拼接
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String s = reverseParentheses("(ed(et(oc))el)");
        System.out.println(s);
    }
}
