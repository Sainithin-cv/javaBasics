package com.udemy;
import java.util.Scanner;
public class toCheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        if (n==1 || n==4) System.out.println("not a prime");
        else if (n==2 || n==3 || n==5) System.out.println("it is a prime");
        for (int i=2; i<(n/2) ; i++){
            if (n%i ==0) System.out.println("not a prime");
            else System.out.println("it is a prime");
            break;
        }
    }
}
