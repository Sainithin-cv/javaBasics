package com.udemy;
import java.util.Scanner;

public class sumAllDigits {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number= input.nextInt();
        System.out.println("sum of all digits is:"+ sumDigits(number));
    }
    public static int sumDigits(int number){
        if (number<10){
            return -1;
        }
        int sum=0;
        while (number>0){
            int digit= number%10;
            sum += digit;
            number /=10;
        }
        return sum;
    }
}
