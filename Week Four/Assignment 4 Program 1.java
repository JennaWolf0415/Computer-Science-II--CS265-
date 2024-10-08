//summary: this program makes a class called course. This holds the name, section, number of students,
// and location for a course. This program takes in user input and then displays it
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/05/2023
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //lets inputs be made
        course user = new course(); //holds the user data

        //takes in all information from user
        System.out.print("Enter the name of your course: ");
        user.setName(input.next());
        System.out.print("Enter the section for your course: ");
        user.setSection(input.next());
        System.out.print("Enter the number of students for your course: ");
        user.setNumberStudents(input.nextInt());
        System.out.print("Enter the location of your course: ");
        user.setLocation(input.next());

        //outputs all information from user
        System.out.println("Course name: " + user.getName());
        System.out.println("Course section: " + user.getSection());
        System.out.println("Course number of students: " + user.getNumberStudents());
        System.out.println("Course location: " + user.getLocation());
    }

     public static class course {
        String name;    //holds the name data
        String section; //holds the section data
        int numberStudents; //holds the numberStudents data
        String location;    //holds the location data

         //no args constructor
        course() {
            name = " ";
            section = " ";
            numberStudents = 0;
            location = " ";
        }

        //constructor with 4 arguments
        course(String temp1, String temp2, int temp3, String temp4) {
            name = temp1;
            section = temp2;
            numberStudents = temp3;
            location = temp4;
        }

        //sets the name variable to the value sent over
        void setName(String temp) {
            name = temp;
        }

         //sets the name section to the value sent over
        void setSection(String temp) {
            section = temp;
        }

         //sets the name numberStudents to the value sent over
        void setNumberStudents(int temp) {
            numberStudents = temp;
        }

         //sets the name location to the value sent over
        void setLocation(String temp) {
            location = temp;
        }

        //returns the name data
        String getName() {
            return name;
        }

         //returns the section data
        String getSection() {
            return section;
        }

         //returns the numberStudents data
        int getNumberStudents() {
            return numberStudents;
        }

         //returns the location data
        String getLocation() {
            return location;
        }
    }
}
