
package SEM2.Assignment03;
//import java.util.*;

public class la3q1 {
    public static void main(String[] args) {
        try{
            //Scanner sc = new Scanner(System.in);
            //System.out.print("Enter a number : ");
            int n = -90;//sc.nextInt();
            System.out.println(n);
            //sc.close();
        }
        catch (NumberFormatException numberFormatException){
            System.out.println(numberFormatException+ " : Negative Number");
            System.out.println("Try again !!!!!");
        }
    }
    
}
 
    