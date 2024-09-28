//summary: this program is a lottery system in which the user can win in several ways with
//a three digit number
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 03/08/2024

//all the packages needed for this program
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //allows inputs
        List<Integer> winNums = new ArrayList<Integer>();   //holds the winNums data
        List<Integer> userNums = new ArrayList<Integer>();  //holds the userNums data

        //sets the winning number
        winNums.add((int)(Math.random() * 10));
        winNums.add((int)(Math.random() * 10));
        winNums.add((int)(Math.random() * 10));

        //takes in the user number
        System.out.print("Enter your three digit number: ");
        int guess = input.nextInt();

        //makes sure the number is a 3 digit number
        while(guess > 999 || guess < 100) {
            System.out.print("Enter a proper three digit number: ");
            guess = input.nextInt();
        }

        //divides the input number into the userNums list
        userNums.add(guess / 100);
        int nextTwo = guess % 100;
        userNums.add(nextTwo / 10);
        userNums.add(nextTwo % 10);

        //displays the winning number
        System.out.print("Winning numbers: ");
        for(int i = 0; i < 3; i++)
            System.out.print(winNums.get(i));
        System.out.println();

        if(userNums.equals(winNums))    //displays if user guess number correct
            System.out.println("You got it exactly correct! You win $10,000!");
        else if(userNums.containsAll(winNums))  //displays if user guesses numbers correct but not order
            System.out.println("You got the number correct, but not the order! You win $3,000!");
        else {
            //sorts the two lists
            Collections.sort(winNums);
            Collections.sort(userNums);

            //adds the numbers into three lists with two each
            List<Integer> one = Arrays.asList(winNums.get(0), winNums.get(1));
            List<Integer> two = Arrays.asList(winNums.get(0), winNums.get(2));
            List<Integer> three = Arrays.asList(winNums.get(1), winNums.get(2));

            //displays if two numbers match each other in both list
            if(userNums.containsAll(one) || userNums.containsAll(two) || userNums.containsAll(three))
                System.out.println("You got two numbers! You win $2,000!");
            else if(userNums.contains(winNums.get(0)) || userNums.contains(winNums.get(1))
            || userNums.contains(winNums.get(2)))   //displays if one number in both list match
                System.out.println("You got one number! You win $1,000!");
            else    //displays if no numbers match
                System.out.println("Sorry, You didn't get any numbers!");
        }

    }
}
