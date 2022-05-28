package com.udemy;

public class perfectNumber {
    public static void main(String[] args) {
      boolean print= isPerfectNumber(28);
        System.out.println(print);
    }
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int div = 1;
        int sum = 0;
        while(div < number){
            if(number % div ==0){
                sum= sum + div;
            }
            div++;
        }
        return sum == number;
    }
}
