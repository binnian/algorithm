package com.benonshi.string;

/**
 * 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 */
public class LongestPalindrome {

    public String longestPalindrome(String s){
        int len = s.length();
        if (len < 2){
            return s;
        }
        int maxLen = 1;
        int start = 0;

        //dp[i][j] 表示 s,j是否为回文串
        boolean [][] dp = new boolean[len][len];
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (chars[i] != chars[j]){
                    dp[i][j] = false;
                }else {
                    if (i - j < 3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i-1][j+1];
                    }
                }

                if (dp[i][j] && i - j + 1 > maxLen){
                    maxLen = i - j +1;
                    start = i;
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
}
