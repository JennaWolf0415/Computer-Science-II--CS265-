//summary: This program remakes the generic stack class to work with regular arrays. When an element
//is trying to be added to a full array, a new array of double the size is created.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/26/2023

public class Main {
    public static void main(String[] args) {
        GenericStack<Object> array = new GenericStack<>();  //holds the array data

        System.out.println(array.peek());   //tries to peek, which returns a null

        //pushes in elements of all different data types
        array.push("Word");
        array.push(3);
        array.push(7.75);
        array.push('c');

        //shows the current size of the array and well as peeking on the last variable added
        System.out.println("current size of array: " + array.getSize());
        System.out.println(array.peek());

        //pushes in elements of all different data types again
        array.push("Hello");
        array.push(5);
        array.push("Yo");

        //shows the current size of the array, pops and element, and peeks an element
        System.out.println("current size of array: " + array.getSize());
        System.out.println(array.pop());
        System.out.println(array.peek());

    }

    public static class GenericStack<E> {
        private int size = 0;   //holds the size data
        private E[] list = (E[])new Object[5];  //holds the lsit data

        //returns the size of the array
        public int getSize() {
            return size;
        }

        //shows the last variable added to the array
        public E peek() {
            if(size != 0)
                return list[size - 1];
            else
                return null;
        }

        //adds a variable to the list
        public void push(E temp) {
            size++;
            list[size - 1] = temp;

            //if all spots have been used up, makes a new array of double the size
            //and copies over the variables
            if(size == list.length) {
                E[] tempList = list;
                list = (E[])new Object[size * 2];
                for(int i = 0; i < size; i++)
                    list[i] = tempList[i];
            }
        }

        //returns and removes the last element from the array
        public E pop() {
            if(size != 0) {
                E temp = list[size - 1];
                list[size - 1] = null;
                size--;
                return temp;
            }
            else
                return null;
        }

        //returns true if list has no elements yet
        public boolean isEmpty() {
            if(size == 0)
                return true;
            else
                return false;
        }

        //returns a to string method for the array
        public String toString() {
            return "Array: " + list.toString();
        }
    }
}
