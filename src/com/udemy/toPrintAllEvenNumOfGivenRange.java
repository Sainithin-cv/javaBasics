package com.udemy;
import java.util.Scanner;

public class toPrintAllEvenNumOfGivenRange {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter min:");
        int min= input.nextInt();
        System.out.println("enter max:");
        int max= input.nextInt();
        int count=0;
        if (max<min){
            System.out.println("invalid");
        }else{
        for (int i=min; i<=max; i++){
           if (isEven(i)){
               System.out.println(i);
               count++;
           }

        }
            System.out.println("total even numbers found:"+ count);
        }
    }
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
