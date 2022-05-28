package com.company;
import java.util.Scanner;
public class abrm {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a = 0,b= 1;
       int c = 1;
        System.out.println(a%100000007);
        System.out.println(b%100000007);
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b =c;
            System.out.println(c%100000007);
        }



    }



}


