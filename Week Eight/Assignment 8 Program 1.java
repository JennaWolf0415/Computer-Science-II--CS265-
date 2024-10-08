//summary: this program takes in non-repeating integers from the user and then can
//sort, shuffle, or reverse the integers
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 03/08/2024
package org.example.weekeightprogramone;

//allows everything to work
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import java.util.*;
import static javafx.application.Application.launch;

public class WeekEight extends Application {

    TextField userIn = new TextField(); //creates the input text area
    TextArea text = new TextArea(); //creates the text area
    LinkedList<Integer> list = new LinkedList<>();  //hold the list data

    @Override
    public void start(Stage stage) {
        //creates the buttons
        Button srt = new Button("Sort");
        Button shfl = new Button("Shuffle");
        Button rvs = new Button("Reverse");

        //makes the button area
        HBox buttons = new HBox(5);
        buttons.getChildren().addAll(srt,shfl,rvs);
        buttons.setAlignment(Pos.CENTER);

        //adds in the line that asks for user numbers
        HBox userInPane = new HBox(10);
        userInPane.getChildren().addAll(new Label("Enter a number"), userIn);
        userInPane.setAlignment(Pos.CENTER);

        //adds the border plane/organizes everything
        BorderPane bp = new BorderPane();
        bp.setTop(userInPane);
        bp.setCenter(text);
        bp.setBottom(buttons);

        userIn.setOnAction(e -> add()); //sets the add action

        srt.setOnAction(e -> sortL());  //sets the sort action

        shfl.setOnAction(e -> shuffleL());  //sets the shuffle action

        rvs.setOnAction(e -> reverseL());   //sets the reverse action

        //sets the stage/scene (allows program to be scene)
        stage.setTitle("Week 8 Program 1");
        Scene scene = new Scene(bp, 450, 250);
        stage.setScene(scene);
        stage.show();

    }

    //adds the value input to the list if it's not already there
    public void add() {
        //checks to see if integer is already in the list
        if(list.contains(Integer.parseInt(userIn.getText()))) {
            System.out.println("the list already contains " + userIn.getText());
            userIn.clear();
        }
        else {  //adds an integer as long as it is not already on the list
            list.addLast(Integer.parseInt(userIn.getText()));
            output();
            System.out.println("adding " + list.getLast());
        }
    }

    //sorts the list into ascending order
    public void sortL() {
        Collections.sort(list);
        output();
        System.out.println("sorting list...");
    }

    //shuffles the list into a random order
    public void shuffleL() {
        Collections.shuffle(list);
        output();
        System.out.println("shuffling list...");
    }

    //reverses the current order of the list
    public void reverseL() {
        Collections.reverse(list);
        output();
        System.out.println("reversing list...");
    }

    //outputs the list to the screen
    public void output() {
        String temp = "";
        for(int i = 0; i < list.size(); i++) {
            temp += list.get(i) + " ";
        }
        text.setText(temp);
        userIn.clear();
    }

    //launches the program
    public static void main(String[] args) {
        launch();
    }
}
