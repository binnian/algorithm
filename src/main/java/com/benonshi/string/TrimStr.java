package com.benonshi.string;
/**
 * 字符串去重
 * @Author: BenOnSHI
 * @Date: 2020/5/24 16:12
 **/
public class TrimStr {

    public static void main(String[] args) {
        String str = "aaabbccdd";
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i==str.indexOf(chars[i])){
                stringBuilder.append(chars[i]);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
