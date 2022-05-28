package com.company;
import  java.lang.Math;
import java.util.Scanner;
public class quadratic{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("a:");
        float a= sc.nextFloat();
        System.out.println("b:");
        float b= sc.nextFloat();
        System.out.println("c:");
        float c= sc.nextFloat();
        float d= (b*b)-(4*a*c);
        if (d>=0){
            float r1= (float) ((-b+Math.sqrt(d))/(2*a));
            float r2= (float) ((-b-Math.sqrt(d))/(2*a));
            System.out.println(r1);
            System.out.println(r2);
        }
        else {
            float n= -b/2*a;
            System.out.println(n+ "-i"+Math.sqrt(-d)/2*a );
            System.out.println(n+ "+i"+Math.sqrt(-d)/2*a );
        }
    }
}



