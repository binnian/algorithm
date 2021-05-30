package com.benonshi.string;

/**
 * 5772. 检查某单词是否等于两单词之和
 * 字母的 字母值 取决于字母在字母表中的位置，从 0 开始 计数。即，'a' -> 0、'b' -> 1、'c' -> 2，以此类推。
 * <p>
 * 对某个由小写字母组成的字符串s 而言，其 数值 就等于将 s 中每个字母的 字母值 按顺序 连接 并 转换 成对应整数。
 * <p>
 * 例如，s = "acb" ，依次连接每个字母的字母值可以得到 "021" ，转换为整数得到 21 。
 * 给你三个字符串 firstWord、secondWord 和 targetWord ，每个字符串都由从 'a' 到 'j' （含'a' 和 'j' ）的小写英文字母组成。
 * <p>
 * 如果firstWord 和 secondWord 的 数值之和 等于 targetWord 的数值，返回 true ；否则，返回 false 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-word-equals-summation-of-two-words
 *
 * @Author: BenOnSHI
 * @Date: 2021/5/30 13:26
 **/
public class IsSumEqual {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (decode(firstWord) + decode(secondWord)) == decode(targetWord);
    }

    public int decode(String word) {
        int r = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            r *= 10;
            r += c - 'a';
        }
        return r;
    }
}
