//summary: This program takes in values for an array of size 10. It then displays the values of the array,
//the max value of the array, and the index of that value
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/22/2023

import java.util.Scanner;   //allows inputs to be made
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the input
        int[] array = new int[10];  //holds the array data (is an array)

        //takes in the values of the array from the user
        System.out.print("Please enter the values of your array (10 of them): ");
        for (int i = 0; i < 10; i++)
            array[i] = input.nextInt();

        //finds the max value and the index of the max value
        int index = 0;
        int max = array[0];
        for(int i = 1; i < 10; i++) {
            if(array[index] < array[i]) {
                max = array[i];
                index = i;
            }
        }

        //outputs the array values, the max value, and the max value index
        System.out.print("Array values: ");
        for(int i = 0; i < 10; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        System.out.println("max value: " + max);
        System.out.println("max value index: " + index);

    }
}
