package com.classes;

import com.classes.classesChallenge;

public class main {
    public static void main(String[] args) {
        classesChallenge nithin = new classesChallenge();


        nithin.setAccountNumber("789456");
        nithin.setCustomerName("nithin");
        nithin.setBalance(5000.00);
        nithin.setEmail("nithin@gmail.com");
        nithin.setMobileNumber("9988776655");
        nithin.credit(200);
        nithin.debit(4000);
        nithin.credit(650);


        System.out.println("account number: "+nithin.getAccountNumber());
        System.out.println("customer name: "+nithin.getCustomerName());
        System.out.println("account balance: "+nithin.getBalance());
        System.out.println("customer's email:" + nithin.getEmail());
        System.out.println("mobile number:"+ nithin.getMobileNumber());

        System.out.println("====================================================================================================");

        classesChallenge ram = new classesChallenge();


        ram.setAccountNumber("321456");
        ram.setCustomerName("ram");
        ram.setBalance(15000.00);
        ram.setEmail("ram@gmail.com");
        ram.setMobileNumber("8529631470");
        ram.credit(2200);
        ram.debit(8000);
        ram.credit(1650);


        System.out.println("account number: "+ram.getAccountNumber());
        System.out.println("customer name: "+ram.getCustomerName());
        System.out.println("account balance: "+ram.getBalance());
        System.out.println("customer's email:" + ram.getEmail());
        System.out.println("mobile number:"+ ram.getMobileNumber());
    }
}
