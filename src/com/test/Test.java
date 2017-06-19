package com.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String s = "100001abc101";
        find(s);
        String s1 = "1001ab010abc01001";
        find(s1);
        System.err.println("---");
        String s2 = "1001010001";
        find(s2);
    }

    private static void find(String s) {
        Matcher m = Pattern.compile("(.+)\\1+").matcher(s);
        while (m.find()) {
            System.err.println(m.group());
        }
    }
}