package com.udemy;

public class FeetsToCentimeters {
    public static void main(String[] args) {
        double cm= calcFeetAndInchesToCentimeters( 7, 5);
        System.out.println(+ cm+ " centimeters");
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet>=0 && inches>=0 && inches<12){
            double feetsToInches = feet * 12;
            double totalInches = feetsToInches +inches;
            System.out.print(feet +" feets and "+inches + " inches is equal to ");
            return totalInches * 2.54;
        }
        System.out.println("invalid values");
        return -1;
    }
}
