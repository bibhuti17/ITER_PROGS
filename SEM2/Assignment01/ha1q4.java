package SEM2.Assignment01;

import java.util.*;
public class ha1q4 
{
    public static double[][] addMatrix(double[][] a, double[][] b) {
        
        
        int numRows = a.length;
        int numCols = a[0].length;
        double[][] result = new double[numRows][numCols];
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        double[][] a;double[][] b;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the row and coloumn of the 1st matrix : ");int r1 = sc.nextInt(), c1 = sc.nextInt();
        a = new double[r1][c1];
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0;i < a.length; i++)
        {
            for (int j = 0;j < a[i].length;j++)
            {
                a[i][j]=sc.nextDouble();
            }
        }
        System.out.print("Enter the row and coloumn of the 2st matrix : ");int r2 = sc.nextInt(), c2 = sc.nextInt();
        b = new double[r2][c2];
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0;i < b.length; i++)
        {
            for (int j = 0;j < b[i].length;j++)
            {
                b[i][j]=sc.nextDouble();
            }
        }
        sc.close();
        double result[][] = addMatrix(a, b);
        
        System.out.println("Matrix a:");
        printMatrix(a);
        
        System.out.println("Matrix b:");
        printMatrix(b);
        
        System.out.println("Matrix sum:");
        printMatrix(result);
    }
    
    public static void printMatrix(double[][] matrix) 
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


 

 
    /*
    Enter the row and coloumn of the 1st matrix : 2 3
    Enter the elements of the matrix :
    4 2 3
    1 2 3
    Enter the row and coloumn of the 2st matrix : 2 3
    Enter the elements of the matrix :
    1 2 3
    4 2 9
    Matrix a:
    4.0 2.0 3.0
    1.0 2.0 3.0

    Matrix b:
    1.0 2.0 3.0
    4.0 2.0 9.0

    Matrix sum:
    5.0 4.0 6.0
    5.0 4.0 12.0
     */

