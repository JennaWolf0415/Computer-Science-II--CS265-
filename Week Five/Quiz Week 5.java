//summary: this program uses make the CS155TwoPoints class. This class can find the distance and midpoint
//between two points
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/13/2023
import java.lang.Math;  //allows math equations

public class Main {
    public static void main(String[] args) {
        //finds the distance and midpoint for C1
        CS155TwoPoints C1 = new CS155TwoPoints();
        System.out.println("Distance between points: " + C1.getDistance());
        C1.getMidPoint();

        //finds the distance and midpoint for C2
        CS155TwoPoints C2 = new CS155TwoPoints();
        C2.setPointOne(-1, 1);
        C2.setPointTwo(3, 4);
        System.out.println("Distance between points: " + C2.getDistance());
        C2.getMidPoint();

    }

    public static class CS155TwoPoints {
        private double X1;  //holds the X1 data
        private double Y1;  //holds the Y1 data
        private double X2;  //holds the X2 data
        private double Y2;  //holds the Y2 data

        //no args constructor
        CS155TwoPoints() {
            X1 = 0;
            Y1 = 0;
            X2 = 1;
            Y2 = 1;
        }

        //sets pointOne to the values sent over
        void setPointOne(double X1, double Y1) {
            this.X1 = X1;
            this.Y1 = Y1;
        }

        //sets pointTWo to the values sent over
        void setPointTwo(double X2, double Y2) {
            this.X2 = X2;
            this.Y2 = Y2;
        }

        //gets the distance between the two points
        double getDistance() {
            return Math.sqrt(Math.pow(X1 - X2, 2) + Math.pow(Y1 - Y2, 2));
        }

        //gets the midpoint of the two points
        void getMidPoint() {
            double Midx = (X1 - X2) / 2;
            double Midy = (Y1 - Y2) / 2;
            System.out.println("MidPoint: (" + Midx + ", " + Midy + ")");
        }
    }
}
