package com.udemy;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class reverseAStrings {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder ans = new StringBuilder(str);
        System.out.println(ans);
        String str2 = new StringBuilder(ans).reverse().toString();//reverses and converts it into a string
        System.out.println(str2);
    }

}
