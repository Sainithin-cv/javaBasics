package com.udemy;

public class dayOfTheWeek {
    public static void main(String... args){
        printDayOfTheWeek(6);
    }
    /*
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid value");
        } */
        public static void printDayOfTheWeek(int day){
            if (day==1){
                System.out.println("monday");
            }  else if (day ==2){
                System.out.println("tuesday");
            }else if (day==3){
                System.out.println("wednesday");
            }else if(day ==4){
                System.out.println("thursday");
            } else if(day==5){
                System.out.println("friday");
            } else if(day==6){
                System.out.println("saturday");
            }else if (day==7){
                System.out.println("sunday");
            }else{
                System.out.println("invalid values");
            }

    }
}
