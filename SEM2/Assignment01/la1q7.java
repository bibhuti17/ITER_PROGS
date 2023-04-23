import java.util.*;
public class la1q7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");int N = sc.nextInt();
        int array[] = new int[N];
        System.out.print("Enter the elements of the array.....");
        for (int i = 0;i < array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        sc.close();

        System.out.println("Maximun element of the array is "+maxArray(array)+" and has occured "+checkRep(array,maxArray(array)));
        System.out.println("Minimum element of the array is "+minArray(array)+" and has occured "+checkRep(array,minArray(array)));
        System.out.println("The first occurance of the minimum element is "+array[minArray(array)]);
        System.out.println("The first occurance of the maximum element is "+array[maxArray(array)]);

        
    }
    public static int checkRep(int a[],int rep_num)
    {
        int count = 0;
        for (int i = 0;i < a.length; i++)
        {
            if (a[i]==rep_num)
            {
                count ++;
            }
        }
        return count;
    }
    public static int minArray(int a[])
    {
        int min = a[0];
        for (int i = 0;i < a.length;i++)
        {
            if (min > a[i])
            {
                min = a[i];
            }
        }
        return min;
    }

    public static int maxArray(int a[])
    {
        int max = a[0];
        for (int i = 0;i < a.length;i++)
        {
            if (max < a[i])
            {
                max = a[i];
            }
        }
        return max;
    }
}

class output_7
{
    /*
    Enter the length of the array : 7
    Enter the elements of the array.....6 3 2 7 8 9 6
    Maximun element of the array is 9 and has occured 1
    Minimum element of the array is 2 and has occured 1
    The first occurance of the minimum element is 2
     */
}