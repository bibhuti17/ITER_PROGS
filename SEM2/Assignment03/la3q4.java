package SEM2.Assignment03;

import java.util.*;

public class la3q4 {
    public static < E > void printArray( E[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arrI = new Integer[5];
        System.out.println("Enter the elements of integer array : ");
        for (int i = 0; i < arrI.length ; i++) {
            arrI[i] = sc.nextInt();
        }
        Double[] arrD = new Double[5];
        System.out.println("Enter the elements of double array : ");
        for (int i = 0; i < arrI.length ; i++) {
            arrD[i] = sc.nextDouble();
        }
        sc.close();
        System.out.println("Integer array : ");
        printArray(arrI);
        System.out.println("Double array : ");
        printArray(arrD);
    }
}
