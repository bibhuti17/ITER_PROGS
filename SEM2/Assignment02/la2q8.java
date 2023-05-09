package SEM2.Assignment02;
/*Question-8:
Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display 
name of a person, count the no. of characters present in the name of the person. */

public class la2q8 {
    public static void main(String[] args) {
        Person p1 = new Person("Milkha Singh");
        Person p2 = new Person("Ashish Singh");
    
        p1.display();
        System.out.println("No. of characters in name : " + p1.count());
    
        p2.display();
        System.out.println("No. of characters in name : " + p2.count());
    
        System.out.println("Maximum character count : " + Person.getMaxcount());
    }
}

 
interface DetailInfo{
    void display();
    int count();
}
  
class Person implements DetailInfo {
    public static int maxcount = 0;
    public String name;
  
    public Person(String name) {
      this.name = name;
    }
  
    public void display() {
      System.out.println("Name: " + name);
    }
  
    public int count() {
      int charCount = name.length();
      if (charCount > maxcount) {
        maxcount = charCount;
      }
      return charCount;
    }
  
    public static int getMaxcount() {
      return maxcount;
    }
}
  
   
  
