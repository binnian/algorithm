package com.benonshi.string;

/**
 * @author BenOniShi
 * @date 2020/9/14 15:00
 */
public class ReverseWord {


    public static String reverse(String s) {
        String[] str = s.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            if (i == 0) {
                strBuilder.append(str[i]);
            } else {
                strBuilder.append(str[i]).append(" ");
            }
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("This  is a word"));
    }
}
