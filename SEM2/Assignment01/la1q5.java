package SEM2.Assignment01;

import java.util.Scanner;

public class la1q5 
{
    public static int sum_of_Digits(int n)
    {
        int sum = 0;
        while ( n > 0 || sum > 9)
        {
            if (n==0)
            {
                n = sum;
                sum = 0;
            }

            sum += n%10;
            n/=10;



        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int N = sc.nextInt();sc.close();
        System.out.println("The sum of the digits of the number till it is a single digit number is : "+sum_of_Digits(N));
    }
}


    /*
    Enter a number : 124663
    The sum of the digits of the number till it is a single digit number is : 4
     */

