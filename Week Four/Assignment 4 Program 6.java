//summary: this program uses make the testPoint3D class. It takes in three points from the user and
//find the distance between the first and second point and the first and third point.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/08/2023
import java.lang.Math;  //allows math equations
import java.util.Scanner;   //allows inputs to be made

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the input
        int x, y;   //holds the x and y data

        //takes in the first point
        System.out.print("Enter your values for x1 and y1: ");
        x = input.nextInt();
        y = input.nextInt();
        TestPoint3D point1 = new TestPoint3D(x, y);

        //takes in the second point
        System.out.print("Enter your values for x2 and y2: ");
        x = input.nextInt();
        y = input.nextInt();
        TestPoint3D point2 = new TestPoint3D(x, y);

        //takes in the third point
        System.out.print("Enter your values for x2 and y2: ");
        x = input.nextInt();
        y = input.nextInt();
        TestPoint3D point3 = new TestPoint3D(x, y);

        //finds the distance between the points and displays them
        double Distance1 = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
        double Distance2 = Math.sqrt(Math.pow(point1.x - point3.x, 2) + Math.pow(point1.y - point3.y, 2));
        System.out.println("the distance between the first point and second point is: " + Distance1 );
        System.out.println("the distance between the first point and third point is: " + Distance2 );
    }

    public static class TestPoint3D {
        int x, y;   //holds the x and y data

        //no args constructor
        TestPoint3D() {
            x = 0;
            y = 0;
        }

        //constructor that sets x and y
        TestPoint3D(int temp1, int temp2) {
            x = temp1;
            y = temp2;
        }

        //sets x to the value sent over
        void setX(int temp) {
            x = temp;
        }

        //sets y to the value sent over
        void setY(int temp) {
            y = temp;
        }
    }
}
