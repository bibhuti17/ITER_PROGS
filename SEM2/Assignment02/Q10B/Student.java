package SEM2.Assignment02.Q10B;

import java.util.*;
public class Student {
    private String name;
    private int roll;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll: ");
        roll = sc.nextInt();
        sc.close();
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}
