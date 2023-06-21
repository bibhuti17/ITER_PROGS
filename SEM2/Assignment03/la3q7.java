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
    public static int GCD(int x,int y) {
        if ( y != 0) {
            return GCD(y, x % y);
        }
        else {
            return x;
        }
    }
    public static String  binary(int n) {
        if (n == 0 ) return "0";
        if (n == 1 ) return "1";
        return n%2 +""+binary(n/2);
    }
    public static int product(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a+product(a, b-1);
    }
    public static void main(String[] args) {
       System.out.println(factorial(5));
       System.out.println(exponent(2,3));
       System.out.println(GCD(8,40));
       System.out.println(binary(7));
       System.out.println(product(8,6));
    }
}
