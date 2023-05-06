package SEM2.Assignment01;

import java.util.*;
public class ha1q3 
{
    public static int[] dotProduct(int[] a, int[] b) 
    {
        
        
        int n = a.length;
        int[] c = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            c[i] = a[i] * b[i];
        }
        
        return c;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the arrays : ");int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int [] c = new int[n];
        System.out.println("Enter the elements of first array : " );
        for (int i = 0; i < a.length;i++) a[i]=sc.nextInt();
        System.out.println("Enter the elements of second array : " );
        for (int i = 0; i < b.length;i++) b[i]=sc.nextInt();
        sc.close();

        
        c = dotProduct(a, b);
        
        System.out.println("Dot product of arrays a and b:");
        
        System.out.print(Arrays.toString(c));
        
        
    }
}


    /*
    Enter the length of the arrays : 4
    Enter the elements of first array : 
    5 6 3 4
    Enter the elements of second array : 
    4 2 4 3
    Dot product of arrays a and b:
    [20, 12, 12, 12]
     */
