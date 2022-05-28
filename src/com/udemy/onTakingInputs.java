package com.udemy;
import java.util.Scanner;

public class onTakingInputs {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int count=0;
        int sum=0;
        while(true){
            System.out.println("enter number #"+ (count+1) + ": ");
            boolean hasNextInt= scanner.hasNextInt();
            if(hasNextInt){
                int num= scanner.nextInt();
                sum += num;
                count++;
                if (count==10){
                    break;
                }
            }else{
                System.out.println("Invalid Integer");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}

