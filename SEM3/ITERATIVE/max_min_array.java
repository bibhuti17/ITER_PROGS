package ITERATIVE;

public class max_min_array {
    // min and max element in an integer array
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 16, 4, 6, 9, 8, 8};
        min_max_array.min_max(a);
    }
}

class min_max_array {
    static void min_max(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("MIN " + min + "\nMAX " + max + " .");
    }
}
