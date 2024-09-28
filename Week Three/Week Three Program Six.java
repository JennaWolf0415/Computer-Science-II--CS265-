//summary: this program displays an array in ascending order based on each column
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 01/29/2023
public class Main {
    public static void main(String[] args) {
        double[][] array = { {5, 3, 8}, {2, 1, 6}, {3, 2, 1} }; //holds the array data
        double temp = 0;    //holds the temp data and is set to 0

        //displays the array
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        //sorts the array into ascending order by each column
        for(int i = 0; i < 3; i++) {
            for(int j = 2; j > 0; j--) {
                for(int n = 0; n < j; n++) {
                    if(array[n][i] > array[n + 1][i]) {
                        temp = array[n][i];
                        array[n][i] = array[n + 1][i];
                        array[n + 1][i] = temp;
                    }
                }
            }
        }

        //displays the array
        System.out.println();
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
