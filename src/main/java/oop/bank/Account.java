package oop.bank;

import java.util.Random;

public class Account {
    private String accountOwner;
    private AcctType acctType;
    private int accountNumber;
    private double balance;
    static String bankName = "KUDA MFB";

    public Account(){
        this.accountOwner = accountOwner;
        this.acctType = acctType;
        this.balance = 0;
    }
    public Account(String accountOwner, AcctType acctType){
        this.accountOwner = accountOwner;
        this.acctType = acctType;
        this.balance = 0;
    }
    public int generateAccount(){
        int min = 1000000000;
        int max = 1999999999;
        Random rand = new Random();
        int accountNumber = rand.nextInt(max - min + 1) + min;
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public String withdraw(int amount){
        double balance = this.balance;
        if(amount > balance){
            return "Nah Nah, you cannot withdraw more than you have";
        }
        else{
            this.balance = balance - amount;
            return "Please take your cash thank you for banking with "+ bankName;
        }
    }
    public double getBalance(){
        return this.balance;
    }
}
