//summary: This program has a method that performs a linear search on a array and returns the index
//that variable is found at
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/26/2023 

public class Main {
    public static void main(String[] args) {
        Character[] list = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};    //holds the list data

        //calls the linear search and outputs the results with text to tell the user whats happening
        System.out.println("character e found at index: " + linearSearch(list, 'e'));
        System.out.println("character b found at index: " + linearSearch(list, 'b'));
        System.out.println("character l found at index: " + linearSearch(list, 'l'));

    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        int index = -1; //holds the index data

        //searches through the array until variable is found or whole array is searched
        for(int i = 0; i < list.length; i++) {
            //if variable is found, sets index to i and breaks loop
            if(list[i] == key) {
                index = i;
                break;
            }
        }

        return index;   //returns index
    }
}
