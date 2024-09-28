//summary: this program uses the double (basic) and the Double (class) to caculate the area of a circle
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/12/2023

public class Main {
    public static void main(String[] args) {
        double radius = 5.7;    //holds the radius data (double basic type)
        //outputs the area of the circle
        System.out.println("The area of a circle with a radius of " + radius + " is " +
                        (radius * radius * Math.PI));

        Double radius2 = 5.7;   //holds the radius data (double class type)
        //outputs the area of the circle
        System.out.println("The area of a circle with a radius of " + radius2 + " is " +
                (radius2 * radius2 * Math.PI));

    }
}
