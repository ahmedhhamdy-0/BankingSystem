package com.company;

public class Client {

    private String name;
    private String address;
    private int phone;
    private long nationalID;
    private Account account;

    public Client() {

    }

    /**
     *
     * @param name Takes the name of the user
     * @param address Takes the address of the user
     * @param phone Takes the phone number of the user
     * @param nationalID Takes the national ID of the user
     * @param account Adds the existing account of the user or a defaulted empty one
     */
    public Client(String name, String address, int phone, long nationalID, Account account) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.nationalID = nationalID;
        this.account = account;

    }

    /**
     *
     * @return A string form of all the attributes values of the current object
     */
    // Overridden toString function to display the attributes in form of a string
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=0" + phone +
                ", nationalID=" + nationalID +
                ", account=" + account +
                '}';
    }


    /**
     *
     * @param name Sets a name
     */
    //setters
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param account Sets an account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     *
     * @param address Sets an address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @param phone Sets a phone number
     */

    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     *
     * @param nationalID Sets the national ID
     */
    public void setNationalID(long nationalID) {
        this.nationalID = nationalID;
    }

    /**
     *
     * @return name
     */
    //getters
    public String getName() {
        return name;
    }

    /**
     *
     * @return Account of the user
     */
    public Account getAccount() {
        return account;
    }

    /**
     *
     * @return phone number
     */
    public int getPhone() {
        return phone;
    }

    /**
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return national ID
     */
    public long getNationalID() {
        return nationalID;
    }
}
