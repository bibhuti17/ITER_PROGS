package SEM2.Assignment02;
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

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area code : ");this.area_code=sc.nextInt();
        System.out.print("Enter the exchange code : ");this.exchange=sc.nextInt();
        System.out.print("Enter the number : ");this.number=sc.nextInt();
        sc.close();

    }
    public void display(){
        System.out.print("("+area_code+") "+exchange+" - "+number+" .");
    }
}
/*
 * Enter area code : 212
    Enter the exchange code : 253
    Enter the number : 9932
    My number is (212) 767 - 8900.
    Your number is (212) 253 - 9932.
 */

