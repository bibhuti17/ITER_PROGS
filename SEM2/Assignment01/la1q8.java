package SEM2.Assignment01;

import java.util.*;
public class la1q8 
{
    public static void main(String[] args) 
    {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rows and coloumns of the 2-D matrix : ");
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
            System.out.print(array[i][j]+"\t");
        }
        System.out.println();
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

 
    /*
    Enter the rows and coloumns of the 2-D matrix : 2 3
    Enter the elements of the array .......
    2 5 4
    1 24 4
    The elements of the 2D-Array are :
    2       5       4
    1       24      4
    The sum of the elements of the 2-D array is 40
     */

