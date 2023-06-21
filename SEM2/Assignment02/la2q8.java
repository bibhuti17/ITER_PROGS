package SEM2.Assignment02;
/*Question-8:
Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display 
name of a person, count the no. of characters present in the name of the person. */

public class la2q8 {
    public static void main(String[] args) {
        person_1 p1 = new person_1("Milkha Singh");
        person_1 p2 = new person_1("Ashish Singh");
    
        p1.display();
        System.out.println("No. of characters in name : " + p1.count());
    
        p2.display();
        System.out.println("No. of characters in name : " + p2.count());
    
        System.out.println("Maximum character count : " + person_1.getMaxcount());
    }
}

 
interface DetailInfo{
    void display();
    int count();
}
  
class person_1 implements DetailInfo {
    public static int maxcount = 0;
    public String name;
  
    public person_1(String name) {
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
  
/*Name: Milkha Singh
No. of characters in name : 12
Name: Ashish Singh
No. of characters in name : 12
Maximum character count : 12 */ 
  
