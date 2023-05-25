package SEM2.Assignment02;
/*Question-2:
Define a class called Book with instance variables BName, BEdition, BPrice. Use constructor to 
initialize the instance variables of the class. Another instance method display ( ) to display the book 
information. A person purchase 5 different books. Display the book details which has the maximum 
price. */
import java.util.*;
public class ha2q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book books[] = new Book[5];
        for (int i = 0;i < books.length;i++){
            System.out.println("Enter the book name, edition and price respectively.");
            books[i] = new Book(sc.next(),sc.nextInt(),sc.nextDouble() );

        }
        sc.close();
        System.out.println("The details of the book with maximum price : "+Book.maxPrice(books));
    }
}
class Book{
    String BName;
    int BEdition;
    double BPrice;

    public Book(String BName,int BEdition,double BPrice){
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }
    public void display(){
        System.out.println("Book name is "+BName+" is of "+BEdition+" edition and the price of the book is "+BPrice);
    }

    public static Book maxPrice(Book arrBooks[]){
        Book maxPrice = arrBooks[0];
        for (int i = 0;i < arrBooks.length;i++){
            if (arrBooks[i].BPrice < maxPrice.BPrice){
                maxPrice= arrBooks[i];
            }
        }
        return maxPrice;
    }
}
/*Output:-
 * Enter the book name, edition and price respectively.
Chand
7
8987
Enter the book name, edition and price respectively.
dsa
88
8900
Enter the book name, edition and price respectively.
EarnnGrow
9
7888.98  
Enter the book name, edition and price respectively.
10_NOs
89
7876
Enter the book name, edition and price respectively.
Life?
8
7777
The details of the book with maximum price :
Book name is dsa is of 88 edition and the price of the book is 8900.0
*/