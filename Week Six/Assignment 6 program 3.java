//summary: this program takes in 10 integers from the user. It then removes any repeating integers
//and displays the remaining ones
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/19/2023
import java.util.ArrayList; //allows the arraylist object
import java.util.Scanner;   //allows the scanner objects

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the scanner
        ArrayList<Integer> ar = new ArrayList<>();  //holds the ar data

        //takes in 10 integers
        System.out.println("Input 10 integers: ");
        for(int i = 0; i < 10; i++)
            ar.add(input.nextInt());

        //goes through the array list and removes any repeating integers
        for(int i = 0; i < ar.size(); i++) {
            for(int j = i + 1; j < ar.size(); j++) {
                if(ar.get(i) == ar.get(j)) {
                    ar.remove(j);
                }
            }
        }

        //outputs the remaining integers
        System.out.print("Distinct Integers: ");
        for(int i = 0; i < ar.size(); i++)
            System.out.print(ar.get(i) + " ");
    }
}
