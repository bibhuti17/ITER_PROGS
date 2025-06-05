#include <iostream>
#include <string>
using namespace std;

// Base class
class Person {
protected:
    string name;
    int code;
public:
    Person() : name(""), code(0) {}
    void setPerson(const string& n, int c) {
        name = n;
        code = c;
    }
    void displayPerson() const {
        cout << "Name: " << name << endl;
        cout << "Code: " << code << endl;
    }
};

// Account class, virtually inherits Person
class Account : virtual public Person {
protected:
    double pay;
public:
    Account() : pay(0.0) {}
    void setAccount(double p) {
        pay = p;
    }
    void displayAccount() const {
        cout << "Pay: " << pay << endl;
    }
};

// Admin class, virtually inherits Person
class Admin : virtual public Person {
protected:
    int experience;
public:
    Admin() : experience(0) {}
    void setAdmin(int exp) {
        experience = exp;
    }
    void displayAdmin() const {
        cout << "Experience: " << experience << " years" << endl;
    }
};

// Master class inherits from both Account and Admin
class Master : public Account, public Admin {
public:
    Master() {}
    void setMaster(const string& n, int c, int exp, double p) {
        setPerson(n, c);
        setAdmin(exp);
        setAccount(p);
    }
    void updatePay(double p) {
        pay = p;
    }
    void updateExperience(int exp) {
        experience = exp;
    }
    void display() const {
        displayPerson();
        displayAdmin();
        displayAccount();
    }
};

int main() {
    Master m;
    string name;
    int code, exp;
    double pay;

    // Input
    cout << "Enter name: ";
    getline(cin, name);
    cout << "Enter code: ";
    cin >> code;
    cout << "Enter experience (years): ";
    cin >> exp;
    cout << "Enter pay: ";
    cin >> pay;

    m.setMaster(name, code, exp, pay);

    // Display
    cout << "\n--- Master Object Information ---\n";
    m.display();

    // Update
    cout << "\nUpdate pay: ";
    cin >> pay;
    m.updatePay(pay);

    cout << "Update experience: ";
    cin >> exp;
    m.updateExperience(exp);

    // Display updated info
    cout << "\n--- Updated Master Object Information ---\n";
    m.display();

    return 0;
}
