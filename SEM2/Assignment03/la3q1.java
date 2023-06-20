
package SEM2.Assignment03;
/*Question-1:
Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.
Sample run-1:
Enter your lucky number
-90
java.lang.NumberFormatException: Negative number
Sample run-2:
Enter your lucky number
34
Your lucky number is 34 */
import java.util.*;

public class la3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int luckynumber = sc.nextInt();
        sc.close();
            if (luckynumber < 0){
                try{
                    throw new NumberFormatException();
                }
                catch (NumberFormatException numberFormatException){
                System.out.println(numberFormatException+ " : Negative Number");
                System.out.println("Try again !!!!!");
            }
        }
        System.out.println("Your lucky numbe is "+luckynumber);
    }
    
}
/*OUTPUT:-
 *  Enter a number : -9
    java.lang.NumberFormatException : Negative Number
    Try again !!!!!

    Enter a number : 9
    Your lucky numbe is 9
 */
    