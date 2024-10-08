//summary: this program takes in the size of a 2D array from the user, lets them fill it, and prints it
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/29/2023
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the input
        int col = 0, row = 0;   //holds the col and row data

        //gets the row and column size from the user
        System.out.print("Enter your row size: ");
        row = input.nextInt();
        System.out.print("Enter your column size: ");
        col = input.nextInt();

        double[][] array = new double[row][col];    //creates an array of size row and col

        //gets the array data from the user
        System.out.println("Please enter the values for the array");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++)
                array[i][j] = input.nextDouble();
        }

        //prints the array
        System.out.println();
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
