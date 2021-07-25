package com.company;

/**
 * inherited class from the account class with an additional withdraw feature
 */
public class SpecialAccount extends Account {

    //default constructor
    public SpecialAccount(){

    }

    /**
     *
     * @param balance
     * @param accountNumber
     */

    //constructor to fill the attributes
    public SpecialAccount(double balance, int accountNumber){
        super(balance, accountNumber);

    }

    /**
     *
     * @param balance take money from the balance attribute
     * @return a boolean to accept or deny a withdraw
     */
    // Overridden function to withdraw over the limit
    @Override
    public boolean withdraw(double balance) {
        if (balance>1000){
            System.out.println("Cannot exceed the limit of 1000 egp");
            return false;
        }

        double temp = getBalance();
        setBalance(temp-balance);

        if ((temp-balance)<0) {
            System.out.println("You are overdraft by :" + (temp - balance));
        }
        return true;
    }

    /**
     *
     * @return A string form of all the attributes values of the current object
     */
    // Overridden toString function to display the attributes in form of a string
    @Override
    public String toString() {
        return "Special Account{" +
                "balance=" + this.getBalance() +
                ", accountNumber=" + this.getAccountNumber() +
                '}';
    }

}
