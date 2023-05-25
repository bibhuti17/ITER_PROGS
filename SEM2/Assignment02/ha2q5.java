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
import java.util.*;
public class ha2q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomServiceMeal MS1 = new RoomServiceMeal();
        MS1.display();

        //RoomServiceMeal MS2 = new RoomServiceMeal();
        //System.out.print("Enter the name of the food item : ");String name = sc.nextLine();
        //System.out.print("Enter the price of the food item : ");double price = sc.nextDouble();sc.nextLine();
        //System.out.print("Enter the name of the service : ");String Sname = sc.nextLine();
        //System.out.print("Enter the service charges : ");double charges = sc.nextDouble();
        //MS2.display();
        sc.close();
    }
}
interface RestaurantMeal{
    String foodName = "steak dinner";
    double foodPrice = 600;
}
interface HotelService{
    String serviceName = "room service";
    double serviceFee = 24;
    int roomNo = 1202;
} 

class RoomServiceMeal implements RestaurantMeal,HotelService{
    public RoomServiceMeal(){}
     
    public void display(){
        System.out.println("Food ordered is "+foodName+" costing Rs."+foodPrice+"\n Service provided is "+serviceName+" charge is "+serviceFee);
        System.out.println("The total bill to be paid is "+(foodPrice+serviceFee));
    }
}
