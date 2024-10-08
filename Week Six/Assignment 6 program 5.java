//summary: this program is a simple math quiz that goes until the user gets the correct answer.
//it also tells the user if they entered the same answer twice.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/19/2023

import java.util.Scanner;   //allows inputs to be made
import java.util.ArrayList; //allows the arraylist to be used

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the scanner
        ArrayList<Integer> tries = new ArrayList<>();   //creates the tries arraylist
        int num1 = (int)(Math.random() * 10);   //holds the random num1 data
        int num2 = (int)(Math.random() * 10);   //holds the random num2 data
        int answer; //holds the answer data

        //asks the user for input on the math question
        System.out.print("What is " + num1 + " + " + num2 + "? ");
        do {
            answer = input.nextInt();

            //if answer is correct, exits the loop
            if(answer == (num1 + num2))
                break;
            else {
                //goes through the tries arraylist. If same answer has been entered,
                //tells the user
                for(int i = 0; i < tries.size(); i++) {
                    if(tries.get(i) == answer) {
                        System.out.println("You already tried " + answer + "!");
                        break;
                    }
                }
                tries.add(answer);  //adds answer to tries.
                //gives error message
                System.out.print("Wrong answer. Try Again. What is 5 + 9? ");
            }
        }while(answer != num1 + num2);
        System.out.println("Correct!");
    }
}
