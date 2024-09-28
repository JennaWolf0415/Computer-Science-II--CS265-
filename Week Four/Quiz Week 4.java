//summary: program made for quiz week 4
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/06/2023

public class Main {
    public static void main(String[] args) {
        receipt C1 = new receipt("Tom John", "123 some where", 1234, 3, 10.5, 0.8);
        receipt C2 = new receipt ("Sarah Adam", "1111 some where", 4567, 5, 5.5, 0.8);

        C1.print();
        System.out.println("The total price for this receipt is " + C1.totalPrice());
        System.out.println();
        C2.print();
        System.out.println("The total price for this receipt is " + C2.totalPrice());
    }

    public static class receipt {
        private String name;
        private String address;
        private int ID;
        private int numOfItems;
        private double priceOfitem;
        private double taxPercentage;

        receipt() {
            name = " ";
            address = " ";
            ID = 0;
            numOfItems = 0;
            priceOfitem = 0;
            taxPercentage = 0;
        }

        receipt(String temp1, String temp2, int temp3, int temp4, double temp5, double temp6) {
            name = temp1;
            address = temp2;
            ID = temp3;
            numOfItems = temp4;
            priceOfitem = temp5;
            taxPercentage = temp6;
        }

        double totalPrice() {
            double beforeTax = numOfItems * priceOfitem;
            return (beforeTax * taxPercentage) + beforeTax;
        }
        void print() {
            System.out.println("Customer name: " + name);
            System.out.println("Customer address: " + address);
            System.out.println("receipt ID: " + ID);
            System.out.println("number of items: " + numOfItems);
            System.out.println("price of item: " + priceOfitem);
            System.out.println("tax percentage: " + taxPercentage);
        }
    }
}
