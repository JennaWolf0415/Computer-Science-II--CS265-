//summary: This program sorts an array from least to most
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/26/2023

import java.util.ArrayList; //allows the arraylist object
import java.util.Scanner;   //allows the scanner object

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the scanner
        ArrayList<Integer> list = new ArrayList<Integer>(); //holds the list data

        //takes in ten integers from the user
        System.out.println("Enter ten integers and this program will find the max: ");
        for(int i = 0; i < 10; i++)
            list.add(input.nextInt());

        sort(list); //calls the sort method
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {

        //for loop goes until entire array has been gone through
        for(int i = 0; i < list.size(); i++) {
            E min = list.get(i);    //holds the min data and sets it to the current lowest index
            int index = i;  //holds the index data and sets it to i

            //loop goes and sees if any elements of the array are smaller. Sets the min and index if so.
            for(int j = i + 1; j < list.size(); j++) {
                if(min.compareTo(list.get(j)) > 0) {
                    min = list.get(j);
                    index = j;
                }
            }

            //switches the two elements.
            E temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }

        //outputs the new sorted array
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
