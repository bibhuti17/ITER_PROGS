package SEM2.Assignment03;
import java.util.*;

class InvalidBalanceException extends Exception {
    public String getMessage() {
        return "Balance cannot be less than 0 !";
    }
}
public class ha3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        try {
        System.out.print("Enter your name : ");bank.setName(sc.next());
        System.out.print("Enter account number : ");bank.setAccount_No(sc.nextInt());
        System.out.print("Enter balance : ");bank.setBalance(sc.nextDouble());
        System.out.println("Details of account holder -----------> ");
        bank.getDetails();
        System.out.println("Enter the amount to withdraw : ");double withdraw = sc.nextDouble();
        System.out.println("After withdraw , Balance : "+(bank.balance-withdraw));
        }
        catch (InvalidBalanceException e) {
            System.out.println(e);
        }
        sc.close();
    }
}

class Bank {
    String name;
    int account_no;
    double balance;

    public void setName(String name) {
        this.name = name;
    }
    public void setAccount_No(int account_no) {
        this.account_no = account_no;
    }
    public void setBalance(double balance) throws InvalidBalanceException {
        if (balance < 0) {
            throw new InvalidBalanceException();
        }
        this.balance = balance;
    }

    public String getDetails() {
        return "Name : "+this.name+"Account_no : "+this.account_no+"Balance : "+this.balance;
    }
}
/*OUTPUT ------------>
    Enter your name : Raman
    Enter account number : 4090230
    Enter balance : -68797
    SEM2.Assignment03.InvalidBalanceException: Balance cannot be less than 0 ! 
    Enter your name : Rahul
    Enter account number : 1739726
    Enter balance : 7000
    Details of account holder ---------->
    Enter the amount to withdraw :
    698
    After withdraw , Balance : 6302.0*/