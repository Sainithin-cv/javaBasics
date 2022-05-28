package com.udemy;

public class greatestCommonFactor {

    public static void main(String[] args) {
        int gcd= getGreatestCommonDivisor(48,32);
        System.out.println(gcd);
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        int div=1;
        int get = 0;
        if(first< second){
            while(div<=first){
                if (first%div==0 && second%div==0){
                    get= div;
                }
                div++;
            }
            return get;
        }else {
            while(div<=second){
                if (first%div==0 && second%div==0){
                    get= div;
                    System.out.println(get);
                }
                div++;
            }
            return get;
        }
    }
}
