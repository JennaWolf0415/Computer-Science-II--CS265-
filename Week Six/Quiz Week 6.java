//summary: takes in a string from the user and separates it into chars using an arraylist
//name: Jenna Wolf
//class: CS 265, Computer Science II
//instructor: Mr. Waleed Amer
//date: 02/20/2024

import java.util.Scanner;   //allows the scanner object
import java.util.ArrayList; //allows the arraylist object

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the scanner

        //takes in a line from the user
        System.out.println("Enter a line of characters with no spaces between them:");
        String line = input.next();

        //calls the toCharacterArray method and sets chars to the return data
        ArrayList<Character> chars = toCharacterArray(line);

        //outputs each character in chars
        for(int i = 0; i < chars.size(); i++)
            System.out.print(chars.get(i) + " ");
    }

    public static ArrayList<Character> toCharacterArray (String s) {
        ArrayList<Character> chars = new ArrayList<>(); //creates a arraylist called chars

        //adds a new character to chars for every character in s
        for(int i = 0; i < s.length(); i++)
            chars.add(s.charAt(i));

        return chars;   //returns chars
    }
}
