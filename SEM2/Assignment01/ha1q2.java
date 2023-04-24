import java.util.Scanner;

public class ha1q2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of Lines : ");
        int n=sc.nextInt();
        
        String []s=new String[n];
        System.out.println("Enter the Lines : ");
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
        }
        sc.close();
        System.out.println("\nThe Lines are in Reverse Order : ");
        for (int j=n- 1; j>= 0; j--)
        {
            System.out.println(s[j]);
        }
            
    }
}

class output4 
{
    /*
    Enter the No of Lines : 4
    Enter the Lines :
    hello
    coder
    how coding going on
    
    The Lines are in Reverse Order : 
    how coding going on
    coder
    hello
     */
}