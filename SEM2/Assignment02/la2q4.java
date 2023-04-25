package SEM2.Assignment02;

public class la2q4 
{
    /*
     * Question 4:
    Define a class called product. Two instance variables of the class are pid (product-id) and 
    price (product price). It consists of one static variable tot_price (total price). Initialize the value 
    of instance variables through parameterized constructor. It consists of a display ( ) method to 
    display the value of instance variables. A person went to market and purchase 5 different 
    products. Using the above mentioned class, display the details of products that the person has 
    purchased. Also, determine how much total amount the person will pay for the purchase of 5 
    products.
     */
    
}

class product {
    int pid;
    double price;
    static double tot_price = 0;

    public product(int pid, double price) {
        this.pid = pid;
        this.price = price;
        tot_price += price;
    }

    public void display() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) {
        product p1 = new product(1, 10.5);
        product p2 = new product(2, 20.75);
        product p3 = new product(3, 5.0);
        product p4 = new product(4, 15.25);
        product p5 = new product(5, 12.5);

        System.out.println("Details of Products Purchased:");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        System.out.println("Total Amount to Pay: " + tot_price);
    }
}






