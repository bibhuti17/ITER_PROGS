import java.util.*;
public class la1q10
{
    public static int calc_col_sum(double [][]mat,int col)
    {
        int sum = 0;
        for(int i = 0; i < mat.length ; i++)
        {
            
            sum += mat[i][col];
            
        }
        return sum;
    }


    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the number of rows and coloumns : ");
        int row = in.nextInt();
        int col = in.nextInt();

        double [][]matrix = new double[row][col];

        System.out.println("Enter the elements of matrix : ");
        for(int i = 0 ; i < matrix.length ; i++ )
        {
            for(int j = 0 ; j < matrix[i].length ; j++)
            {
                matrix[i][j] = in.nextDouble();

            }
        }
        in.close();

        for(int i = 0 ; i < matrix.length ; i++ )
        {
            for(int j = 0 ; j < matrix[i].length ; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < col;i++)
        {
            System.out.println("The sum of the coloumn "+i+" is "+calc_col_sum(matrix,i));
        }
    }
}

class output_10
{
    /*
    Enter the number of rows and coloumns : 3 4
    Enter the elements of matrix : 
    4 5 2 3
    1 2 4 3
    4 5 5 7 
    4.0 5.0 2.0 3.0
    1.0 2.0 4.0 3.0
    4.0 5.0 5.0 7.0
    The sum of the coloumn 0 is 9
    The sum of the coloumn 1 is 12
    The sum of the coloumn 2 is 11
    The sum of the coloumn 3 is 13
     */
}

