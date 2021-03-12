package com.benonshi.string;

/**
 * 字符串中最大重复得字符
 * @Author: BenOnSHI
 * @Date: 2021/3/12 16:35
 **/
public class MaximumRepeatedCharacters {
    public static char maximumRepeatedCharacters(String s) {
        int max = 0;
        int tmp = 1;
        char resultChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                tmp++;
                if (tmp > max) {
                    resultChar = s.charAt(i);
                    max = tmp;
                }
            } else {
                tmp = 1;
            }
        }
        return resultChar;
    }

    public static void main(String[] args) {
        String str = "avbbbbc";
        char maximumRepeatedCharacters = maximumRepeatedCharacters(str);
        System.out.println(maximumRepeatedCharacters);
    }
}
