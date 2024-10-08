//summary: this program uses to stack class to push and pop characters.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/12/2023
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> chars = new Stack<>(); //holds the char data

        //pushes the letters a-g to the chars stack
        chars.push('a');
        chars.push('b');
        chars.push('c');
        chars.push('d');
        chars.push('e');
        chars.push('f');
        chars.push('g');

        //pops out 3 characters from the char stack
        for(int i = 0; i < 3; i++)
            System.out.println(chars.pop());

        //pushes the letters x-z to the chars stack
        chars.push('x');
        chars.push('y');
        chars.push('z');

        //pops out all characters in the stack
        while(!chars.empty())
            System.out.println(chars.pop());
    }
}
