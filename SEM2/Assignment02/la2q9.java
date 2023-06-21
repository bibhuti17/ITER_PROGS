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
            examArray[i].input_Marks();
        }
        
        for (int i = 0; i < examArray.length; i++) {
            System.out.println("Details and result for student " + (i+1) + ":");
            
            examArray[i].display_Result();
        }
    }
}

class student_8 {
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
        
    }

    void display_Student() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Exam extends student_8 {
    int mark1;
    int mark2;
    int mark3;

    void input_Marks() {
        super.input_Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        mark3 = sc.nextInt();
        
    }

    void display_Result() {
        super.display_Student();
        System.out.println("Marks for Subject 1: " + mark1);
        System.out.println("Marks for Subject 2: " + mark2);
        System.out.println("Marks for Subject 3: " + mark3);
    }
}

/*
Enter details for student 1:
Enter roll number: 1
Enter name: Ram
Enter course: Economics
Enter marks for Subject 1: 66
Enter marks for Subject 2: 66
Enter marks for Subject 3: 66
Enter details for student 2:
Enter roll number: 2
Enter name: Samay
Enter course: Philosopy
Enter marks for Subject 1: 22
Enter marks for Subject 2: 32
Enter marks for Subject 3: 32
Enter details for student 3:
Enter roll number: 3
Enter name: Zakena
Enter course: DSA
Enter marks for Subject 1: 23
Enter marks for Subject 2: 32
Enter marks for Subject 3: 34
Enter details for student 4:
Enter roll number: 4
Enter name: Efjfu  
Enter course: IGT
Enter marks for Subject 1: 32
Enter marks for Subject 2: 32
Enter marks for Subject 3: 2
Enter details for student 5:
Enter roll number: 5
Enter name: Umaran
Enter course: Bowling
Enter marks for Subject 1: 23
Enter marks for Subject 2: 32
Enter marks for Subject 3: 78
Details and result for student 1:
Roll Number: 1
Name: Ram
Course: Economics
Marks for Subject 1: 66
Marks for Subject 2: 66
Marks for Subject 3: 66
Details and result for student 2:
Roll Number: 2
Name: Samay
Course: Philosopy
Marks for Subject 1: 22
Marks for Subject 2: 32
Marks for Subject 3: 32
Details and result for student 3:
Roll Number: 3
Name: Zakena
Course: DSA
Marks for Subject 1: 23
Marks for Subject 2: 32
Marks for Subject 3: 34
Details and result for student 4:
Roll Number: 4
Name: Efjfu
Course: IGT
Marks for Subject 1: 32
Marks for Subject 2: 32
Marks for Subject 3: 2
Details and result for student 5:
Roll Number: 5
Name: Umaran
Course: Bowling
Marks for Subject 1: 23
Marks for Subject 2: 32
Marks for Subject 3: 78 
*/ 
