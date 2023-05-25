package SEM2.Assignment02;
/*Question-1:
A sales person is paid commission based on the sales he makes as shown by the following
table:
    SALES                   COMMISSION
Under Rs. 100               2% of SALES
Rs 100 and under Rs 500     3% of SALES
Rs 500 and under Rs 5000    5% of SALES
Rs 5000 and above           8% of SALES
Write a class, Commission, which has:
 An instance variable, sales; an appropriate constructor; and a method, getCommission()
that returns the commission.
Now write a Demo class in Java to test the Commission class by reading a sale from the
user, using it to create a Commission object after validating that the value is not negative.
Finally, call the getcommission() method to get and print the commission. 
If the sales are negative, your Demo class should print the message “Invalid Input” */
import java.util.*;
public class ha2q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Commission commission = new Commission();
        System.out.print("Enter the sales amount : ");
        int sale = sc.nextInt();
        sc.close();
        if (sale < 0){
            System.out.println("Invaid input!!");
        }
        else {
            commission= new Commission(sale);
        }
        System.out.println("The salesman will get a commision of "+commission.getCommission(sale)+" .");
    }
}
class Commission{
    int sales;
    public Commission(){}

    public Commission(int sales){
        this.sales = sales;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales amount : ");sales = sc.nextInt();
        sc.close();
    }
    public double getCommission(int s){
        if (s > 0 && s < 100)
            return (s*(2.0/100));
        else if (s >= 100 && s < 500)
            return (s*(3.0/100));
        else if (s >= 500 && s < 5000)
            return (s*(5.0/100));
        else return (s*(8.0/100));
    }

}
/*Output:
 *  Enter the sales amount : 541255
    The salesman will get a commision of 43300.4.
 */