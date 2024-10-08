//summary: this program makes a class called square. This programs uses that classes print method
//to print out the classes values multiple times.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/05/2023

public class Main {
    public static void main(String[] args) {
        square test = new square(); //holds the test data
        System.out.println("length | area");    //outputs a header line
        //for loop that goes until areas for squares 10 to 16 are printed
        for(int i = 10; i < 16; i++) {
            test.setLength(i);
            test.print();
        }
    }

    public static class square {
        double length;  //holds the length data

        //no args constructor
        square() {
            length = 1;
        }

        //constructor that sets data
        square(double temp) {
            length = temp;
        }

        //returns the length variable
        double getLength() {
            return length;
        }

        //returns the area data
        double getArea() {
            return length * length;
        }

        //sets length to the data sent over
        void setLength( double temp) {
            length = temp;
        }

        //prints out the length and area of a square
        void print() {
            System.out.println(length + "     " + getArea());
        }
    }
}
