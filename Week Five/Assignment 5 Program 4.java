//summary: this program uses the rotateLeft method to rotate 2 6 times.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/12/2023
import java.lang.*; //allows the rotateLeft method to be user

public class Main {
    public static void main(String[] args) {
        int a = 2;  //holds the a data and is set to 2

        //loop that goes until 2 has been rotated 6 times
        for(int i = 0; i < 6; i++) {
            a = Integer.rotateLeft(a, 2);
            System.out.println(a);
        }
    }
}
