public class la1q3 
{
    static boolean checkSpy(int n)
    {
        int sum = 0 , product = 1;
        for (;n>0;n/=2)
        {
            sum += n%10;
            product *= n%10;
            n/=10;
        }
        return (sum==product);
    }

    public static void main(String[] args) {
        System.out.println(checkSpy(132));
    }
    
}
