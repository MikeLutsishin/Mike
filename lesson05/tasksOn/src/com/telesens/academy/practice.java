package com.telesens.academy;

public class practice {
    public static void main(String[] args) {
        String str = "Тhis is is a test";
        String regex = "(\\b\\w+\\b)(\\s)(\\1)";
        String result = str.replaceAll(regex,"$1$2<strong>$3<strong>");
        System.out.println(result);
    }
}
