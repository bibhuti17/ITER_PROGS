package SEM2.Assignment02;
/*Question-4:
A point in the x-y plane is represented by its x-coordinate and y-coordinate. Design a class,
PointType in Java, that can store and process a point in the x-y plane. You should then
perform operations on the point, such as showing the point, setting the coordinates of the
point, printing the coordinates of the point, returning the x-coordinate, and returning the y-coordinate. 
Every circle has a centre and a radius. Given the radius, we can determine the
circle’s area and circumference. Given the centre, we can determine its position in the x-y
plane. The centre of a circle is a point in the x-y plane. Design a class, CircleType that can
store the radius and centre of the circle. Because the center is a point in the x-y plane and
you designed the class to capture the properties of a point from PointType class. You must
derive the class CircleType from the class PointType. You should be able to perform the
usual operations on a circle, such as setting the radius, printing the radius, calculating and
printing the area and circumference, and carrying out the usual operations on the center. */
public class ha2q4 {
    public static void main(String[] args) {
        CircleType circle = new CircleType(6, 9, 7);
        System.out.println("Centre of the circle -----------> ");
        circle.displayCoordinate();
        System.out.println("The radius of the circle ------------> ");
        circle.displayRadius();
        System.out.println("The area of circle -------------> ");
        circle.circleArea();
        System.out.println("The circumference of circle -------------->");
        circle.circleCircumference();

        circle.setCoordinate(9,7 ); 
        circle.setRadius(11);

        System.out.println("New centre of circle ----------->");
        System.out.println(circle.getx()+" "+circle.gety());
        System.out.println("");
        System.out.println("Radius : "+circle.getRadius());
        System.out.println("The area of circle -------------> ");
        circle.circleArea();
        System.out.println("The circumference of circle -------------->");
        circle.circleCircumference();


    }
}
class PointType{
    private double x,y;
    PointType(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void setCoordinate(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void displayCoordinate(){
        System.out.println("Coordinates are : ()"+x+" , "+y+").");
    }
    public double getx(){
        return x;
    }
    public double gety(){
        return y;
    }

}


class CircleType extends PointType{
    private double radius;
    CircleType(double x,double y , double r){
        super(x, y);
        this.radius = r;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public void displayRadius(){
        System.out.println("The radius of the circle is "+radius);
    }
    public double getRadius(){
        return radius;
    }

    public void circleArea(){
        double area = Math.PI *radius*radius;
        System.out.println("The area of the circle :"+area);
    }
    public void circleCircumference(){
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle : "+circumference);
    }

}
/*OUTPUT:-
Centre of the circle -----------> 
Coordinates are : (6.0 , 9.0).
The radius of the circle ------------> 
The radius of the circle is 7.0
The area of circle ------------->
The area of the circle :153.93804002589985
The circumference of circle -------------->
The circumference of the circle : 43.982297150257104
New centre of circle ----------->
9.0 7.0

Radius : 11.0
The area of circle ------------->
The area of the circle :380.1327110843649
The circumference of circle -------------->
The circumference of the circle : 69.11503837897544 */