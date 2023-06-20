package SEM2.Assignment03;
import java.util.Scanner;
public class la3q5 {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == item){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");int n = sc.nextInt();
        Integer[] array = new Integer[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("Enter the elemnt to search : ");int search = sc.nextInt();
        sc.close();
        System.out.println("The element "+search+" has occred "+count(array, search)+" times.");
    }
}
