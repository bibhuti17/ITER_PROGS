import java.util.*;
public class ha1q5 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows and coloumns of the matrix : ");int row = sc.nextInt(),col = sc.nextInt();sc.close();
        double [][] m = new double[row][col];
        for (int i = 0; i < m.length; i++ )
        {
            for (int j=0; j < m[i].length; j++)
            {
                m[i][j]=(int)(Math.random()*2);
            }
        }

        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }

        int maxCount = 0, maxRow = 0, maxCol = 0;

        
        for (int i = 0; i < m.length ; i++)
        {
            int c = 0;
            for (int j = 0; j < m[i].length ; j++)
            {
                if (m[i][j]==1) 
                {
                    c++;
                }
            }
            if (c > maxCount)
            {
                maxRow = i;
                maxCount = c;
            }
        }
        
        for (int i = 0; i < m.length ; i++)
        {
            int c = 0;
            for (int j = 0; j < m[i].length ; j++)
            {
                if (m[j][i]==1) 
                {
                    c++;
                }
            }
            if (c > maxCount)
            {
                maxCol = i;
                maxCount = c;
            }
        }
        System.out.println("The largest row index is "+maxRow+1);
        System.out.println("The largest coloumn indes is "+maxCol+1);
        
        
    }
}
