//summary: this program has the account class and transaction class, which work together
//to keep track of a bank accounts transactions
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/19/2023

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        account a1 = new account("George", 1122, 1000); //holds the a1 data
        a1.setAnnualInterestRate(1.5);

        //deposits and withdraws money from a1
        a1.deposit(30);
        a1.deposit(40);
        a1.deposit(50);
        a1.withdraw(5);
        a1.withdraw(4);
        a1.withdraw(2);

        //outputs all information about the accounts
        System.out.println("Account holder: " + a1.getName());
        System.out.println("Interest Rate: " + a1.getAnnualInterestRate());
        System.out.println("Account balance: " + a1.getBalance());
        for(int i = 0; i < 6; i++) {
            Transaction temp = a1.transactions.get(i);
            System.out.println("Transaction " + (i + 1) + ":");
            System.out.println("Type: " + temp.type);
            System.out.println("Amount of money: " + temp.amount);
            System.out.println("Balance after: " + temp.balance);
            System.out.println("Description: " + temp.description);
            System.out.println("Date made: " + temp.date);
            System.out.println();
        }
    }

    public static class account
    {
        private String name;    //holds the name data
        private int id = 0;                     //holds the id data and sets it to 0
        private double balance = 0;             //holds the balance data and sets it to 0
        private double annualInterestRate = 0;  //holds the annual interest rate data and sets it to 0
        private Date dateCreated = new Date();  //holds the date created data and sets it to the current date
        ArrayList<Transaction> transactions = new ArrayList<>();

        //no args constructor
        account(){
        }

        //constructor that sets the id and balance
        account(int a, double b){
            id = a;
            balance = b;
        }

        //constructor that sets the name, id, and balance
        account(String a, int b, int c) {
            name = a;
            id = b;
            balance = c;
        }

        //gets the name data and returns it
        public String getName() {
            return name;
        }

        //gets the ID data and returns it
        public int getID()
        {
            return id;  //returns the id
        }

        //gets the balance data and returns it
        public double getBalance()
        {
            return balance; //returns the balance
        }

        //gets the annual interest rate data and returns it
        public double getAnnualInterestRate()
        {
            return annualInterestRate * 100;    //returns the annualInterestRate times 100 (turned into percent)
        }

        //gets the date created data and returns it
        public Date getDateCreated()
        {
            return dateCreated; //returns the dateCreated
        }

        //sets name to the value sent ove
        public void setName(String temp) {
            name = temp;
        }

        //sets id to the value sent over
        public void setID(int temp)
        {
            id = temp;  //id is set to temp
        }

        //sets balance to the value sent over
        public void setBalance(double temp)
        {
            balance = temp; //balance is set to temp
        }

        //sets annualInterestRate to the value sent over divided by 100 (makes it a decimal)
        public void setAnnualInterestRate(double temp)
        {
            annualInterestRate = temp / 100;    //annualInterestRate is set to temp divided by 100
        }

        //finds the monthly interest rate and returns it
        public double getMonthlyInterestRate()
        {
            return annualInterestRate / 12; //returns the annualInterestRate divided by 12
        }

        //finds the monthly interest and returns it
        public double getMonthlyInterest()
        {
            return getMonthlyInterestRate() * balance;  //calls the getMonthlyInterestRate method and times it by balance
        }

        //takes money away from the balance varaible
        public void withdraw(double temp)
        {
            balance = balance - temp;   //sets balance to balance minus the temp amount
            String des = (temp + " was withdraw from the account, making the new balance " + balance);
            transactions.add(new Transaction('w', temp, balance, des));
        }

        //puts money in to the balance varaible
        public void deposit(double temp)
        {
            balance = balance + temp;   //sets balance to balance plus the temp amount
            String des = (temp + " was deposited into the account, making the new balance " + balance);
            transactions.add(new Transaction('d', temp, balance, des));
        }
    }

    public static class Transaction {

        private Date date = new Date(); //holds the date data
        private char type;  //holds the type data
        private double amount;  //holds the amount data
        private double balance; //holds the balance data
        private String description; //holds the description data

        //sets the data for the transaction type
         Transaction(char a, double b, double c, String d) {
            type = a;
            amount = b;
            balance = c;
            description = d;
        }

    }
}
