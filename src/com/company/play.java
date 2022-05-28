package com.company;
import java.util.Scanner;
import java.lang.Math;

public class play {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your marks in m1:");
        int m1= sc.nextInt();
        System.out.println("enter your marks in m2:");
        int m2= sc.nextInt();
        System.out.println("enter your marks in m3:");
        int m3= sc.nextInt();
        float avg= m1+m2+m3/3f;
        if (avg>40.00 && m1>33.00 && m2>33.00 && m3>33.00){
            System.out.println("you are passed");
        }
        else{
            System.out.println("sorry you failed");
        }
    }
}
