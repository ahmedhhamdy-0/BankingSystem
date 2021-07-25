

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private static String name;
    private static String address;
    private static int phone;
    private static ArrayList<Account> accounts = new ArrayList<Account>();
    private static ArrayList<Client> clients = new ArrayList<Client>();

    /**
     *
     * @param name Takes the name of the user
     * @param address Takes the address of the user
     * @param phone Takes the phone of the user
     * @param accountObj passed to the constructor to add an account to the bank class
     * @param clientObj passed to the constructor to add a client to the bank class
     */
    // A constructor to fill the attributes
    public Bank(String name, String address, int phone, Account accountObj, Client clientObj) {

        this.name = name;
        this.address = address;
        this.phone = phone;
        accounts.add(accountObj);
        clients.add(clientObj);
    }

    /**
     *
     * @param phone sets the phone
     */
    // setters
    public static void setPhone(int phone) {
        Bank.phone = phone;
    }

    /**
     *
     * @param name sets the name
     */
    public static void setName(String name) {
        Bank.name = name;
    }

    /**
     *
     * @param address sets the address
     */
    public static void setAddress(String address) {
        Bank.address = address;
    }

    /**
     *
     * @param accounts adds an account to the accounts list
     */
    public static void setAccounts(ArrayList<Account> accounts) {
        Bank.accounts = accounts;
    }

    /**
     *
     * @param clients adds a client to the clients list
     */
    public static void setClients(ArrayList<Client> clients) {
        Bank.clients = clients;
    }

    /**
     *
     * @return name
     */
    //getters
    public static String getName() {
        return name;
    }

    /**
     *
     * @return address
     */
    public static String getAddress() {
        return address;
    }

    /**
     *
     * @return phone
     */
    public static int getPhone() {
        return phone;
    }

    /**
     *
     * @return accounts list
     */
    public static ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     *
     * @return clients list
     */
    public static ArrayList<Client> getClients() {
        return clients;
    }

    /**
     *
     * @param clientObj to add a client to a bank object
     * @param accountObj to add an account to bank object
     */
    public void addDetails(Client clientObj, Account accountObj){
        this.accounts.add(accountObj);
        this.clients.add(clientObj);
    }

    /**
     *
     * @return the selected account
     */
    // A get function to help in getting a specific account's data
    public static Account getAccount(){
        Scanner methodInput = new Scanner(System.in);

        System.out.println("which account do you want ? (choose by the order)");
        int order = methodInput.nextInt();

        return accounts.get(order-1);
    }

    /**
     * @return clients list
     */
    // A function to display user names
    public static void displayUsers(){

        for (int j=0 ; j<clients.size();j++) {
            System.out.println("The list of clients : "+ (j+1) +" :" + clients.get(j));
        }

    }
}
