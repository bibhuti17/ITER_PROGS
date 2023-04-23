import java.util.*;
public class la1q2 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    double W,h,BMI;
    System.out.print("Enter the person's weight in kg : ");
    W = sc.nextDouble();
    System.out.print("Enter the person's height in meter : ");
    h = sc.nextDouble();
    sc.close();

    BMI = W / Math.pow(h,2);

    if (BMI < 18.5) System.out.println("The person is underweight.");
    else if (BMI >= 18.5 && BMI <=24.9) System.out.println("The person is in normal weight.");
    else if (BMI > 24.9 && BMI < 30.0) System.out.println("The person is overweight.");
    else System.out.println("The person is obese.");
  }  
}

class output_2
{
  /*
    Enter the person's weight in kg : 68
    Enter the person's height in meter : 2
    The person is underweight.

    Enter the person's weight in kg : 56
    Enter the person's height in meter : 1.8
    The person is underweight.
   
   */
}