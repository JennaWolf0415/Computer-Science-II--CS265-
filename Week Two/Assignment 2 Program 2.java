//summary: This program takes in an array size. It then makes an array of that size and takes in the
//values for that array. It then finds and dispalys the sum and avg of that array.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/22/2023

import java.util.Scanner;   //allows inputs to be made
public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in); //names the input
            int size = 0;   //holds the size data and is set to 0
            int sum = 0;    //holds the sum data and is set to 0
            int avg = 0;    //holds the avg data and is set to 0

            //takes in the size, then declares an array of that size
            System.out.print("Enter the size of your array: ");
            size =  input.nextInt();
            int[] array = new int[size];

            //takes in the values for the array
            System.out.print("Enter your values for the array: ");
            for(int i = 0; i < size; i++)
                array[i] = input.nextInt();

            //finds the sum of the array values
            for(int i = 0; i < size; i++)
                sum += array[i];

            avg = sum / size;   //finds the average

            //displays the sum and average
            System.out.println("sum: " + sum);
            System.out.println("average: " + avg);

        }
    }
