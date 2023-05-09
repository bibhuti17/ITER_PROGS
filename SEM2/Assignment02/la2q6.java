package SEM2.Assignment02;
/*Question-6: 
Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a java program to display area of different shapes.*/
public class la2q6 
{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(5.0);
        shapes[1] = new Triangle(4.0, 3.0);
        shapes[2] = new Circle(2.0);

        for (Shape s : shapes) {
            System.out.println("Area of shape: " + s.area());
        }
    }
}

abstract class Shape {
    abstract double area();
}

class Square extends Shape {
    double side;
    Square(double s) { side = s; }
    double area() { return side * side; }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }
    double area() { return 0.5 * base * height; }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    double area() { return Math.PI * radius * radius; }
}

class Main {
    
}

