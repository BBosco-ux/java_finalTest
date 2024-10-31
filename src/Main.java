//You are tasked with designing a vehicle rental system.
// The system has to manage different types of vehicles (cars, trucks and motorcycles).
// It also needs to save information about customers who rent these vehicles.
//Vehicle information:
//license plate
//colour
//price per day
//Customer information:
//Name
//Address
//Age
//When designing this system, have in mind the features that the users will need:
//check if the vehicle is currently free or rented out
//calculate total rental price for the customer
//get a list of max last 5 rentals per vehicle
public class Main {
    public static void menu(){
        System.out.println("1-add vehicle");
        System.out.println("2-add customer");
        System.out.println("3-rent vehicle");
        System.out.println("4-return vehicle");
        System.out.println("6-list vehicles");
        System.out.println("7-list customers");
        System.out.println("8-list rentals");
        System.out.println("9-list rentals per vehicle");
        System.out.println("10-list rentals per customer");
        System.out.println("5-exit");

    }
    public static void main(String[] args) {
       menu();

        String licence, colour,name,address;
        double price;
        int customerID;
        int age;
        price = 100;
        licence = "123456789";
        colour = "red";
        name = "alex";
        address = "kampala";
        age = 20;
        if (licence == licence){
            System.out.println("vehicle is free");
        }
        else{
            System.out.println("vehicle is rented");
        }
        System.out.println(licence);
        System.out.println("clour: " + colour);
        System.out.println("price: " + price);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
        System.out.println("age: " + age);

        switch (licence){
            case "123456789":
                System.out.println("vehicle is free");
                break;
            default:
                System.out.println("vehicle is rented");
        }


        System.out.println("1-add vehicle");

        System.out.println("2-add customer");
        System.out.println("3-rent vehicle");
        System.out.println("4-return vehicle");
        System.out.println("5-exit");
        System.out.println("6-list vehicles");

    }
}