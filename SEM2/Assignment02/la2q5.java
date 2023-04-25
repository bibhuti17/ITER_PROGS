package SEM2.Assignment02;

public class la2q5 
{
    /*
     * Question-5:
    Define a class Deposit. The instance variable of the class Deposit are mentioned below.
    Instance variable Datatype
    Principal Long 
    Time Integer
    rate Double
    Total_amt Double
    Initialize the instance variables Principal, Time, rate through constructors. Constructors are 
    overloaded with the following prototypes. 
    Constructor1: Deposit ( )
    Constructor2: Deposit (long, int, double)
    Constructor3: Deposit (long, int)
    Constructor4: Deposit (long, double)
    Apart from constructor, the other instance methods are (i) display ( ): to display the 
    value of instance variables, (ii) calc_amt( ) to calculate the total amount. 
    Total_amt = Principal + (Principal×rate×Time)/100;
     */
    
}

class Deposit {
    private long Principal;
    private int Time;
    private double rate;
    private double Total_amt;

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

class Main {
    public static void main(String[] args) {
        Deposit deposit = new Deposit(10000, 3, 0.08);
        deposit.calc_amt();
        deposit.display();
    }
}
