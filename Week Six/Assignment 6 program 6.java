//summary: this program asks the user how many objects they want to store. It then takes in the weight
//of all objects. It then fills containers with the objects, filling up to 10 pounds per container.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/19/2023
import java.util.Scanner;   //allows the scanner object
import java.util.ArrayList; //allows the arraylist object

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //names the scanner
        ArrayList<Integer> totalWeight = new ArrayList<>(); //holds the totalweight data

        //takes in the number of objects
        System.out.print("How many objects do you have? ");
        int num = input.nextInt();

        //makes an array of items of num size. Then takes in the weight of each item.
        int[] items = new int[num];
        System.out.println("Enter the weight of all objects: ");
        for(int i = 0; i < num; i++) {
            items[i] = input.nextInt();
        }

        int[] bins = new int[num];  //holds the bins data (index of each item)
        boolean bin = false;    //holds the bin data
        
        //loop that goes around and places each object in a bin.
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < totalWeight.size(); j++) {
                
                //if the item can fit in a container that is already made, that is what this loop will do
                if(totalWeight.get(j) + items[i] <= 10) {
                    totalWeight.set(j, totalWeight.get(j) + items[i]);
                    bins[i] = j;
                    bin = true;
                    break;
                }
            }
            
            //places item in a new container if it cant fit in one already made
            if(!bin) {
                totalWeight.add(items[i]);
                bins[i] = totalWeight.size() - 1;
            }
            bin = false;    //sets bin to false
        }

        //outputs how many bins there are and the weight of each item in the bin
        for(int i = 0; i < totalWeight.size(); i++) {
            System.out.print("Bin " + (i + 1) + " contains objects with weights ");
            for(int j = 0; j < bins.length; j++) {
                if(bins[j] == i)
                    System.out.print(items[j] + " ");
            }
            System.out.println();
        }
    }
}
