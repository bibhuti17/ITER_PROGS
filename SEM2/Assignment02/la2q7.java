package SEM2.Assignment02;

/*Question-7:
Define a base class Person with instance variable name, age. The instance variables are 
initialized through constructors. The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance variables 
are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double). Another instance method of Employee class is empDisplay() 
to display the information of employee details. */

import java.util.*;
public class la2q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of persons ");int n = sc.nextInt();
        Employee []empl = new Employee[n];
        System.out.println("Enter name,age,Eid,salary , respectively.");
        for (int i = 0; i < empl.length; i++){
            
            empl[i] = new Employee();
            empl[i].name = sc.nextLine();
            empl[i].age = sc.nextInt();
            empl[i].Eid = sc.nextInt();
            empl[i].salary = sc.nextDouble();
            empl[i].empDisplay();
        }
        sc.close();
        }
}

class Person{
    String name;
    int age;
    public Person(){

    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Employee extends Person{
    int Eid;
    double salary;
    public Employee(){

    }
    public Employee(String name,int age , int Eid , double salary){
        super(name,age);
        this.Eid=Eid;
        this.salary=salary;
    }

        public void empDisplay(){
            System.out.println("Employee name : "+name);
            System.out.println("Employee's age : "+age);
            System.out.println("Employee's id : "+Eid);
            System.out.println("Employee's salary : "+salary);
        }
}

