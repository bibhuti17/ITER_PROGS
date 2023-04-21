public class la1q5 
{
    public static int sum_of_Digits(int n)
    {
        int sum = 0;
        while ( n > 0 || sum > 9)
        {
            if (n==0)
            {
                n = sum;
                sum = 0;
            }

            sum += n%10;
            n/=10;



        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum_of_Digits(112439));
    }
}
