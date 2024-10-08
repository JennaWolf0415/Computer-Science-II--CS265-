//summary: this program uses the character class to change numbers in a sentance to X's
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/12/2023
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the scanner as input

        //takes in the sentance from the user
        System.out.println("Please enter a sentance: ");
        String sentance = input.nextLine();

        //outputs an X if the character is a number, otherwise ouputs the character
        for(int i = 0; i < sentance.length(); i++) {
            Character temp = sentance.charAt(i);
            if(Character.isDigit(temp))
                System.out.print("X");
            else
                System.out.print(sentance.charAt(i));
        }

    }
}
