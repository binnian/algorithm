package com.benonshi.string;

/**
 * @author BenOniShi
 * @date 2020/10/27 23:37
 */
public class ReplaceSpace {
    //请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
    public static String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("   "));
    }
}
