
package com.telesens.academy;
import java.util.regex.Pattern;
public class dates {
    public static void main(String[] args) {
        String[] str = new String[20];
        str[1] = "2012/09/18 12:10";
        str[2] = "2013/09/09 09:09";
        str[3] = "2013/9/09 09:09";

        String regex = "([\\d]{4})/([\\d]{2})/([\\d]{2})\\s([\\d]{2}):([\\d]{2})";
        Pattern p = Pattern.compile(regex);
        for (int i = 1; i<=3; i++) {
            boolean result = Pattern.matches(regex,str[i]);
            System.out.println("Result "+ i + ": " + result);
        }
    }
}