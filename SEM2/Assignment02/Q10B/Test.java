package SEM2.Assignment02.Q10B;
 
import java.util.*;
public class Test extends Student {
    private int mark1;
    private int mark2;

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter mark2: ");
        mark2 = sc.nextInt();
        sc.close();
    }

    public void output() {
        super.output();
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }
}

