package SEM2.Assignment02;

public class la2q2 
{
    /*
     * Question-2:
    Define a class called Complex with instance variables real, imag and instance methods
    setData(), display(), add(). Write a Java program to add two complex numbers.
    The prototype of add method is: 
    public Complex add(Complex, Complex).
     */
}

class Complex {
    private double real;
    private double imag;

    // Method to set the real and imaginary parts of the complex number
    public void setData(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to display the complex number in the form a + bi
    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    // Method to add two complex numbers and return the result as a new Complex object
    public Complex add(Complex c1, Complex c2) {
        Complex sum = new Complex();
        sum.real = c1.real + c2.real;
        sum.imag = c1.imag + c2.imag;
        return sum;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex sum = new Complex();

        c1.setData(3, 4);
        c2.setData(5, 6);

        System.out.print("Complex number 1: ");
        c1.display();

        System.out.print("Complex number 2: ");
        c2.display();

        sum = sum.add(c1, c2);
        System.out.print("Sum of the two complex numbers: ");
        sum.display();
    }
}

