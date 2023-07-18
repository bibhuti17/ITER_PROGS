package SEM2.Assignment03;

public class la3q8 {
    public static void reverseNumb(int n) {
        if (n < 10) {
            System.out.print(n);
        }
        System.out.print(n%10);
        reverseNumb(n/10);
    }

    public static String rNum(int n) {
        if (n < 0) 
            return "";
        return n%10+""+rNum(n/10);
    }

    public static void main(String[] args) {
        reverseNumb(6768797);
    }
}

