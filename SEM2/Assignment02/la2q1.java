package SEM2.Assignment02;
/*Question-1:
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
Your number is (415) 555-1212*/
import java.util.*;
public class la2q1 
{
    public static void main(String[] args) {
        Phone num1 = new Phone();
        Phone num2 = new Phone();
        num2.input();
        num1.area_code=212;
        num1.exchange=767;
        num1.number=8900;
        System.out.println("My number is ");num1.display();
        System.out.println("Your number is ");num2.display();

        
    }
}

class Phone {
    int area_code,exchange,number;
    
    //Method to take input from keyobard
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area code : ");this.area_code=sc.nextInt();
        System.out.print("Enter the exchange code : ");this.exchange=sc.nextInt();
        System.out.print("Enter the number : ");this.number=sc.nextInt();
        sc.close();

    }

    //Method to display the data
    public void display(){
        System.out.print("("+area_code+") "+exchange+" - "+number+" .");
    }
}
/*
 * Output:-
 * Enter area code : 212
    Enter the exchange code : 253
    Enter the number : 9932
    My number is (212) 767 - 8900.
    Your number is (212) 253 - 9932.
 */

