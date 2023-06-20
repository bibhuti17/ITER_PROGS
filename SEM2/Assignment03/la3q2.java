package SEM2.Assignment03;
/*Question-2:
Assign your favourite colours in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java. Also, display the four colours after handling any 2 exceptions.
Sample run:
Enter four colours
RED
BLUE
YELLOW
GREEN
Convert string to integer
java.lang.NumberFormatException: For input string: "RED"
Enter one more colour
VIOLET
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of 
bounds for length 4
The colours entered are
RED
BLUE
YELLOW
GREEN */
import java.util.*;

public class la3q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = new String[4];

        System.out.println("Enter the colors:");
        for (int i = 0; i < color.length; i++) {
            color[i] = sc.nextLine();
        }

        try {
            // Exception 1: NumberFormatException
            System.out.println("Convert string to integer");
            int[] arr = new int[4];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(color[i]);
                System.out.println("Converted number is : "+arr[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Exception 1: NumberFormatException occurred!");
            System.out.println(e);
        }

        try {
            // Exception 2: ArrayIndexOutOfBoundsException
            System.out.println("Enter one more color:");
            String additionalColor = sc.nextLine();
            color[4] = additionalColor;
            System.out.println("Added color: " + color[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception 2: ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        }
        sc.close();
        // Display the colors
        System.out.println("The colors entered are : "+Arrays.toString(color));
         
    }
}
/*
 * OUTPUT:-
    Enter the colors:
    RED
    BLUE
    GREEN 
    PINK
    Convert string to integer
    Exception 1: NumberFormatException occurred!
    java.lang.NumberFormatException: For input string: "RED"
    Enter one more color:
    LAVENDER
    Exception 2: ArrayIndexOutOfBoundsException occurred!
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    The colors entered are : [RED, BLUE, GREEN , PINK]
 */