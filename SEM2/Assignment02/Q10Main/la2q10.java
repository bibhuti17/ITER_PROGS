/*Design a package that contains two classes Student & Test. The Student class has data
members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
Find grand total mark & score in another class. */
package SEM2.Assignment02.Q10Main;
import SEM2.Assignment02.Q10A.*;
import SEM2.Assignment02.Q10B.*;
public class la2q10 implements Sports {
    public static void main(String[] args) {
        Test testObj = new Test();
        testObj.input();
        testObj.output();

        int grandTotal = testObj.getMark1() + testObj.getMark2() + score1 + score2;
        System.out.println("Grand Total: " + grandTotal);
    }
}
