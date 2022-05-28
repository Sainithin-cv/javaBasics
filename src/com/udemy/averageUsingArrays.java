package com.udemy;
import java.util.Scanner;
//incomplete
public class averageUsingArrays {
    public static void main(String[] args) {
        System.out.println("enter the number of characters you enter");
        Scanner sc = new Scanner(System.in);
        boolean hasNextInt = sc.hasNextInt();
        int number = sc.nextInt();
        if (!hasNextInt) System.out.println("invalid value entered, make sure that you are entering an integer");

        sc.nextLine();

        int[] myArray= new int[number];
        for (int i=0; i<=myArray.length; i++){
           boolean hasInt = sc.hasNextInt();
           myArray[i]= sc.nextInt();
           if (!hasInt) System.out.println("invalid value entered, make sure that you are entering an integer");
       }
        sc.close();
        int sum = sum(myArray);
        int avg = (int) getAverage(sum, number);
        System.out.println(avg);
    }

    public static int sum(int[] myArray){
        int sum=0;
        for (int j : myArray) {
            sum += j;
        }
        return sum;
    }

    public static double getAverage(int sum, int number){
        return (double)sum/ (double) number;
    }
}
