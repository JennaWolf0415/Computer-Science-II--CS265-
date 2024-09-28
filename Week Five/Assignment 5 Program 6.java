//summary: this program displays and compares arrays of type integer, double, character, and string
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/12/2023
import java.util.Arrays;    //allows more array comands

public class Main {
    public static void main(String[] args) {
        //displays and compares the two integer arrays
        Integer[] intArr1 = { 1, 2, 3, 4, 5 };
        Integer[] intArr2 = { 1, 2, 3, 6, 7 };
        displayArray(intArr1, intArr2);
        System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr1, intArr2));
        System.out.println();

        //displays and compares the two double arrays
        Double[] dArr1 = { 1.1, 3.3, 5.7, 2.4 };
        Double[] dArr2 = { 1.4, 3.3, 5.7, 2.4 };
        displayArray(dArr1, dArr2);
        System.out.println("Integer Arrays on comparison: " + Arrays.compare(dArr1, dArr2));
        System.out.println();

        //displays and compares the two char arrays
        Character[] charArr1 = { 'a', 'b', 'c', 'd', 'e' };
        Character[] charArr2 = { 'e', 'f', 'd', 'g' };
        displayArray(charArr1, charArr2);
        System.out.println("Character Arrays on comparison: " +  Arrays.compare(charArr1, charArr2));
        System.out.println();

        //displays and compares the two string arrays
        String[] strArr1 = { "hello", "hi", "good", "nice" };
        String[] strArr2 = { "sun", "hi", "moon", "tree" };
        displayArray(strArr1, strArr2);
        System.out.println("Integer Arrays on comparison: " + Arrays.compare(strArr1, strArr2));
        System.out.println();
    }

    public static <T> void displayArray(T[] Arr1, T[] Arr2) {
        for(int i = 0; i < Arr1.length; i++)
            System.out.print(Arr1[i] + ", ");
        System.out.println();
        for(int i = 0; i < Arr2.length; i++)
            System.out.print(Arr2[i] + ", ");
        System.out.println();
    }
}
