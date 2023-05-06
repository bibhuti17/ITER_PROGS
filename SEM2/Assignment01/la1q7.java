package SEM2.Assignment01;

import java.util.*;
public class la1q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter the elements of the arrays : ");
        for (int i=0 ; i<size ; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max_occur = 0;
        int min_occur = 0;
        int first_max_postion = 0;
        int last_min_postion = 0;

        for (int i=0 ; i<arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_occur = 1;
                first_max_postion = i;
            } else  if (arr[i] == max) {
                max_occur++;
            }
            if (arr[i] < min) {
                min = arr[i];
                min_occur = 1;
                last_min_postion = i;
            } else if (arr[i] == min) {
                min_occur++;
                last_min_postion = i;
            }
        }
        System.out.println("Maximum element of Array is " + max + " and occurs " + max_occur + " times");
        System.out.println("Minimum element of Array is " + min + " and occurs " + min_occur + " times");
        System.out.println("First occurrence of maximum element is at position " + (first_max_postion + 1));
        System.out.println("Last occurrence of minimum element is at position " + (last_min_postion + 1));
        sc.close();
    }
}

 
    /*
    Enter length of Array : 5
    Enter the elements of the arrays : 12 14 12 13 14
    Maximum element of Array is 14 and occurs 2 times.
    Minimum element of Array is 12 and occurs 2 times.
    First occurrence of maximum element is at position 2
    Last occurrence of minimum element is at position 3
     */
