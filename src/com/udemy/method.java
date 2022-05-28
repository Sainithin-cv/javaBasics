package com.udemy;

public class method {
    public static void main(String[] args) {
        //creating another method for repeating same work will reduce a lot of efforts
        //instead of this code, we can directly code by declaring all the variables twice and testing them twice

       double a= score(55, 85, 76); // ravi
       double b=  score(50, 66, 70); //vikram
        if (a>b){
            System.out.println("ravi got more marks than vikram");
        }else {
            System.out.println("vikram got more marks than ravi");
        }
    }
    public static double score(int math, int science, int social){
        double avg= (math+ science+ social)/3d;
        if(avg<=50){
            System.out.println("ur avg is "+avg+", u r not eligible for eamcet");
        }else {
            System.out.println("ur avg is "+avg+",u r eligible to write eamcet");
        }
        return avg; //return -1 is used if there is no useful value found to return, it shows an error 404 message as a result
    }
}
