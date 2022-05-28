package com.udemy;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum= 0;
        int avg =1;
        int count=1;
        while(true){
            int number= scanner.nextInt();
            boolean yes= scanner.hasNextInt();
            if(!yes){
                break;
            }
            sum+=number;
            avg=(int)  Math.round(sum/count);
            count++;
            scanner.nextLine();
        }
        System.out.println("SUM = "+sum+" AVG = "+avg);
        scanner.close();
    }
}
/* import java.util.Scanner;

public class InputCalculator {
   public static void inputThenPrintSumAndAverage(){
       Scanner scanner = new Scanner(System.in);
           int sum= 0;
           int count=0;
       while(true){
           int number= scanner.nextInt();
           boolean yes= scanner.hasNextInt();
           if(yes){
               sum+=number;
               count++;
           }
           else{
               break;
           }
           scanner.nextLine();
       }
       System.out.println("SUM = "+sum+" AVG = "+Math.round((double) sum/count));
       scanner.close();
   }
}

 */