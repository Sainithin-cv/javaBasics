package com.company;
import java.util.Locale;
import java.util.Scanner;
public class toCheckGreaterorNot {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner name=new Scanner(System.in);
        String  a=name.nextLine();
        System.out.println(a.toUpperCase(Locale.ROOT));
    }
}
