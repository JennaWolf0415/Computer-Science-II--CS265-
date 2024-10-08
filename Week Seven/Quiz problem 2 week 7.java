//summary: This program shuffles and prints the arraylist that is sent over to the shuffle method
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/26/2023 
import java.util.ArrayList; //allows the arraylist object

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();   //holds the list data

        //adds some values to list
        list.add("Hello");
        list.add("There");
        list.add("I");
        list.add("Jenna");
        list.add("Wolf");

        shuffle(list);  //calls the shuffle method
    }

    public static <E> void shuffle(ArrayList<E> list) {
        //loop that goes through each element of list
        for(int i = 0; i < list.size(); i++) {
            int ran = (int)(Math.random() * list.size());   //randomly generates an index value
            
            //swaps the random number with the current array index
            E temp = list.get(i);
            list.set(i, list.get(ran));
            list.set(ran, temp);
        }

        //outputs the array
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
