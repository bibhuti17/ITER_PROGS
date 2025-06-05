#include <iostream>
using namespace std;

class DB; 

class DM {
private:
    int metres;
    int centimetres;
public:
    void getdata() {
        cout << "Enter distance in metres: ";
        cin >> metres;
        cout << "Enter distance in centimetres: ";
        cin >> centimetres;
        
        if (centimetres >= 100) {
            metres += centimetres / 100;
            centimetres %= 100;
        }
    }
    
    void display() {
        cout << metres << " metres and " << centimetres << " centimetres" << endl;
    }
    
    friend DM add1(DM, DB);
    friend DB add2(DM, DB);
};

class DB {
private:
    int feet;
    int inches;
public:
    void getdata() {
        cout << "Enter distance in feet: ";
        cin >> feet;
        cout << "Enter distance in inches: ";
        cin >> inches;
        
        if (inches >= 12) {
            feet += inches / 12;
            inches %= 12;
        }
    }
    
    void display() {
        cout << feet << " feet and " << inches << " inches" << endl;
    }
    
    friend DM add1(DM, DB);
    friend DB add2(DM, DB);
};

DM add1(DM d1, DB d2) {
    DM result;
    int total_cm = (d2.feet * 30.48) + (d2.inches * 2.54);
    
    result.metres = d1.metres + (total_cm / 100);
    result.centimetres = d1.centimetres + (total_cm % 100);
    
    if (result.centimetres >= 100) {
        result.metres += result.centimetres / 100;
        result.centimetres = result.centimetres % 100;
    }
    
    return result;
}

DB add2(DM d1, DB d2) {
    DB result;
   
    int total_inches = (d1.metres * 39.37) + (d1.centimetres * 0.3937);
    
    
    result.feet = d2.feet + (total_inches / 12);
    result.inches = d2.inches + (total_inches % 12);
    
    if (result.inches >= 12) {
        result.feet += result.inches / 12;
        result.inches = result.inches % 12;
    }
    
    return result;
}

int main() {
    DM dm;
    DB db;
    
    cout << "Enter first distance in metres and centimetres:\n";
    dm.getdata();
    
    cout << "\nEnter second distance in feet and inches:\n";
    db.getdata();
    
    int choice;
    cout << "\nIn which format do you want the result?\n";
    cout << "1. Metres and Centimetres\n";
    cout << "2. Feet and Inches\n";
    cout << "Enter your choice (1 or 2): ";
    cin >> choice;
    
    if (choice == 1) {
        DM result = add1(dm, db);
        cout << "\nSum of distances = ";
        result.display();
    }
    else if (choice == 2) {
        DB result = add2(dm, db);
        cout << "\nSum of distances = ";
        result.display();
    }
    else {
        cout << "Invalid choice!\n";
    }
    
    return 0;
}
