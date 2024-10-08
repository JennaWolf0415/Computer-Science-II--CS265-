//summary: this program uses the random class to generate 5 random variable between 0 and 100.
//it then tells the user weather those numbers are greater than, less than, or equal to 50
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/05/2023
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random(5); //lets random values be made
        int num = 0;    //holds the num data

        //for loop that iterates until i is greater than 5
        for(int i = 0; i < 5; i++) {
            //generates and displays a random number
            num = ran.nextInt(101);
            System.out.println("Random number: " + num);

            //dispalys weather the number is greater than, less than, or equal to 50
            if(num > 50)
                System.out.println("This number is greater than 50");
            if(num < 50)
                System.out.println("This number is less than 50");
            else
                System.out.println("This number is equal to 50");
        }

    }
}
