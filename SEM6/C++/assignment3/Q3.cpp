#include <iostream>
#include <string>
using namespace std;

class Book {
private:
    string title;
    string author;
    string publisher;
    double price;

public:
    // Default constructor
    Book() {
        title = "";
        author = "";
        publisher = "";
        price = 0.0;
    }

    // Parameterized constructor
    Book(string t, string a, string p, double pr) {
        this->title = t;
        this->author = a;
        this->publisher = p;
        this->price = pr;
    }

    // Function to input book details
    void inputDetails() {
        cout << "\nEnter Book Details:" << endl;
        cout << "Title: ";
        cin.ignore();
        getline(cin, title);
        cout << "Author: ";
        getline(cin, author);
        cout << "Publisher: ";
        getline(cin, publisher);
        cout << "Price: ";
        cin >> price;
    }

    // Function to display book details
    void displayDetails() {
        cout << "\nBook Details:" << endl;
        cout << "Title: " << this->title << endl;
        cout << "Author: " << this->author << endl;
        cout << "Publisher: " << this->publisher << endl;
        cout << "Price: Rs. " << this->price << endl;
    }

    // Function to search book by title and author
    bool search(string searchTitle, string searchAuthor) {
        return (this->title == searchTitle && this->author == searchAuthor);
    }
};

int main() {
    int numBooks;
    cout << "Enter the number of books in inventory: ";
    cin >> numBooks;

    Book* inventory = new Book[numBooks];

    // Input details for all books
    for(int i = 0; i < numBooks; i++) {
        cout << "\nBook " << i + 1;
        inventory[i].inputDetails();
    }

    char continueSearch;
    do {
        string searchTitle, searchAuthor;
        cout << "\nEnter book details to search:" << endl;
        cout << "Title: ";
        cin.ignore();
        getline(cin, searchTitle);
        cout << "Author: ";
        getline(cin, searchAuthor);

        bool found = false;
        for(int i = 0; i < numBooks; i++) {
            if(inventory[i].search(searchTitle, searchAuthor)) {
                cout << "\nBook found!" << endl;
                inventory[i].displayDetails();
                found = true;
                break;
            }
        }

        if(!found) {
            cout << "\nSorry, the book is not available in our inventory." << endl;
        }

        cout << "\nDo you want to search for another book? (y/n): ";
        cin >> continueSearch;

    } while(continueSearch == 'y' || continueSearch == 'Y');

    delete[] inventory;
    return 0;
}
