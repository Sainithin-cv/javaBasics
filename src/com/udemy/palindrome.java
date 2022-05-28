package com.udemy;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();
        if (isPalindrome(number)){
            System.out.println("yes");
        }
        System.out.println("no");
    }
    public  static boolean isPalindrome(int number){
        if (number<0){
            number *= -1;
        }

        int reverse = 0;
        int stored=number;
        while (stored>0){
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored /= 10;
        }
        System.out.println(reverse);
        return reverse == number;
    }
}
