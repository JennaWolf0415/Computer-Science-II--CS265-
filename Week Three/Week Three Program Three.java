//summary: this program lets the user fill the array. It then sums all numbers in the array.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/29/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the input
        double[][] array = new double[3][3];    //holds the array data
        double sum = 0; //holds the sum data

        //fills the array with users input
        System.out.println("Please enter your values to fill the 3x3 array");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                array[i][j] = input.nextDouble();
        }

        //sums together all array values
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                sum += array[i][j];
        }

        //displays the array and the sum of all numbers
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        System.out.println("Sum of the numbers of the array is " + sum);
    }
}t
