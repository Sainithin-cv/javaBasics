package com.udemy;

public class RangeOfDatatype {
    public static void main(String... args){
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        byte c=Byte.MAX_VALUE;
        byte d=Byte.MIN_VALUE;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        int e= a+1;
        int f=b-1;
        System.out.println(f); //underflow condition, actually it should give --2147483648, but it is out of the range of int.so, a cycle happens and it gives the max int value
        System.out.println( e); // overflow condition
    }
}
