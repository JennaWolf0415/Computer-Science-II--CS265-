//summary: this program makes a class called student. This program makes an array of
//type student, lets the user fill in the information for each student, and then outputs
//the id and total for each student
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/05/2023
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //lets inputs be made

        //takes in num from the user
        System.out.print("Enter the number of students you want to process: ");
        int num = input.nextInt();
        student[] students = new student[num];  //creates an array of size num

        //makes an empty student for each array cell
        for(int i = 0; i < num; i++) {
            students[i] = new student();
        }

        //lets user fill in all information for a student
        for(int i = 0; i < num; i++) {
            System.out.print("Enter information for student " + (i + 1) +": ");
            students[i].setID(input.nextInt());
            students[i].setExams(input.nextDouble());
            students[i].setQuizzes(input.nextDouble());
            students[i].setAssignments(input.nextDouble());
        }

        //prints a table of students ID and total score
        System.out.println("Student ID | Total Score");
        for(int i = 0; i < num; i++) {
            System.out.printf("%-12d", students[i].getID());
            System.out.println(students[i].getTotal());
        }

    }

    public static class student {
        int ID; //holds the ID data
        double exams;   //holds the exams data
        double quizzes; //holds the quizzes data
        double assignments; //holds the assignments data

        //no args constructor
        student () {
            ID = 0;
            exams = 0;
            quizzes = 0;
            assignments = 0;
        }

        //constructor that sets variables to data sent over
        student (int temp1, double temp2, double temp3, double temp4) {
            ID = temp1;
            exams = temp2;
            quizzes = temp3;
            assignments = temp4;
        }

        //sets ID to the data sent over
        void setID(int temp) {
            ID = temp;
        }

        //sets exams to the data sent over
        void setExams(double temp) {
            exams = temp;
        }

        //sets quizzes to the data sent over
        void setQuizzes(double temp) {
            quizzes = temp;
        }

        //sets assignments to the data sent over
        void setAssignments(double temp) {
            assignments = temp;
        }

        //returns data stored in ID
        int getID() {
            return ID;
        }

        //returns the toal of exams, quizzes, and assignments
        double getTotal() {
            return exams + quizzes + assignments;
        }
    }
}
