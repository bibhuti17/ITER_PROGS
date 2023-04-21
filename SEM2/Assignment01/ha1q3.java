public class ha1q3 {
    public static int[] dotProduct(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }
        
        int n = a.length;
        int[] c = new int[n];
        
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }
        
        return c;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        
        int[] c = dotProduct(a, b);
        
        System.out.println("Dot product of arrays a and b:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
