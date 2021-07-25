package com.company;

public class Account {
    private double balance;
    private int accountNumber;

    // Default constructor
    public Account(){
    }

    /**
     *
     * @param balance
     * @param accountNumber
     */
    // Constructor to fill the attributes
    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber=accountNumber;

    }

    /**
     *
     * @param balance
     */
    //setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return balance
     */
    //getters
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @return account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param balance deposits money
     */
    public void deposit(double balance){
        this.balance+=balance;
    }

    /**
     *
     * @param balance withdraws money
     * @return A true or false if the account has sufficient balance
     */
    public boolean withdraw(double balance){
        if(this.balance<balance){
            System.out.println("insufficient funds");
            return false;
        }
        this.balance-=balance;
        System.out.println("you have withdrawn : "+balance);
        return true;
    }


    /**
     *
     * @return A string form of all the attributes values of the current object
     */
    // Overridden toString function to display the attributes in form of a string
    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
