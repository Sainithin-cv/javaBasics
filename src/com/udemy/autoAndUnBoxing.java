package com.udemy;

import java.util.ArrayList;

public class autoAndUnBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        arrli.add(Integer.valueOf(5));
        arrli.add(6);
        System.out.println(arrli.get(0));
        System.out.println(arrli.get(1).intValue());

        //it can be directly added in intellij as the compiler itself does the work for us
    }
}
