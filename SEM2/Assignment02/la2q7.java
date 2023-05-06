package SEM2.Assignment02;
import java.util.*;



public class la2q7{
    public static void main(String[] args) {
        Employee obj = new Employee("Aman",24,64848,789000.36);
        obj.empDisplay();
        
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

