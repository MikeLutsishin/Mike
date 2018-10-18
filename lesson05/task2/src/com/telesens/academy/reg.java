package com.telesens.academy;
import java.util.regex.Pattern;
public class reg {
    public static void main(String[] args) {
        String[] str = new String[20];
        str[1] = "0.50грн";
        str[2] = "0.5грн";
        str[3] = "12,45руб";
        str[4] = "15,45 руб";
        str[5] = "123$";
        str[6] = "123.$";
        str[7] = "123.00$";
        str[8] = "a12грн";
        str[9] = "0.50грн.";
        str[10] = "0.50грн";
        String regex = "(\\b[\\d]+)(\\.|\\,)?([\\d]+)(\\грн|\\руб|\\$)";
        Pattern p = Pattern.compile(regex);
        for (int i = 1; i<=10; i++) {
            boolean result = Pattern.matches(regex,str[i]);
            System.out.println("Result "+ i + ": " + result);
        }
    }
}
