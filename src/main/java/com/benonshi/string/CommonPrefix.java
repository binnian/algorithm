package com.benonshi.string;

/**
 * @author BenOniShi
 * @date 2020/9/14 15:10
 */
public class CommonPrefix {
    public static String commonPrefix(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return "";
        }
        String str = "";
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
            str = s1.substring(0, i);
        }
        return str;
    }

    public static void main(String[] args) {
        String s = commonPrefix("fltq", "fltqwe");
        System.out.println(s);
    }

}
