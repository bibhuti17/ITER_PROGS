#include <iostream>
#include <string>
using namespace std;

class Account {
protected:
    string customerName;
    int accountNumber;
    string accountType;
    double balance;

public:
    Account(string name, int accNum, string accType, double initialBalance)
        : customerName(name), accountNumber(accNum), 
          accountType(accType), balance(initialBalance) {}

    virtual void deposit(double amount) {
        balance += amount;
        cout << "Deposited: " << amount << endl;
    }

    virtual void displayBalance() {
        cout << "Account Balance: " << balance << endl;
    }

    virtual void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            cout << "Withdrawn: " << amount << endl;
        } else {
            cout << "Insufficient balance for withdrawal" << endl;
        }
    }

    virtual ~Account() {}
};

class SavAcct : public Account {
    double interestRate;

public:
    SavAcct(string name, int accNum, double initialBalance, double rate)
        : Account(name, accNum, "Savings", initialBalance), interestRate(rate) {}

    void computeAndDepositInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        cout << "Interest added: " << interest << endl;
    }

    void withdraw(double amount) override {
        Account::withdraw(amount);
    }
};

class CurAcct : public Account {
    double minimumBalance;
    double serviceCharge;

public:
    CurAcct(string name, int accNum, double initialBalance, 
            double minBalance, double charge)
        : Account(name, accNum, "Current", initialBalance),
          minimumBalance(minBalance), serviceCharge(charge) {}

    void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            cout << "Service charge imposed: " << serviceCharge << endl;
        }
    }

    void withdraw(double amount) override {
        Account::withdraw(amount);
        checkMinimumBalance();
    }
};

int main() {
    // Savings account demonstration
    SavAcct savings("Alice Smith", 1001, 5000.0, 3.5);
    savings.deposit(2000);
    savings.computeAndDepositInterest();
    savings.withdraw(1500);
    savings.displayBalance();

    // Current account demonstration
    CurAcct current("Bob Johnson", 2001, 10000.0, 5000.0, 500.0);
    current.deposit(3000);
    current.withdraw(8000);
    current.displayBalance();
    current.withdraw(2000);
    current.displayBalance();

    return 0;
}
