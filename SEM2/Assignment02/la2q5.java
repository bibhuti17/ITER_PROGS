package SEM2.Assignment02;

/* Question-5:
    Define a class Deposit. The instance variable of the class Deposit are mentioned below.
    Instance variable   Datatype
    Principal           Long 
    Time                Integer
    rate                Double
    Total_amt           Double
    Initialize the instance variables Principal, Time, rate through constructors. Constructors are 
    overloaded with the following prototypes. 
    Constructor1: Deposit ( )
    Constructor2: Deposit (long, int, double)
    Constructor3: Deposit (long, int)
    Constructor4: Deposit (long, double)
    Apart from constructor, the other instance methods are (i) display ( ): to display the 
    value of instance variables, (ii) calc_amt( ) to calculate the total amount. 
    Total_amt = Principal + (Principal×rate×Time)/100;*/
import java.util.*;
public class la2q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deposit D = new Deposit();
        System.out.println("What do you want to enter Principal(P) or Rate(r) or Time(t) : ");
        System.out.print("Options available you - (PR/PT/PRT) : ");
        String input = sc.next();
        switch(input){
        case "PR" -> 
        {
            System.out.print("Enter principal amount :");D.Principal = sc.nextLong();
            System.out.print("Enter the rate of interest : ");D.rate= sc.nextDouble();
            D.calc_amt();D.display();
        }
        case "PT" ->
        {
            System.out.print("Enter the principal amount : ");D.Principal = sc.nextLong();
            System.out.print("Enter the time : ");D.Time = sc.nextInt();
            D.calc_amt();D.display();
        }
        case "PRT" ->
        {
            System.out.print("Enter the principal amount : ");D.Principal = sc.nextLong();
            System.out.print("Enter the rate of interest : ");D.rate= sc.nextDouble();
            System.out.print("Enter the time : ");D.Time = sc.nextInt();
            D.calc_amt();D.display();
        }
        }
        sc.close();
        
    }
}

class Deposit {
    public long Principal;
    public int Time;
    public double rate;
    public double Total_amt;

    public Deposit() {
        Principal = 0;
        Time = 0;
        rate = 0.0;
    }

    public Deposit(long P, int T, double R) {
        Principal = P;
        Time = T;
        rate = R;
    }

    public Deposit(long P, int T) {
        Principal = P;
        Time = T;
        rate = 0.05; // default rate of interest is 5%
    }

    public Deposit(long P, double R) {
        Principal = P;
        Time = 1; // default time period is 1 year
        rate = R;
    }

    public void display() {
        System.out.println("Principal: " + Principal);
        System.out.println("Time: " + Time + " year(s)");
        System.out.println("Rate of interest: " + rate);
        System.out.println("Total amount: " + Total_amt);
    }

    public void calc_amt() {
        Total_amt = Principal + (Principal * rate * Time) / 100;
    }
}
/* Output:
 * What do you want to enter Principal(P) or Rate(r) or Time(t) : 
    Options available you - (PR/PT/PRT) : PRT
    Enter the principal amount : 100000000
    Enter the rate of interest : 2
    Enter the time :
    5
    Principal: 100000000
    Time: 5 year(s)
    Rate of interest: 2.0
    Total amount: 1.1E8*/
