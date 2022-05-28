package com.udemy;

public class whileLoop {
    public static void main(String args[]){
//1
        int count=1;
        while (count!=6){
            System.out.println("count is "+ count);
            count++;
        }
        System.out.println("_________________________________________");

// 2
        count=1;
        do {
            System.out.println("count is "+ count);
            count++;
        }while (count !=6);

        System.out.println("_________________________________________");

//3
        count=1;
        while (true){
            if (count==6){
                break;
            }
            System.out.println("count is "+ count);
            count++;
        }

        System.out.println("_________________________________________");
//4

        for (int i=1; i<6; i++){
            System.out.println("count is "+ i);

        }

    }
}
