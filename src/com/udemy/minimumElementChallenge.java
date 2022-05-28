package com.udemy;
import java.util.Arrays;
import java.util.Scanner;



    public class minimumElementChallenge {
        public static void main(String[] args) {
            int number= readInteger();
            int[] myArray = readElements(number);
            System.out.println("minimum of thelist is "+findMin(myArray));
        }
        private static int readInteger(){
            System.out.println("enter the capacity of array");
            Scanner scanner= new Scanner(System.in);
            int number= scanner.nextInt();
            return number;
        }

        private static int[] readElements(int number){
            System.out.println("enter the list of elements");
            Scanner scanner= new Scanner(System.in);
            int[] myArray= new int[number];
            for(int i=0; i<number; i++){
                myArray[i] = scanner.nextInt();
            }
            System.out.println("the list of numbers you have entered is "+ Arrays.toString(myArray));
            return myArray;
        }

        private static int findMin(int[] myArray){
            for(int i=0; i<myArray.length; i++){
                for(int j=0; j<myArray.length; j++){
                    if(myArray[i]<myArray[j]){
                        int a= myArray[i];
                        myArray[i] = myArray[j];
                        myArray[j] = a;
                    }
                }
            }
            return myArray[0];
        }
    }

