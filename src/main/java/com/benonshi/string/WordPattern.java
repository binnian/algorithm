package com.benonshi.string;

/**
 * 290. 单词规律
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-pattern
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * @Author: BenOnSHI
 * @Date: 2020/4/26 17:35
 **/
public class WordPattern {

    public boolean stringWordPattern(String pattern, String str) {
        // 转换 字符串  pattern
        char[] a = pattern.toCharArray();
        // 分割字符串 str
        String[] strArray = str.split("-");
        // 判断  如果长度不一样 不需要 比较
        if (a.length != strArray.length) {
            return false;
        }
        // for 循环 开始比较
        for (int i = 0; i < pattern.length(); i++) {
            //  判断pattern 字符串中的字符数组 中的 i 位置  是否和  str 字符串 数组中的 位置 不一样
            if (pattern.indexOf(a[i]) != strIndexOf(strArray, strArray[i])) {
                return false;
            }
        }
        return true;
    }

    private int strIndexOf(String[] strArray, String s) {
        //  接收一个  字符串数组  和 一个字符串
        for (int i = 0; i < strArray.length; i++) {
            //  查看 字符串  在字符串数组中的位置
            if (strArray[i].equals(s)) {
                //  返回索引
                return i;
            }
        }
        return -1;
    }
}
