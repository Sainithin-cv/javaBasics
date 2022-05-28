package com.udemy;
import java.util.Scanner;

public class fibonacci {
/*
// to print n numbers of fibonacci series

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean yes= scanner.hasNextInt();
        int num= scanner.nextInt();
        if (!yes || num<3) System.out.println("invalid entry");

        int a = 0;
        int b = 1;
        for (int i=0; i<num; i++){
            System.out.print(a+", ");
           int c= a+b;
           a=b;
           b=c;
        }
    }

 */

//to print fibonacci series upto or less than number n
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        boolean yes= scanner.hasNextInt();
        int num= scanner.nextInt();
        if (!yes || num<3) System.out.println("invalid entry");

        int a = 0;
        int b = 1;
        while(a<=num){
            int c= a+b;
            System.out.print(a+", ");
            a=b;
            b=c;
        }
    }
}
