package SEM2.Assignment02;
/*Question-9:
Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
instance methods. A derived class Exam is created from the class Student. The derived
class contains mark1, mark2, mark3 as instance variables representing the marks of three
subjects and input_Marks () and display_Result () as instance methods. Create an array of
objects of the Exam class and display the result of 5 students.*/
import  java.util.*;
public class la2q9 {
    public static void main(String[] args) {
        Exam[] examArray = new Exam[5];
        for (int i = 0; i < examArray.length; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");
            examArray[i] = new Exam();
            examArray[i].input_Student();
            examArray[i].input_Marks();
        }
        for (int i = 0; i < examArray.length; i++) {
            System.out.println("Details and result for student " + (i+1) + ":");
            examArray[i].display_Student();
            examArray[i].display_Result();
        }
    }
}

class student {
    int rollNumber;
    String name;
    String course;

    void input_Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter course: ");
        course = sc.nextLine();
        sc.close();
    }

    void display_Student() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Exam extends student {
    int mark1;
    int mark2;
    int mark3;

    void input_Marks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        mark3 = sc.nextInt();
        sc.close();
    }

    void display_Result() {
        System.out.println("Marks for Subject 1: " + mark1);
        System.out.println("Marks for Subject 2: " + mark2);
        System.out.println("Marks for Subject 3: " + mark3);
    }
}

 
