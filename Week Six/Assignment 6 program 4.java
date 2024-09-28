//summary: this program finds the area of a convex polygon with n points
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/19/2023

import java.util.Scanner;   //allows inputs to be made

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the scanner

        //takes in the number of points from the user
        System.out.print("How many points do you have? ");
        int num = input.nextInt();

        //makes double arrays of size num for x and y
        double[] x = new double[num];
        double[] y = new double[num];

        //lets the user enter their points
        System.out.println("Enter the coordinates of the points: ");
        for(int i = 0; i < num; i++) {
            x[i] = input.nextDouble();
            y[i] = input.nextDouble();
        }

        //calculates and displays the area of the polygon
        double result = 0;
        int j = num - 1;
        for(int i = 0; i < num; i++) {
            result += (x[j] + x[i]) * (y[j] - y[i]);
            j = i;
        }
        result = Math.abs(result) / 2;
        System.out.println("The total area is " + result);

    }
}
