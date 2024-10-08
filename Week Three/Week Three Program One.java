//summary: this program displays an array with set values, doubles them, and displays it again
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/29/2023
public class Main {
    public static void main(String[] args) {
        double[][] array = { {1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9} };   //holds the array data

        //displays the array
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        //doubles all values in the array
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                array[i][j] = array[i][j] * 2;
        }

        //dispalys the array
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
