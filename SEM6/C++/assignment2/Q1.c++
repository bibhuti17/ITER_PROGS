#include <iostream>
#include <string>
using namespace std;

class BankAccount {
private:
    string depositorName;
    long accountNumber;
    string accountType;
    double balance;

public:
    void initializeAccount(string name, long accNum, string type, double initialBalance) {
        this->depositorName = name;
        this->accountNumber = accNum;
        this->accountType = type;
        this->balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "Amount " << amount << " deposited successfully" << endl;
            cout << "New balance: " << balance << endl;
        } else {
            cout << "Invalid deposit amount" << endl;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            cout << "Amount " << amount << " withdrawn successfully" << endl;
            cout << "Remaining balance: " << balance << endl;
        } else if (amount > balance) {
            cout << "Insufficient balance" << endl;
        } else {
            cout << "Invalid withdrawal amount" << endl;
        }
    }

    void displayInfo() {
        cout << "\nAccount Information:" << endl;
        cout << "Name: " << depositorName << endl;
        cout << "Balance: Rs. " << balance << endl;
    }
};

int main() {
    BankAccount account;
    string name, type;
    long accNum;
    double initialBalance;
    
    cout << "Enter account holder name: ";
    getline(cin, name);
    
    cout << "Enter account number: ";
    cin >> accNum;
    
    cin.ignore();  // Clear input buffer
    cout << "Enter account type (savings/current): ";
    getline(cin, type);
    
    cout << "Enter initial balance: ";
    cin >> initialBalance;

    account.initializeAccount(name, accNum, type, initialBalance);
    
    int choice;
    double amount;
    
    do {
        cout << "\n1. Deposit";
        cout << "\n2. Withdraw";
        cout << "\n3. Display Account Info";
        cout << "\n4. Exit";
        cout << "\nEnter your choice (1-4): ";
        cin >> choice;

        switch(choice) {
            case 1:
                cout << "Enter amount to deposit: ";
                cin >> amount;
                account.deposit(amount);
                break;
            
            case 2:
                cout << "Enter amount to withdraw: ";
                cin >> amount;
                account.withdraw(amount);
                break;
            
            case 3:
                account.displayInfo();
                break;
            
            case 4:
                cout << "Thank you for using our banking system!" << endl;
                break;
            
            default:
                cout << "Invalid choice!" << endl;
        }
    } while(choice != 4);

    return 0;
}
