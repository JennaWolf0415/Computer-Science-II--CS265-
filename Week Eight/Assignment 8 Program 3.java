//summary: this program sorts point coordinates by y and then by x and displays the first 5
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 03/08/2024
package org.example.weekeightprogramthree;

//imports a bunch of packages
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.stage.Stage;
import java.util.*;


public class weekEightProgramThree extends Application {

    @Override
    public void start(Stage primaryStage) {
        Point2D[] list = new Point2D[100];  //creates a list of 100 points

        //fills all 100 points randomly between 0 and 20
        for(int i = 0; i < 100; i++)
            list[i] = new Point2D((int)(Math.random() * 20),(int)(Math.random() * 20));

        //sorts the points based on y coordinates
        Arrays.sort(list, Comparator.comparingDouble(Point2D::getY));

        //displays the first 5 y coordinates
        System.out.println("Sorted by Y: ");
        for(int i = 0; i < 5; i++)
            System.out.println("Point " + i + ": (" + list[i].getX() + ", " + list[i].getY() + ")");

        //sorts the points based on x coordinates
        Arrays.sort(list, Comparator.comparingDouble(Point2D::getX));

        //displays the first 5 x coordinates
        System.out.println("Sorted by X: ");
        for(int i = 0; i < 5; i++)
            System.out.println("Point " + i + ": (" + list[i].getX() + ", " + list[i].getY() + ")");
    }

    public static void main(String[] args) {
        launch(args);   //launches the program
    }

}
