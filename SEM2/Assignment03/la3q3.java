package SEM2.Assignment03;
/*Question-3:
Create a class Student having two instance variable name and mark. Enter mark, name of the 
student. If mark is more than 100, create exception MarksOutOfBoundException & throw it 
using Java. Display the customised message Mark can’t be greater than 100 for the exception.
Sample run-1:
Enter the name of the student
RAMESH
Enter marks
98
RAMESH has got 98.0
Sample run-2:
Enter the name of the student
Raju
Enter marks
130
MarksOutOfBoundException: Mark can't be greater than 100 */
import java.util.Scanner;

class MarksOutOfBoundException extends Exception{
    public String getMessage(){
         return "Marks can't be greater than 100 !";
    }
}
public class la3q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_A3_3 student = new Student_A3_3();
        try{
            System.out.print("Enter the name of the student : ");String name = sc.nextLine();
            student.setName(name);
            System.out.print("Enter marks scored : ");short marks = sc.nextShort();sc.close();
            student.setMarks(marks);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(student.getName_Marks());
        
    }
}

class Student_A3_3{
    private String name;
    private short marks;
    
    public String setName(String name)  {
        this.name = name;
        return this.name;
    }
    
    public short setMarks(short marks) throws MarksOutOfBoundException {
        if (marks > 100.0){
            throw new MarksOutOfBoundException();
        }
        this.marks = marks;
        return this.marks;
    }

    public String getName_Marks(){
        return ("Name is : "+name+"\nMarks scored: "+marks+" .");
    }
}
/*Output:
    Enter the name of the student : Roshan
    Enter marks scored : 200
    SEM2.Assignment03.MarksOutOfBoundException: Marks can't be greater than 100 !

    Enter the name of the student : Raushan
    Enter marks scored : 99
    Name is : Raushan 
    Marks scored : 99 .
 */