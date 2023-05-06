package SEM2.Assignment01;

import java.util.*;
public class ha1q1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three numbers (say) a,b,c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        System.out.print((a + b == c) ? (a + " + " + b + " = " + c) :
        (a == b - c) ? (a + " = " + b + " - " + c) :
        (a * b == c) ? (a + " * " + b + " = " + c) :
        "The values cannot be used in a correct arithmetic formula.");
    }
}



    /*
    Enter the three numbers (say) a,b,c : 2 3 5
    2 + 3 = 5


    Enter the three numbers (say) a,b,c : 2 3 4
    The values cannot be used in a correct arithmetic formula.
     */
