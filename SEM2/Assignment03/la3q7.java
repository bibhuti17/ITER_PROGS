package SEM2.Assignment03;

public class la3q7 {
    public static int factorial(int n) {
        if ((n == 0 )||( n == 1))
            return 1;
        
        return n*factorial(n-1);
        
    }
    public static int exponent(int b , int p) {
        if (b == 0) {
            return 0;
        }
        if (p == 0) {
            return 1;
        }
        return b*exponent(b, p-1);
    }
    
    public static void main(String[] args) {
       System.out.println(factorial(5));
       System.out.println(exponent(2,3));
    }
}
