package SEM2.Assignment01;

import java.util.*;
public class la1q3 
{
    static boolean checkSpy(int n)
    {
        int sum = 0 , product = 1;
        while (n > 0)
        {
            sum += n%10;
            product *= n%10;
            n/=10;
        }
        return (sum==product);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int N = sc.nextInt();sc.close();
        System.out.println("The number is a spy number : "+checkSpy(N));


        
    }
    
}

     /*
    Enter a number : 1124
    The number is a spy number : true
    
    Enter a number : 1125
    The number is a spy number : false
     */
 
