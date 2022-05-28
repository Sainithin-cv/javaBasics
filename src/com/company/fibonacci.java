package com.company;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
      int a=0, b=1, c=1;
        System.out.println("0");
        System.out.println("1");
        System.out.println("1");
      while (a<n){
          a=b+c;
          if (a>=n)
              break;
          b=c;
          c=a;
          System.out.println(a);
      }

    }
}
