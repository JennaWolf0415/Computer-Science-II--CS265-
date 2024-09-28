//summary: this program finds the time difference in the iterator and get method
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 03/10/2024

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //makes and fills numbers list with 500000 integers
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 5000000; i++)
            numbers.add(i);

        //gets the start time for the iterator method
        long timeStart = System.currentTimeMillis();

        //iterator method
        Iterator<Integer> it = numbers.iterator();;
        int temp = 0;
        while(it.hasNext())
            temp = it.next();

        //gets the end time for the iterator method and displays how long it took
        long timeEnd = System.currentTimeMillis();
        System.out.println("Time for iterator method: " + (timeEnd - timeStart));

        //gets the start time for the get method
        timeStart = System.currentTimeMillis();

        //get method
        for(int i = 0; i < 5000000; i++)
            numbers.get(i);

        //gets the end time for the get method and displays how long it took
        timeEnd = System.currentTimeMillis();
        System.out.println("Time for iterator method: " + (timeEnd - timeStart));
    }
}
