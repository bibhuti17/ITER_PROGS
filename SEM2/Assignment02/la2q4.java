package SEM2.Assignment02;
/*
    * Question 4:
    Define a class called product. Two instance variables of the class are pid (product-id) and 
    price (product price). It consists of one static variable tot_price (total price). Initialize the value 
    of instance variables through parameterized constructor. It consists of a display ( ) method to 
    display the value of instance variables. A person went to market and purchase 5 different 
    products. Using the above mentioned class, display the details of products that the person has 
    purchased. Also, determine how much total amount the person will pay for the purchase of 5 
    products.*/
import java.util.*;   
public class la2q4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many products you have to buy purchase : ");int n = sc.nextInt();
        product p[] = new product[n];

        for (int i = 0; i < p.length ; i++){
            p[i] = new product();
            System.out.print("Enter product id : ");p[i].pid=sc.nextInt();
            System.out.print("Enter the price of product : ");p[i].price=sc.nextDouble();
            p[i] = new product(p[i].pid,p[i].price);
        }
        sc.close();

        System.out.println("Details of Products Purchased:");
        for(int i = 0 ; i < p.length;i++){
            p[i].display();
        }

        System.out.println("Total Amount to Pay: " + product.tot_price);
    }
    
}

class product {
    int pid;
    double price;
    static double tot_price = 0;

    product(){

    }

    public product(int pid, double price) {
        this.pid = pid;
        this.price = price;
        tot_price += price;
    }

    public void display() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Price: " + price);
    }

   
}






