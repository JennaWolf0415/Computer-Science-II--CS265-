//summary: this program allows a user to fill 2 2x2 arrays. It then finds the sum of those arrays and
//displays it. It does the same thing for difference, product, and quotient
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/29/2023


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the input
        double[][] A = new double[2][2];    //holds the A data
        double[][] B = new double[2][2];    //holds the B data
        double[][] C = new double[2][2];    //holds the C data

        //gets the user input for the A array
        System.out.println("Enter the content for the first array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                A[i][j] = input.nextDouble();
        }

        //gets the user input for the B array
        System.out.println("Enter the content for the second array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                B[i][j] = input.nextDouble();
        }

        //gets the sum of the two arrays for each cell
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                C[i][j] = A[i][j] + B[i][j];
        }

        //displays the last array
        System.out.println("C array: ");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }

        //gets the user input for the A array
        System.out.println("Enter the content for the first array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                A[i][j] = input.nextDouble();
        }

        //gets the user input for the B array
        System.out.println("Enter the content for the second array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                B[i][j] = input.nextDouble();
        }

        //gets the difference of the two arrays for each cell
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                C[i][j] = A[i][j] - B[i][j];
        }

        //displays the last array
        System.out.println("C array: ");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }

        //gets the user input for the A array
        System.out.println("Enter the content for the first array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                A[i][j] = input.nextDouble();
        }

        //gets the user input for the B array
        System.out.println("Enter the content for the second array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                B[i][j] = input.nextDouble();
        }

        //gets the product of the two arrays for each cell
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                C[i][j] = A[i][j] * B[i][j];
        }

        //displays the last array
        System.out.println("C array: ");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }

        //gets the user input for the A array
        System.out.println("Enter the content for the first array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                A[i][j] = input.nextDouble();
        }
