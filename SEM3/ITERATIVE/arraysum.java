package ITERATIVE;
public class arraysum {
// integer array sum using loop
    public static void main(String[] args) {
        int []a = {1,2,3,4,4,5};
        System.out.println(array_sum.arraysum(a));
    }
    class array_sum {
        public static int arraysum (int []a){
            int sum = 0;
            for(int i = 0; i < a.length; i++){
                sum += a[i];
            }
            return sum;
        }
    }
}