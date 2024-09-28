
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/26/2023
import java.util.Scanner;   //allows the scanner object

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the scanner
        Integer[][] list = new Integer[3][3];   //holds the list data

        //takes in integers for the matrix
        System.out.println("Enter ten integers and this program will find the max: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                list[i][j] = input.nextInt();
        }

        //calls the max method and outputs the result
        System.out.println("The max element in the array is: " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];    //holds the max data
        E temp; //holds the temp dat

        //goes through the entire matrix
        for(int i = 0; i < list.length; i++) {
            for(int j = 1; j < list.length; j++) {
                temp = list[i][j]; //sets temp to the next element in the array

                //if temp is larger than max, sets max to temp
                if (temp.compareTo(max) > 0)
                    max = list[i][j];
            }
        }

        return max; //returns max
    }
