//summary: creates the MyPriorityQueue class and implements the clone method
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 03/25/2024


import java.util.*;

public class Main {
    public static void main(String[] args) throws  CloneNotSupportedException {

        MyPriorityQueue<String> list1 = new MyPriorityQueue<>();    //holds the lsit1 data

        //adds several names to the list
        list1.add("Jacob");
        list1.add("Karl");
        list1.add("Lisa");
        list1.add("Marcy");

        //uses the new clone method to copy list1 to list2
        MyPriorityQueue<String> list2 = list1.clone();

        //outputs both queues
        System.out.println("List One: " + list1);
        System.out.println("List Two: " + list2);
    }

    //class that extends the ProrityQueue class (information from GeeksforGeeks used
    //to work with clone statements)
    static class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {
        @Override   //overrides the clone method to copy the information from the
        //queue that called the method to the temp queue
        public MyPriorityQueue<E> clone() throws CloneNotSupportedException{
            MyPriorityQueue<E> temp = new MyPriorityQueue<E>();
            temp.addAll(this);
            return temp;
        }
    }
}
