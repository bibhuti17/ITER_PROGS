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
            
            
            empl[i] = new Employee(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
            empl[i].empDisplay();
        }
        sc.close();
        }
}

class Person{
    String name;
    int age;
    
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Employee extends Person{
    int Eid;
    double salary;
    
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

/*Enter the no. of persons 5
Enter name,age,Eid,salary , respectively.
Ramesh
25
54545
70000
Employee name : Ramesh
Employee's age : 25
Employee's id : 54545
Employee's salary : 70000.0
Ram
30
7586768
600000 
Employee name : Ram
Employee's age : 30
Employee's id : 7586768
Employee's salary : 600000.0
Sameer
50
87868
50000000
Employee name : Sameer
Employee's age : 50
Employee's id : 87868
Employee's salary : 5.0E7
Ehawn
20
677875767
30000 
Employee name : Ehawn
Employee's age : 20
Employee's id : 677875767
Employee's salary : 30000.0
Nihal
30
7757567
500000
Employee name : Nihal
Employee's age : 30
Employee's id : 7757567
Employee's salary : 500000.0 */