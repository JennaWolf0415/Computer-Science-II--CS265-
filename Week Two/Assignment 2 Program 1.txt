//summary: This program takes in values for two arrays, finds the average for both, and tells the user
//which average is higher.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/22/2023
import java.util.Scanner; //allows inputs to be made

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the input
        double[] listOne = new double[4];   //holds the listOne data (is an array)
        double[] listTwo = new double[4];   //holds the listTwo data (is an array)

        //takes in the numbers for listOne
        System.out.print("Please input your values for array one: ");
        for(int i = 0; i < 4; i++)
            listOne[i] = input.nextDouble();

        //takes in the numbers for listTwo
        System.out.print("Please input your values for array two: ");
        for(int i = 0; i < 4; i++)
            listTwo[i] = input.nextDouble();

        double avg1 = Avg(listOne); //calls the avg method and sets avg1 to the value returned
        double avg2 = Avg(listTwo); //calls the avg method and sets avg2 to the value returned

        //displays a statement depending on the results of avg1 and avg2
        if(avg1 >= avg2)
            System.out.println("Average of array 1 greater than or equal to array 2");
        else
            System.out.println("Average of array 1 is less than array 2");
    }

    public static double Avg (double [] array) {
        double avg = 0; //holds the avg data and sets it to 0

        //adds together the values in the array
        for(int i = 0; i < 4; i++)
            avg += array[i];
        avg = avg / 4;  //divides the total of the values by 4
        return avg; //returns the avg data
    }
