//summary: the program makes an array of whatever size the user wants and takes names to fill that array.
//it then takes in a name from the user and uses a binary search import to see if the
// name is in the array
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/22/2023

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the input
        int size;   //holds the size data

        //takes in the size and makes an array of that size
        System.out.print("how many names are you entering? ");
        size = input.nextInt();
        String[] names = new String[size];

        //takes in the names from the user
        System.out.print("Please enter the names: ");
        for(int i = 0; i < size; i++)
            names[i] = input.next();

        //takes in the name the user wants to search for
        System.out.print("What name would you like to search for? ");
        String name = input.next();

        //uses the Arrays.sort method to sort the array into order
        Arrays.sort(names);
        //uses the Arrays.binarySearch method to find the name
        int index = Arrays.binarySearch(names, name);

        //outputs the list of names as well as if the name was found or not
        System.out.println("list of names: ");
        for(int i = 0; i < size; i++)
            System.out.print(names[i] + " ");
        System.out.println();
        if(index > 0)
            System.out.println(name + " was found at index " + index);
        else
            System.out.println(name + " was not found");

    }
}
