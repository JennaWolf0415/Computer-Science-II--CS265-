//summary: This program takes in an array of elements and finds the maximum one.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/26/2023 
import java.util.Scanner;   //allows the scanner object

 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the scanner
        Integer[] list = new Integer[10];   //holds the list data

        //takes in ten integers from the user
        System.out.println("Enter ten integers and this program will find the max: ");
        for(int i = 0; i < 10; i++)
            list[i] = input.nextInt();

        //calls the max method and outputs the result
        System.out.println("The max element in the array is: " + max(list));
    }

     public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];    //holds the max data
        E temp; //holds the temp dat

         //goes through the entire array
        for(int i = 1; i < list.length; i++) {
            temp = list[i]; //sets temp to the next element in the array
            
            //if temp is larger than max, sets max to temp
            if(temp.compareTo(max) > 0)
                max = list[i];
        }

        return max; //returns max
     }
}
