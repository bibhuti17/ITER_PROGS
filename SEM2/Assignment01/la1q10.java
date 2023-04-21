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

