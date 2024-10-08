//summary: this is a simple state and capital quiz that randomizes the states and capitals and gives the
//user 10 random ones as a quiz
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 03/04/2024


import java.util.*; //allows different lists
import java.util.Arrays;    //allows different array commands
import java.util.Scanner;   //allows inputs to be made

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the input
        //holds the state information
        ArrayList<String> States = new ArrayList<>(Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas",
                "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii",
                "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
                "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana",
                "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York",
                "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island",
                "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah",
                "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"));
        //holds the capitals information
        ArrayList<String> Capitals = new ArrayList<>(Arrays.asList("Montgomery", "Juneau", "Phoenix",
                "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta",
                "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort",
                "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "St. Paul", "Jackson",
                "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe",
                "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg",
                "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier",
                "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"));

        //randomizes the order of the states and capitals
        for(int i = 0; i < States.size(); i++) {
            int seed = (int)(Math.random() * 50);
            String temp = States.get(seed);
            States.set(seed, States.get(i));
            States.set(i, temp);

            temp = Capitals.get(seed);
            Capitals.set(seed, Capitals.get(i));
            Capitals.set(i, temp);
        }

        int correct = 0;    //holds the correct data
        for(int i = 0; i < 10; i++) {
            //asks the user for the capital of a state
            System.out.println("What is the capital of " + States.get(i));
            String answer = input.nextLine();

            String current = Capitals.get(i);   //sets current to the correct capital

            //compares the users answer to the correct answer. Tells them if they are right or wrong.
            if(answer.equalsIgnoreCase(current)) {
                correct++;
                System.out.println("Correct!");
            }
            else
                System.out.println("Wrong! The correct answer is " + Capitals.get(i));
        }

        //tells the user how many they got right.
        System.out.println("You got " + correct + " out of 10!");

    }
}
