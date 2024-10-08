//summary: this program makes a matrix of random size and then fills it with 1s and 0s.
//it then finds the row and column with the most 1s in it
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/19/2023

import java.util.Scanner;   //allows the scanner object
import java.util.ArrayList; //allows the arraylist object

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the scanner

        //takes in the size value from the user
        System.out.println("Enter the size of your matrix: ");
        int size = input.nextInt();

        //creats an matrix of size x size
        int ar[][] = new int[size][size];

        //fills the matrix with 1s and 0s
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                ar[i][j] = (int)(Math.random() * 2);
        }

        //outputs the array
        System.out.println("Random array: ");
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++)
                System.out.print(ar[i][j] + " ");
            System.out.println();
        }

        //finds the number of 1s in each row 
        ArrayList<Integer> rowCount = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(ar[i][j] == 1)
                    count++;
            }
            rowCount.add(count);
            count = 0;
        }

        //finds the number of 1s in each col
        ArrayList<Integer> colCount = new ArrayList<>();
        count = 0;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(ar[j][i] == 1)
                    count++;
            }
            colCount.add(count);
            count = 0;
        }

        //outputs which row(s) have the mosts 1s
        System.out.print("Row with the most 1s: ");
        int max = rowCount.get(0);
        int index = 0;
        for(int i = 1; i < size; i++) {
            if(rowCount.get(i) > max) {
                max = rowCount.get(i);
                index = i;
            }
        }
        System.out.print(index + " ");
        for(int i = 0; i < size; i++) {
            if((rowCount.get(i) == max) && (i != index))
                System.out.print(i + " ");
        }

        System.out.println();

        //outputs which col(s) have the mosts 1s
        System.out.print("Col with the most 1s: ");
        max = colCount.get(0);
        index = 0;
        for(int i = 1; i < size; i++) {
            if(colCount.get(i) > max) {
                max = colCount.get(i);
                index = i;
            }
        }
        System.out.print(index + " ");
        for(int i = 0; i < size; i++) {
            if((colCount.get(i) == max) && (i != index))
                System.out.print(i + " ");
        }
    }
}
