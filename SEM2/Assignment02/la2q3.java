package SEM2.Assignment02;
import java.util.*;
public class la2q3 
{
    /*
     *Question-3:
    Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class 
    consists of instance methods getdata( ), showdata( ) to provide input to the instance variable 
    and to display the value of instance variable. Write a program to create the details of 5 students. 
    Display the information of the students who has secured the highest DSA 
     */
    
}


class Student {
    private int Roll;
    private String Name;
    private double DSA_Mark;

    // Method to get input from the user and set the values of the instance variables
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll number: ");
        Roll = sc.nextInt();
        System.out.print("Enter Name: ");
        Name = sc.next();
        System.out.print("Enter DSA Marks: ");
        DSA_Mark = sc.nextDouble();
        sc.close();
        
    }

    // Method to display the values of the instance variables
    public void showdata() {
        System.out.println("Roll number: " + Roll);
        System.out.println("Name: " + Name);
        System.out.println("DSA Marks: " + DSA_Mark);
    }

    // Method to find the student with the highest DSA_Mark
    public static Student findTopper(Student[] students) {
        Student topper = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].DSA_Mark > topper.DSA_Mark) {
                topper = students[i];
            }
        }
        return topper;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        // Get input from the user for each student
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i+1) + ":");
            students[i].getdata();
        }

        // Find the student with the highest DSA_Mark
        Student topper = Student.findTopper(students);

        // Display the details of the topper
        System.out.println("Details of the student with the highest DSA_Marks:");
        topper.showdata();
        sc.close();
    }
}

