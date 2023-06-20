package SEM2.Assignment03;
import java.util.*;
public class la3q9 {
    public static void fibonacci(int a, int b ,int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacci(b, c, n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many fibonacci sequences to print ----------------->");
        fibonacci(0,1,sc.nextInt());sc.close();
    }
}
