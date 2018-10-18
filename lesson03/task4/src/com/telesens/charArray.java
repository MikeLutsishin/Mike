package com.telesens;
import java.util.Scanner;
public class charArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String[] str = in.nextLine().split("");
        String[] strOut = new String[20];
        String[] strOutNum = new String[20];
        int k =0; int z = 0;
        for (int i = 0; i < str.length; i++) {
            if (str.length != 0) {
                if (str[i].matches("^[0-9]+$")) {
                    strOutNum[k] += str[i];
                    k++;
                } else {
                    strOut[z] += str[i];
                    z++;
                }
            }
        }
        System.out.println(strOut[0]);
        System.out.println(strOutNum[1]);
    }
}
