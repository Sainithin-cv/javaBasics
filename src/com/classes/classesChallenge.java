package com.classes;

public class classesChallenge {
    private String accountNumber;
    private String customerName;
    private String mobileNumber;
    private double balance;
    private String email;

    public void credit(double creditamount){
        this.balance += creditamount;
        System.out.println( creditamount+" is credited, your current balance is "+ balance);
    }

    public  void debit(double debitamount){
        if (balance< debitamount){
            System.out.println("insufficient balance");
        } balance -= debitamount;
        System.out.println(debitamount+" is debited from your account. your current balance is:"+ balance);
    }


    //code - generate - setters and getters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

