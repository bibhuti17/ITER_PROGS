public class la1q1 
{
    public static void main(String [] args)
    {
        la1q1 obj = new la1q1();
        int N = 73;
        System.out.println("The integer input taken from command line is "+N+" .");
        System.out.println("The number of times the number could be diveded by 2 is "+obj.countDivision(N)+" times.");
    }

    int countDivision(int n)
    {
        int count = 0;
        while ((n/=2)>=2)
        {
            count++;
        }
        return count ;
    }
}
