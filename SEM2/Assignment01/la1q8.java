import java.util.*;
public class la1q8 
{
    public static void main(String[] args) 
    {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows and coloumns of the 2-D matrix : ");
    int row = sc.nextInt();
    int coloumn = sc.nextInt();

    int array[][] = new int[row][coloumn];

    System.out.println("Enter the elements of the array .......");

    for(int i = 0; i < array.length; i++)
    {
        for (int j = 0; j < array[i].length; j++)
        {
            array [i][j] = sc.nextInt();
        }
    } 
    sc.close();

    System.out.println("The elements of the 2D-Array are : ");
    for (int i = 0; i < array.length; i++)
    {
        for (int j = 0; j < array[i].length; j++)
        {
            System.out.println(array[i][j]+"\t");
        }
    }
    int sum = 0;
    for (int i = 0; i < array.length; i++)
    {
        for (int j = 0; j < array[i].length; j++)
        {
            sum += array[i][j];
        }
    }
    System.out.println("The sum of the elements of the 2-D array is "+sum);

    } 
}
