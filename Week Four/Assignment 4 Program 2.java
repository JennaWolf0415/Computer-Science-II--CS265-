//summary: this program makes a class called course. This class has a static variable that adds 1
//everytime a new course variable is made. This program tests that function out.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/05/2023
public class Main {
    public static void main(String[] args) {
        course C1 = new course("CS155", 40, "CS");  //holds the C1 data
        System.out.println("number of courses: " + C1.getNumberOfCourses());    //displays numberOfCourses
        course C2 = new course("CS265", 40, "CS");  //holds the C2 data
        System.out.println("number of courses: " + C1.getNumberOfCourses());    //displays numberOfCourses
        course C3 = new course("CS300", 25, "CS");  //holds the C3 data
        course C4 = new course("CS315", 30, "CS");  //holds the C4 data
        System.out.println("number of courses: " + C1.getNumberOfCourses());    //displays numberOfCourses

    }

    public static class course {
        String name;    //holds the name data
        int numberOfSeats;  //holds the numberOfSeats data
        String department;  //holds the department data
        static int numberOfCourses = 0; //holds the numberOfCourses data (static)

        //no args constructor
        course() {
            name = " ";
            numberOfSeats = 0;
            department = " ";
            numberOfCourses++;
        }

        //constructor that sets data to values sent over
        course(String temp1, int temp2, String temp3) {
            name = temp1;
            numberOfSeats = temp2;
            department = temp3;
            numberOfCourses++;
        }

        //sets name to the value sent over
        void setName (String temp) {
            name = temp;
        }

        //sets numberOfSeats to the value sent over
        void setNumberOfSeats (int temp) {
            numberOfSeats = temp;
        }

        //sets department to the value sent over
        void setDepartment (String temp) {
            department = temp;
        }

        //returns the numberOfCourses data
        static int getNumberOfCourses() {
            return numberOfCourses;
        }
    }
}
