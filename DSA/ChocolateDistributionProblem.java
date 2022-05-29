package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        /*
        Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a
        packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute
        chocolate packets among M students such that :
    1. Each student gets exactly one packet.
    2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a
        student is minimum.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of chocolate packets");
        int size = sc.nextInt();
        System.out.println("enter number of students");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<size; i++){
            System.out.println("enter number of chocolates in packet "+ i);
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int min = 0;
        int max = size-1;
        int ans = 0;

        while(max-min>n){
            if((arr[max]-arr[min+1])>(arr[max-1]-arr[min])){
                max--;
            }else{
                min++;
            }
        }
        System.out.println(max-min);

    }
}
