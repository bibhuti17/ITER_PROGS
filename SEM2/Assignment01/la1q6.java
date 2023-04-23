import java.util.*;
public class la1q6 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : "); int N = sc.nextInt();
        System.out.println("The number  is odd : "+isOdd_bit(N));
        System.out.println("The number  is odd : "+isOdd_bit(N));
        sc.close();
    }

    //method_1
    public static boolean isOdd_bit(int n)
    {
        return ((n & 1)==1);
    }
    //method_2
    public static boolean isOdd_sub(int n)
    {   
        int i ;
        for ( i = n;i>0;i=i-2);
        return (i==1);
    }
}

class output_6
{
    /*
    
     */
}
