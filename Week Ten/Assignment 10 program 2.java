//summary: this program takes in a file from the command line and sees if it has the correct groupings
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 03/25/2024

import java.io.*;   //allows file operations
import java.util.*; //allows multiple functions and variable types

public class Main {
    public static void main(String[] args) {
        Stack<Character> chars = new Stack<>(); //creates a stack to hold the chars data

        //makes sure there is a file to open
        if(args.length > 0) {
            File file = new File(args[0]);  //opens the file
            
            //sends an error if the file doesn't exist
            if(!file.exists())
                System.out.println("Error: File either doesn't exist or wont open");
            else {
                //opens and goes through the characters in the file
                try (Scanner input = new Scanner(file)) {
                    while (input.hasNext()) {
                        String temp = input.nextLine();
                        for (int i = 0; i < temp.length(); i++) {
                            char c = temp.charAt(i);
                            
                            //if the character is an opening pair, then  it to chars
                            //if it is closing, it sees if there is a pairing to go with it.
                            //if not, tells the user the source code is wrong and ends the program
                            if(c == '(' || c == '{' || c == '[')
                                chars.push(c);
                            else if(c == ')') {
                                if(!chars.isEmpty() && chars.peek() == '(')
                                    chars.pop();
                                else {
                                    System.out.println("The java source code does not have correct pairing");
                                    System.exit(1);
                                }
                            }
                            else if(c == '}') {
                                if(!chars.isEmpty() && chars.peek() == '{')
                                    chars.pop();
                                else {
                                    System.out.println("The java source code does not have correct pairing");
                                    System.exit(1);
                                }
                            }
                            else if(c == ']') {
                                if(!chars.isEmpty() && chars.peek() == '[')
                                    chars.pop();
                                else {
                                    System.out.println("The java source code does not have correct pairing");
                                    System.exit(1);
                                }
                            }
                        }
                    }
                    System.out.println("The java source coe does have correct pairings");
                } catch (FileNotFoundException e) { //catches a file exception
                    System.out.print("Error: no file exists");
                    System.exit(0);
                }
            }

        }
        else
            System.out.println("Error: No file in command line");
    }
}
