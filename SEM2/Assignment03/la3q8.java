package SEM2.Assignment03;

public class la3q8 {
    public void reverseNumb(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        reverseNumb(n/10);
    }
}
