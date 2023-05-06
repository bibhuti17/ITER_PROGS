package SEM2.Assignment02;
import java.util.*;
public class la2q8 {
    public static void main(String[] args) {
        
    }
}

interface DetailInfo{
    void display();
    int count(String name);
}

class Person implements DetailInfo{
    static int maxcount ;
    String name;

    public void name(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name :");this.name = sc.next();sc.close();
    }

    public void display(){
        System.out.println("The name is "+name);
    }

    public int count(String name){
        int count = 0;
        for(int i = 0;i < name.length();i++){
            count++;
        }
        return count;
    }

     
}
