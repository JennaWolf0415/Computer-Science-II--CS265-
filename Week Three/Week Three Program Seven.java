//summary: this program allows the user to enter values into 2 2x2 arrays. It then checks to
//see if they are even based on values and positions.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/30/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names Scanner input
        double[][] arrayOne = new double[2][2]; //holds the arrayOne data
        double[][] arrayTwo = new double[2][2]; //holds the arrayTwo data
        boolean check = true;   //holds the check data

        //fills arrayOne with user input
        System.out.println("Enter your values for your first array");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                arrayOne[i][j] = input.nextDouble();
        }

        //fills arrayTwo with user input
        System.out.println("Enter your values for your second array");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                arrayTwo[i][j] = input.nextDouble();
        }

        //checks to see if values are the same in each array
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                if(arrayOne[i][j] != arrayTwo[i][j]) {
                    check = false;
                    i = 2;
                    j = 2;
                }
            }
        }

        //displays a message based on the value of check
        if(check)
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are not equal");
    }
}
