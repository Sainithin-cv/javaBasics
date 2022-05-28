package com.udemy;
import java.util.Scanner;

public class toCheckEvenOrNot {
    public  static  void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
      boolean even=  isEvenNumber(num);
        if (even){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static boolean isEvenNumber(int num){
       while (num % 2 ==0){
           return true;
       }
       return false;
    }
}
