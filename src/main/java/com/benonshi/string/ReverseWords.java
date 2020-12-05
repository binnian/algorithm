package com.benonshi.string;

/**
 * @author BenOniShi
 * @date 2020/9/29 15:57
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str.append(reverse(s.substring(x, i)));
                x = ++i;
                str.append(" ");
            }

        }
        if (x < s.length()) {
            str.append(reverse(s.substring(x)));
        }
        return str.toString();
    }


    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Ia love ue"));
    }
}
