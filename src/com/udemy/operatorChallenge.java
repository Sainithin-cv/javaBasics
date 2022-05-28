package com.udemy;

public class operatorChallenge {
    public static  void  main(String args[]){
        double a= 20.00;
        double b= 80.00;
        double c= (a+b)*100.00;
        double d= c% 4.00;
        System.out.println(d);
        boolean e= (d==0)? true:false;
        if (e){
            System.out.println("true, reminder is zero");
        }
        else {
            System.out.println("got some reminder");
        }
    }
}
