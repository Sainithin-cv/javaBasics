package com.udemy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class linkedlists {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<String>();
        String[] str = new String[3];
        str[0]="ravi";
        str[1]="ravi1";
        str[2]="ravi2";

        //to add
        li.add("ram");
        li.add("ram2");
        li.add("ram3");
        //to insert
        li.add(2,"ram 2.0");
        li.addAll(List.of(str)); //to convert array into a collection, array holds all similar data types or objrcts but collection can hold both homogenous and heterogenous data types
        //we use a seperate method to print linked list
        li.addFirst("ravi0");
        li.addLast("ravi4");
        printlist(li);
        System.out.println(li.lastIndexOf("ram"));
        System.out.println( li.size());
        Object[] arr = li.toArray();
        System.out.println(arr[2]);


    }
    public static void printlist(LinkedList<String> lin){
        Iterator<String> j = lin.iterator();
        while (j.hasNext()){
            System.out.println(j.next());
        }
    }
}
