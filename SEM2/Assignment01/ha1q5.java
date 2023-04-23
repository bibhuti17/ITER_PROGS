import java.util.*;

public class ha1q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.close();
        
        int[][] matrix = randomMatrix(rows, cols);
        printMatrix(matrix);
        
        int maxRow = findMaxRow(matrix);
        int maxCol = findMaxCol(matrix);
        
        System.out.println("Row index with the most ones: " + maxRow+1);
        System.out.println("Column index with the most ones: " + maxCol+1);
    }
    
    // Create a random matrix of 0s and 1s
    public static int[][] randomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        
        return matrix;
    }
    
    // Print a matrix to the console
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Find the row with the most ones in a matrix
    public static int findMaxRow(int[][] matrix) {
        int maxCount = 0;
        int maxRow = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }
        
        return maxRow;
    }
    
    // Find the column with the most ones in a matrix
    public static int findMaxCol(int[][] matrix) {
        int maxCount = 0;
        int maxCol = 0;
        
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxCol = j;
            }
        }
        
        return maxCol;
    }
}

class output5 
{
    /*
    Enter the number of rows and columns of the matrix: 4 4
    1 1 1 1
    1 0 1 1
    1 1 1 0
    0 0 0 1
    Row index with the most ones: 01
    Column index with the most ones: 01
     */
}
