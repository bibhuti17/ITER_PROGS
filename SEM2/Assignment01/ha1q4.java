public class ha1q4 {
    public static double[][] addMatrix(double[][] a, double[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }
        
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
        double[][] a = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] b = {{9.0, 8.0, 7.0}, {6.0, 5.0, 4.0}, {3.0, 2.0, 1.0}};
        
        double[][] result = addMatrix(a, b);
        
        System.out.println("Matrix a:");
        printMatrix(a);
        
        System.out.println("Matrix b:");
        printMatrix(b);
        
        System.out.println("Matrix sum:");
        printMatrix(result);
    }
    
    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
