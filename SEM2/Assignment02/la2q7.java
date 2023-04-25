package SEM2.Assignment02;
import java.util.Scanner;
public class la2q7 
{
    /*
     * Question-1:
    
     A phone number can be thought of as having three parts: the area code, the exchange code and 
    the number. 
    Example: A phone number, such as (212) 767-8900, can be thought of as having three parts: 
    the area code (212), the exchange (767) and the number (8900).
    Define a class Phone to store these three parts of a phone number separately as instance 
    variable (area_code, exchange, number). The class consists of two member methods: input ( )
    and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.) 
    operator and instance variable with value area_code: 212, exchange: 767, 
    number: 8900), and initialize other from the user through member method input ( ). Display 
    both the numbers.
    
    Sample Run:
    My number is (212) 767-8900
    Your number is (415) 555-1212

     */
    
}



class Phone {
    private int areaCode;
    private int exchange;
    private int number;

    // Constructor to initialize the phone number
    public Phone(int areaCode, int exchange, int number) {
        this.areaCode = areaCode;
        this.exchange = exchange;
        this.number = number;
    }

    // Method to input the phone number from user
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area code: ");
        this.areaCode = sc.nextInt();
        System.out.print("Enter exchange code: ");
        this.exchange = sc.nextInt();
        System.out.print("Enter number: ");
        this.number = sc.nextInt();
        sc.close();
    }

    // Method to display the phone number
    public void display() {
        System.out.println("(" + this.areaCode + ") " + this.exchange + "-" + this.number);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone(212, 767, 8900);
        Phone phone2 = new Phone(0, 0, 0);
        phone2.input();

        System.out.print("My number is ");
        phone1.display();
        System.out.print("Your number is ");
        phone2.display();
    }
}

class a2output
{
/*
 * Enter area code: 415
Enter exchange code: 555
Enter number: 1212
My number is (212) 767-8900
Your number is (415) 555-1212
 */
}