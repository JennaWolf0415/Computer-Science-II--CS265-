//summary: this program takes in a text file and organizes the words into alphabetical order
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 03/10/2024

//all the packages needed
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        //opens the file (can be changed around to work better)
        String userHome = System.getProperty("user.home");
        String path = userHome + File.separator + "Documents//TextDoc.txt";
        File text = new File(path);

        //holds the words data
        List<String> words = new ArrayList<>();

        //tries to take in and seperate the words from the file. errors if file is not found
        try(Scanner input = new Scanner(text)) {
            while(input.hasNext()) {
                String line = input.nextLine();
                String[] wordList = line.split(" ");
                for (String word : wordList) {
                    words.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.print("Error: no file exists");
            System.exit(0);
        }

        //sorts than outputs the words
        Collections.sort(words);
        for(int i = 0; i < words.size(); i++)
            System.out.print(words.get(i) + " ");
    }
}
