package com.udemy;
import java.util.Arrays;
import java.util.Scanner;

public class sortedArrays {

    public static void main(String[] args) {
        int[] myArray = getIntegers();
        System.out.println(Arrays.toString(myArray));
        int[] sorted = sortedArray(myArray);
        System.out.println(Arrays.toString(sorted));
    }
    public static int[] getIntegers(){
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("enter "+ number + " numbers:");
        int[] myArray = new int[number];
        for (int i=0; i<number ; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static int[] sortedArray(int[] unsorted){
        for (int i=0; i< unsorted.length; i++){
            for (int j=0; j<unsorted.length;j++){
                if (unsorted[i] < unsorted[j]){
                    int a = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j]= a;
                }
            }
        }
        return unsorted;
    }


}
