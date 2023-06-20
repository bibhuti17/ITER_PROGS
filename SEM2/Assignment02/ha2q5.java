package SEM2.Assignment02;
/*Question-5:
Create an interface RestaurantMeal that holds the name and price of a food item served by a 
restaurant. The name is initialized as steak dinner and price is initialized as 600. Create an 
interface HotelService that holds the name of the service, the service fee, and the room number 
to which the service was supplied. Initialize the service as room service, service fee as Rs 24, 
and room number as 1202. Create a RoomServiceMeal class that inherits from both 
RestaurantMeal and HotelService. The RoomServiceMeal class consists of display method
() to display the value of members of interface. Additionally, the display function should 
display the total of the meals plus the room service fee. In a main () function, instantiate a 
RoomServiceMeal object.
Sample Run:
A “steak dinner” costing Rs. 600 is a “room service” provided 
to room 1202 for Rs 24.00 fee.
The total fee to pay is Rs 624. */
import java.util.Scanner;

interface RestaurantMeal {
    String getName();
    double getPrice();
}

interface HotelService {
    String getServiceName();
    double getServiceFee();
    int getRoomNumber();
}

class RoomServiceMeal implements RestaurantMeal, HotelService {
    private String name;
    private double price;
    private String serviceName;
    private double serviceFee;
    private int roomNumber;

    public RoomServiceMeal(String name, double price, String serviceName, double serviceFee, int roomNumber) {
        this.name = name;
        this.price = price;
        this.serviceName = serviceName;
        this.serviceFee = serviceFee;
        this.roomNumber = roomNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }

    @Override
    public double getServiceFee() {
        return serviceFee;
    }

    @Override
    public int getRoomNumber() {
        return roomNumber;
    }

    public void display() {
        System.out.println("Meal: " + getName());
        System.out.println("Price: Rs " + getPrice());
        System.out.println("Service: " + getServiceName());
        System.out.println("Service Fee: Rs " + getServiceFee());
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Total Cost: Rs " + (getPrice() + getServiceFee()));
    }
}

public class ha2q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the meal: ");
        String mealName = scanner.nextLine();

        System.out.print("Enter the price of the meal: ");
        double mealPrice = scanner.nextDouble();

        scanner.nextLine(); // Clear the input buffer

        System.out.print("Enter the name of the service: ");
        String serviceName = scanner.nextLine();

        System.out.print("Enter the service fee: ");
        double serviceFee = scanner.nextDouble();

        System.out.print("Enter the room number: ");
        int roomNumber = scanner.nextInt();

        RoomServiceMeal meal = new RoomServiceMeal(mealName, mealPrice, serviceName, serviceFee, roomNumber);
        meal.display();

        scanner.close();
    }
}
