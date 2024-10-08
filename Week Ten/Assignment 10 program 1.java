//summary: This program takes the MultipleBallApp listing and modifies it to remove the largest
//ball when the - button is pressed. (used code from book, only things modified are the add and subtract
//methods in the MultipleBallPlane class)
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 03/25/2024

package org.example.weektenprogramone;

//all the packages needed to run the program
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import java.util.ArrayList;

import java.lang.reflect.Array;

public class HelloApplication extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        MultipleBallPane ballPane = new MultipleBallPane();
        ballPane.setStyle("-fx-border-color: yellow");

        Button btAdd = new Button("+");
        Button btSubtract = new Button("-");
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btAdd, btSubtract);
        hBox.setAlignment(Pos.CENTER);

        // Add or remove a ball
        btAdd.setOnAction(e -> ballPane.add());
        btSubtract.setOnAction(e -> ballPane.subtract());

        // Pause and resume animation
        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());

        // Use a scroll bar to control animation speed
        ScrollBar sbSpeed = new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPane.rateProperty().bind(sbSpeed.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);

        // Create a scene and place the pane in the stage
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("MultipleBounceBall"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    private class MultipleBallPane extends Pane {
        private Timeline animation;

        public MultipleBallPane() {
            // Create an animation for moving the ball
            animation = new Timeline(
                    new KeyFrame(Duration.millis(50), e -> moveBall()));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play(); // Start animation
        }

        //Section modified for the assignment
        public void add() { //adds a ball with a radius between 2 and 20
            Color color = new Color(Math.random(),
                    Math.random(), Math.random(), 0.5);
            getChildren().add(new Ball(30, 30, (Math.random() * 19) + 2, color));
        }

        //Section modified for the assignment
        public void subtract() {    //subtracts the largest ball from the screen
            if (getChildren().size() > 0) {
                ArrayList<Node> objects = new ArrayList(getChildren());
                ArrayList<Ball> balls = new ArrayList(objects);

                int big = balls.indexOf(balls.get(0));
                Ball current = balls.get(0);
                for(int i = 1; i < getChildren().size(); i++) {
                    if(balls.get(i).getRadius() > current.getRadius()) {
                        big = balls.indexOf(balls.get(i));
                        current = balls.get(i);
                    }
                }

                getChildren().remove(getChildren().get(big));
            }
        }

        public void play() {    //starts the animaton
            animation.play();
        }

        public void pause() {   //pauses the animation
            animation.pause();
        }

        public void increaseSpeed() {   //increases the speed the balls go at
            animation.setRate(animation.getRate() + 0.1);
        }

        public void decreaseSpeed() {   //decreases the speed the balls go at
            animation.setRate(
                    animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
        }

        public DoubleProperty rateProperty() {
            return animation.rateProperty();
        }

        protected void moveBall() { //moves the balls around the screen
            for (Node node: this.getChildren()) {
                Ball ball = (Ball)node;
                // Check boundaries
                if (ball.getCenterX() < ball.getRadius() ||
                        ball.getCenterX() > getWidth() - ball.getRadius()) {
                    ball.dx *= -1; // Change ball move direction
                }
                if (ball.getCenterY() < ball.getRadius() ||
                        ball.getCenterY() > getHeight() - ball.getRadius()) {
                    ball.dy *= -1; // Change ball move direction
                }

                // Adjust ball position
                ball.setCenterX(ball.dx + ball.getCenterX());
                ball.setCenterY(ball.dy + ball.getCenterY());
            }
        }
    }

    class Ball extends Circle {
        private double dx = 1, dy = 1;

        Ball(double x, double y, double radius, Color color) {
            super(x, y, radius);
            setFill(color); // Set ball color
        }
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
