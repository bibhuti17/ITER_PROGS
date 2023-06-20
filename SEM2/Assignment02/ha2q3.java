package SEM2.Assignment02;
/*Question-3:
Write a Java code that would represent Distance object (meters, centimetres) using classes. The class 
definition include a parameterized constructor, display ( ) to display the instance variables, sum 
(Distance, Distance) to add two distances. Now write a main function that creates a couple of Distance 
objects and demonstrates the addition of two distances. */
 
public class ha2q3 {
   public static void main(String[] args) {
      Distance d1 = new Distance(5, 100);
      System.out.println("--------> Distance 1 : ");
      d1.display();

      Distance d2 = new Distance(1, 90);
      System.out.println("---------> Distance 2 : ");
      d2.display();

      Distance sumDistance = Distance.addDistance(d1, d2);
      System.out.println("The sum of distances is: ");
      sumDistance.display();
   }
}

class Distance {
    double meters, centimeters;

    Distance(double m, double cm) {
        this.meters = m;
        this.centimeters = cm;
    }

    public void display() {
        System.out.println("Distance: " + meters + " meters and " + centimeters + " centimeters.");
    }

    public static Distance addDistance(Distance D1, Distance D2) {
        double totalMeters = D1.meters + D2.meters;
        double totalCentimeters = D1.centimeters + D2.centimeters;

        if (totalCentimeters >= 100) {
            totalMeters += Math.floor(totalCentimeters / 100);
            totalCentimeters = totalCentimeters % 100;
        }

        return new Distance(totalMeters, totalCentimeters);
    }
}
