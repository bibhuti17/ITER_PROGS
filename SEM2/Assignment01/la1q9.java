package SEM2.Assignment01;

import java.util.*;
public class la1q9 
{
    public static double sumMajorDiagonl(double[][] m)
    {
        int sum = 0;
        for (int i = 0; i < m.length ;i++)
        {
            for (int j = 0; j < m[i].length;j++)
            {
                if (i==j)
                {
                    sum += m[i][j];
                }
            }
            
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows and coloumns of the matrix : ");int row = sc.nextInt();int col = sc.nextInt();
        double [][] m = new double[row][col];
        System.out.println("Enter the elements of the array -");
        for (int i = 0;i < m.length; i++)
        {
            for (int j = 0; j < m[i].length ; j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0;i < m.length; i++)
        {
            for (int j = 0; j < m[i].length ; j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println("The sum of the major diagonal is "+sumMajorDiagonl(m)+" .");




        
    }
}


    /*
    Enter the rows and coloumns of the matrix : 4 4
    Enter the elements of the array -
    4 5 2 6 
    1 2 4 3
    4 5 6 7
    4 2 7 9
    4.0     5.0     2.0     6.0
    1.0     2.0     4.0     3.0
    4.0     5.0     6.0     7.0
    4.0     2.0     7.0     9.0
    The sum of the major diagonal is 21 .
     */

