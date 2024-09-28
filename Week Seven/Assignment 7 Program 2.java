//summary: this program uses a generic method to remove duplicate items from an array list
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/26/2023

import java.util.ArrayList; //allows arraylist to be used

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(); //holds the list data

        //adds a bunch of variables (including duplicates) to the list
        list.add("hello");
        list.add("yo");
        list.add(3);
        list.add(3);
        list.add("yo");
        list.add(3);
        list.add('a');
        list.add(3);

        removeDuplicates(list); //calls the remove duplicates method

        //prints out remaining variables in the list
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        //goes through each element in the array
        for(int i = 0; i < list.size(); i++) {
            //goes through each element past position i
            for(int j = i + 1; j < list.size(); j++) {
                //if the variable at i matches the variable at j, removes the variable at j and subtracts
                //one from j (in case next variable is also duplicate)
                if(list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;    //returns the new list
    }
}
