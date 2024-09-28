//summary: this program takes in array values from the user. It then allows them to choose from
//finding the biggest number 1. in the array, 2. in a specific column, or 3. in a specific row
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/29/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the input
        double[][] array = new double[3][3];    //holds the array data
        int choice = 0; //holds the choice data
        int search = 0; //holds the search data
        
        //takes in array values from the user
        System.out.println("Please enter the values for your 3x3 array");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                array[i][j] = input.nextDouble();
        }

        //goes until 4 is entered
        do {
            
            //gets choice from user
            System.out.println("Pick an option: ");
            System.out.println("1. Biggest number in array");
            System.out.println("2. Biggest number in specific column");
            System.out.println("3. Biggest number in specific row");
            System.out.println("4. Quit");
            System.out.print("Choice: ");
            choice = input.nextInt();

            //calls different methods based on choice.
            if(choice == 1)
                locateLargest(array);
            else if(choice == 2) {
                System.out.println("Which column would you like to search? ");
                search = input.nextInt();
                if(search > -1 && search < 3)
                    locateLargestInColumn(array, search);
                else
                    System.out.println("Please enter a proper number next time!");
            }
            else if(choice == 3) {
                System.out.println("Which row would you like to search? ");
                search = input.nextInt();
                if(search > -1 && search < 3)
                    locateLargestInRow(array, search);
                else
                    System.out.println("Please enter a proper number next time!");
            }
            else if(choice != 4)
                System.out.println("Please enter a proper number next time!");

        }while(choice != 4);
    }

    public static void locateLargest(double [][] a) {
        double largest = a[0][0];   //holds the largest data
        int locRow = 0; //holds the locRow data
        int locCol = 0; //holds the locCol data
        
        //finds the largest number in the array
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(a[i][j] > largest) {
                    largest = a[i][j];
                    locRow = i;
                    locCol = j;
                }
            }
        }
        
        //displays the array and the largest number with its index
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        System.out.println("The largest number in the array is " + largest);
        System.out.println("This number is in row " + locRow + " and column " + locCol);
    }
    public static void locateLargestInColumn(double [][] a, int row) {
        double largest = a[0][row]; //holds the largest data
        int index = 0;  //holds the index data
        
        //finds the largest number in the column
        for(int i = 1; i < 3; i++) {
            if(a[i][row] > largest) {
                largest = a[i][row];
                index = i;
            }
        }
        
        //displays the array and the largest number with its index
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        System.out.println("The largest number in the column is " + largest);
        System.out.println("This number is in row " + index);
    }
    public static void locateLargestInRow(double [][] a, int col) {
        double largest = a[col][0]; //holds the largest data
        int index = 0;  //holds the index data
        
        //finds the largest number in the row
        for(int i = 1; i < 3; i++) {
            if(a[col][i] > largest) {
                largest = a[col][i];
                index = i;
            }
        }
    
        //displays the array and the largest number with its index
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        System.out.println("The largest number in the row is " + largest);
        System.out.println("This number is in column " + index);
    }
}
