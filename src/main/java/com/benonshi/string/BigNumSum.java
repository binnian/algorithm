package com.benonshi.string;

import java.math.BigDecimal;


/**
 * @author BenOniShi
 * @date 2020/5/24 18:23
 */
public class BigNumSum {

    public static String numSum(String str1, String str2) {
        StringBuilder builder = new StringBuilder();
        int temp = 0;
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        while (i >= 0 || j >= 0) {
            int x1 = i >= 0 ? str1.charAt(i) - '0' : 0;
            int x2 = j >= 0 ? str2.charAt(j) - '0' : 0;
            int sum = x1 + x2 + temp;
            temp = sum / 10;
            builder.append(sum % 10);
            i--;
            j--;
        }
        if (temp == 1) builder.append(1);
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "566544564565464554646646464646649";
        String str2 = "566544551355465465445456456546459";
        System.out.println("numSum(str1,str2) = " + numSum(str1, str2));
        BigDecimal bigDecimal1 = new BigDecimal(str1);
        BigDecimal bigDecimal2 = new BigDecimal(str2);
        System.out.println("bigDecimal1.add(bigDecimal2) = " + bigDecimal1.add(bigDecimal2));
    }
}
