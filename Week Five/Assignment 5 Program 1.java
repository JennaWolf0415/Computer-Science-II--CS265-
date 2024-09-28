//summary: this program makes a class called vet and pet. It holds information for each type.
//the vet class has an array of the pets that each vet cares for.
//name: Jenna Wolf
//class: Computer Science II, CS-265
//instructor: Mr. Waleed Amer
//date: 02/12/2023
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        vet V1 = new vet("Dr. Sarah Thomas", "123 address", "123-456-7890");    //holds the V1 data
        vet V2 = new vet("Dr. Dalia Jack", "223 address", "222-333-4444");      //holds the V2 data

        //displays each vets data
        V1.displayInfo();
        V2.displayInfo();

        //holds P1-P6 data
        pet P1 = new pet("111", "fluffy", 2, "dog", "M", "Thomas", "111 address", "111-222-3333");
        pet P2 = new pet("222", "wonders", 1, "cat", "M", "Sandra", "234 address", "111-234-3333");
        pet P3 = new pet("333", "fancy", 2, "rabbit", "F", "Laila", "112 address", "111-222-3432");
        pet P4 = new pet("444", "button", 3, "dog", "F", "Jack", "634 address", "111-222-4567");
        pet P5 = new pet("555", "sparkles" , 2, "dog", "F", "Tom", "889 address", "111-222-1254");
        pet P6 = new pet("666", "Lola" , 2, "dog", "F", "William", "345 address", "111-222-8876");

        //adds pets to each vets lists
        V1.addPet(P1);
        V1.addPet(P2);
        V1.addPet(P3);
        V1.addPet(P4);
        V2.addPet(P5);
        V2.addPet(P6);

        P5.displayInformation();    //displays pet 5 information
    }

    public static class vet {
        private String name;    //holds the name data
        private String address; //holds the address data
        private String phoneNum;    //holds the phoneNum data
        private ArrayList<pet> pets = new ArrayList<>();    //holds the pets data (arraylist_

        //no args constructor
        vet() {
            name = " ";
            address = " ";
            phoneNum = " ";
        }

        //constructor
        vet(String temp1, String temp2, String temp3) {
            name = temp1;
            address = temp2;
            phoneNum = temp3;
        }

        //sets the name to the data sent over
        void setName(String temp) {
            name = temp;
        }

        //sets the address to the data sent over
        void setAddress(String temp) {
            address = temp;
        }

        //sets the phoneNum to the data sent over
        void setPhoneNum(String temp) {
            phoneNum = temp;
        }

        //returns the name data
        String getName() {
            return name;
        }

        //returns the address data
        String getAddress() {
            return address;
        }

        //returns the phoneNum data
        String getPhoneNum() {
            return phoneNum;
        }

        //adds a pet to the pets array
        void addPet(pet temp) {
            if(!pets.contains(temp))
                pets.add(temp);
        }

        //removes a pet from the pets array
        void removePet(pet temp) {
            pets.remove(temp);
        }
        //displays all information about a vet
        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phoneNum);
            System.out.println("number of pateints: " + this.pets.size());
            System.out.println();
        }
    }

    public static class pet {
        String ID;  //holds the ID data
        String name;    //holds the name data
        int age;    //holds the age data
        String breed;   //holds the breed data
        String sex; //holds the sex data
        String ownerName;   //holds the ownerName data
        String ownerAdd;    //holds the ownerAdd data
        String ownerPhone;  //holds the ownerPhone data

        //no args constructor
        pet() {
            ID = " ";
            name = " ";
            age = 0;
            breed = " ";
            sex = " ";
            ownerName = " ";
            ownerAdd = " ";
            ownerPhone = " ";
        }

        //constructor
        pet(String temp1, String temp2, int temp3, String temp4, String temp5,
            String temp6, String temp7, String temp8) {
            ID = temp1;
            name = temp2;
            age = temp3;
            breed = temp4;
            sex = temp5;
            ownerName = temp6;
            ownerAdd = temp7;
            ownerPhone = temp8;
        }
        //sets ID to the data sent over
        void setID(String temp) {
            ID = temp;
        }

        //sets name to the data sent over
        void setName(String temp) {
            name = temp;
        }

        //sets age to the data sent over
        void setAge(int temp) {
            age = temp;
        }

        //sets breed to the data sent over
        void setBreed(String temp) {
            breed = temp;
        }

        //sets sex to the data sent over
        void setSex(String temp) {
            sex = temp;
        }

        //sets ownerName to the data sent over
        void setOwnerName(String temp) {
            ownerName = temp;
        }

        //sets ownerAdd to the data sent over
        void setOwnerAdd(String temp) {
            ownerAdd = temp;
        }

        //sets ownerPhone to the data sent over
        void setOwnerPhone(String temp) {
            ownerPhone = temp;
        }

        //returns the ID data
        String getID() {
            return ID;
        }

        //returns the name data
        String getName() {
            return name;
        }

        //returns the age data
        int getAge() {
            return age;
        }

        //returns the breed data
        String getBreed() {
            return breed;
        }

        //returns the sex data
        String getSex() {
            return sex;
        }

        //returns the ownerName data
        String getOwnerName() {
            return ownerName;
        }

        //returns the ownerAdd data
        String getOwnerAdd() {
            return ownerAdd;
        }

        //returns the ownerPhone data
        String getOwnerPhone() {
            return ownerPhone;
        }

        //displays all information about a pet
        void displayInformation() {
            System.out.println("ID: " + ID);
            System.out.println("name: " + name);
            System.out.println("age: " + age);
            System.out.println("breed: " + breed);
            System.out.println("sex: " + sex);
            System.out.println("owner name: " + ownerName);
            System.out.println("owner address: " + ownerAdd);
            System.out.println("owner phone number: " + ownerPhone);
            System.out.println();
        }
    }
}
