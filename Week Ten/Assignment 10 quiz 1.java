//summary: This program works to find the union, difference, and intersection between two priority queues
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 03/25/2024

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> list1 = new PriorityQueue<>();    //holds the list1 data
        PriorityQueue<String> list2 = new PriorityQueue<>();    //holds the list2 data

        //adds all the names to list1
        list1.add("George");
        list1.add("Jim");
        list1.add("John");
        list1.add("Blake");
        list1.add("Kevin");
        list1.add("Micheal");

        //adds all the names to list2
        list2.add("George");
        list2.add("Katie");
        list2.add("Kevin");
        list2.add("Michelle");
        list2.add("Ryan");

        //outputs both queues
        System.out.println("Priority Queue one: " + list1);
        System.out.println("Priority Queue one: " + list2);

        //finds the unions of the queues and outputs it
        PriorityQueue<String> union = new PriorityQueue<>(list1);
        union.addAll(list2);
        System.out.println("Union: " + union);

        //finds the difference of the queues and outputs it
        PriorityQueue<String> dif = new PriorityQueue<>(list1);
        dif.removeAll(list2);
        System.out.println("Difference (elements of A not in B): " + dif);

        //finds the difference of the queues (reverse) and outputs it
        PriorityQueue<String> dif2 = new PriorityQueue<>(list2);
        dif2.removeAll(list1);
        System.out.println("Difference (elements of B not in A): " + dif2);

        //finds the intersection of the queues and outputs it
        PriorityQueue<String> inter = new PriorityQueue<>(list1);
        inter.retainAll(list2);
        System.out.println("Intersection: " + inter);
    }
}
