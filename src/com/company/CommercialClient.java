package com.company;

public class CommercialClient extends Client {

    private int commercialID;

    public CommercialClient(){

    }

    /**
     *
     * @param name Takes the name of the user
     * @param address Takes the address of the user
     * @param phone Takes the phone number of the user
     * @param commercialID Takes the Commercial ID of the user
     * @param account Adds the existing account of the user or a defaulted empty one
     */
    public CommercialClient(String name, String address, int phone, int commercialID, Account account) {
        super(name, address, phone, 0, account);
        this.commercialID = commercialID;

    }

    /**
     *
     * @param commercialID Sets Commercial ID
     */
    public void setCommercialID(int commercialID) {
        this.commercialID = commercialID;
    }

    /**
     *
     * @return Commercial ID
     */
    public int getCommercialID() {
        return commercialID;
    }
    /**
     *
     * @return A string form of all the attributes values of the current object
     */
    // Overridden toString function to display the attributes in form of a string
    @Override
    public String toString() {
        return "CommercialClient{" +
                ", name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", phone=0" + this.getPhone() +
                ", commercialID= " + commercialID +
                ", account=" + this.getAccount()+
                '}';
    }
}
