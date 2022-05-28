package com.udemy;
import java.math.*;

public class sumOfFirstLastDigits {
    public static void main(String[] args) {
        int sum= sumFirstAndLastDigit(65364);
        System.out.println(sum);
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }else{
           int lastDigit= number%10;
           while (number>9){
               number /=10;
           }return lastDigit+number;
        }
    }
}
