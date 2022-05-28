package com.udemy;

public class arrays {
    public static void main(String[] args) {
        //method 1 of declaring arrays
        int[] intArray =new int[5];
        intArray[0]=3;
        intArray[1]=4;
        intArray[2]=5;
        intArray[3]=6;
        intArray[4]=7;
        for (int i=0; i<= (intArray.length-1); i++){
            System.out.println(intArray[i]);
        }
        System.out.println("---------------------------------------------");

        //method 2 of declaring arrays
        int[] intArray2 = {4,5,6,7,8};
        for (int i=0; i<= (intArray2.length-1); i++){
            System.out.println(intArray2[i]);
        }
        System.out.println("---------------------------------------------");

        //method 3 of declaring arrays using for or while loop
        int[] intArray3 = new int[5];
        int count=5;
       for (int i=0; i<=intArray3.length; i++){
           intArray3[i]=count;
           count++;
           System.out.println(intArray3[i]);
       }


    }
}
