package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Islam Ahmed Mohamed Saber
 * @Date 29/4/2021
 */
public class Main {

    public static void main(String[] args) {



        while (true){
            //messages to the user
            System.out.println("Hello , what do you want ?");
            System.out.println("press 1 to register a new bank account");
            System.out.println("press 2 to see your account details");
            System.out.println("press 3 to exit");

            //taking inputs
            Scanner input = new Scanner(System.in);
            Scanner input2= new Scanner(System.in);
            int choice = input.nextInt();

            //menu for the user to choose from
            if (choice ==1){

                System.out.println("press 1 for normal account or 2 for special account or 3 commercial account");
                int choice2= input.nextInt();

                if (choice2==1){

                    Random rand = new Random();
                    int upperbound= 100;
                    int accNumber = rand.nextInt(upperbound);


                    System.out.println("What is your name ? ");
                    String usersName= input2.nextLine();

                    System.out.println("What is your phone number ?");
                    int usersPhone = input.nextInt();

                    System.out.println("What is your address ?");
                    String usersAddress=input2.nextLine();

                    System.out.println("What is your national ID ?");
                    int usersID = input.nextInt();

                    Account usersAccount = new Account(0,accNumber);

                    Client user = new Client(usersName,usersAddress,usersPhone,usersID,usersAccount);

                    Bank bankAccount = new Bank(usersName,usersAddress,usersPhone,usersAccount,user);




                }
                else if (choice2==2){
                    Random rand = new Random();
                    int upperbound= 100;
                    int accNumber = rand.nextInt(upperbound);

                    System.out.println("What is your name ? ");
                    String usersName= input2.nextLine();

                    System.out.println("What is your phone number ?");
                    int usersPhone = input.nextInt();

                    System.out.println("What is your address ?");
                    String usersAddress=input2.nextLine();

                    System.out.println("What is your national ID ?");
                    int usersID = input.nextInt();

                    SpecialAccount usersAccount = new SpecialAccount(0,accNumber);

                    Client user = new Client(usersName,usersAddress,usersPhone,usersID,usersAccount);

                    Bank bankAccount = new Bank(usersName,usersAddress,usersPhone,usersAccount,user);

                }
                else if (choice2==3){
                    Random rand = new Random();
                    int upperbound= 100;
                    int accNumber = rand.nextInt(upperbound);

                    System.out.println("What is your name ?");
                    String usersName = input2.nextLine();

                    System.out.println("What is your phone number ?");
                    int usersPhone = input.nextInt();

                    System.out.println("What is your address ?");
                    String usersAddress=input2.nextLine();

                    System.out.println("What is your commercial ID ?");
                    int usersID = input.nextInt();

                    Account usersAccount = new Account(0,accNumber);

                    CommercialClient user = new CommercialClient(usersName,usersAddress,usersPhone,usersID,usersAccount);

                    Bank bankAccount = new Bank(usersName,usersAddress,usersPhone,usersAccount,user);


                }
            }
            else if(choice==2){
                Bank.displayUsers();

                Account temp = new Account();

                System.out.println("press 1 to deposit/withdraw or press 2 to go back to the main menu");
                int choose =input.nextInt();

                if (choose==1){

                     temp = Bank.getAccount();
                     System.out.println("press 1 to deposit or press 2 to withdraw");
                     int select = input.nextInt();

                     if(select == 1) {
                         System.out.print("How much do you want to deposit : ");
                         int money = input2.nextInt();
                         temp.deposit(money);
                     }
                     else if(select ==2) {
                         System.out.print("How much do you want to withdraw : ");
                         int money = input2.nextInt();
                         temp.withdraw(money);
                     }
                }
                else if (choose==2){
                    continue;
                }
            }
            else if (choice==3){
                return;
            }
            else{
                return;
            }

        }

    }
}
