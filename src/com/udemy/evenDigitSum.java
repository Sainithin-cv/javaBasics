package com.udemy;

public class evenDigitSum {
    public static void main(String[] args) {
        int evenSum= getEvenDigitSum(123456789);
        System.out.println(evenSum);

    }
    public static int getEvenDigitSum(int number){
        if (number<0){
            return -1;
        }
        else {
            int sum =0;
            while (number>0){
                int digit =number% 10;
                if (digit%2==0){
                    sum = sum + digit;
                }
                number/=10;
            }return sum;
        }
    }
}
