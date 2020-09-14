package com.benonshi.string;

/**
 * @author BenOniShi
 * @date 2020/9/14 15:00
 */
public class ReverseWord {

    private static String str = "This  is a word";

    public static void reverse() {
        String[] s = str.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            if (i == 0) {
                strBuilder.append(s[i]);
            } else {
                strBuilder.append(s[i]).append(" ");
            }
        }
        str = strBuilder.toString();
    }

    public static void main(String[] args) {
        reverse();
        System.out.println(str);
    }
}
