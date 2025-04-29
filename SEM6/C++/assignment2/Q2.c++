#include <iostream>
#include <cstring>
using namespace std;

class Bank {
   char name[50];
   int acc_no;
   char acc_type[10];
   double balance;
   public:
      Bank() {
         strcpy(name,"");
         acc_no = 0;
         strcpy(acc_type,"");
         balance = 0.0;
      }
      
      Bank(const char name[], int acc_no, const char acc_type[], double balance) {
         strcpy(this->name, name);
         this->acc_no = acc_no;
         strcpy(this->acc_type, acc_type);
         this->balance = balance;
      }

      void loadC() {
         int b;
         cout << endl << "Enter name: ";
         cin >> name;
         cout << "Enter Account Number: ";
         cin >> acc_no;
         cout << "Enter Account Type: ";
         cin >> acc_type;
         cout << "Enter Balance: ";
         cin >> b;
         if(b < 0)
            cout << "Invalid Balance. Please enter a positive number.";
         else
            balance = b;
      }

      void deposit(double val) {
         if(val <= 0)
            cout << "Invalid deposit amount" << endl;
         else {
            balance += val;
            cout << "Deposited: " << val << endl;
         }
      }

      void withdraw(double val) {
         if(val <= 0)
            cout << "Invalid withdrawal amount" << endl;
         else if(val > balance)
            cout << "Insufficient balance" << endl;
         else {
            balance -= val;
            cout << "Withdrawn: " << val << endl;
         }
      }

      void display() {
         cout << "Name: " << name << endl;
         cout << "Balance: " << balance << endl;
      }
};

int main() {
   Bank accounts[10];
   int i;
   for(i = 0; i < 10; i++) {
      accounts[i].loadC();
   }
   for(i = 0; i < 10; i++) {
      accounts[i].display();
      accounts[i].deposit(100 + i * 10);
      accounts[i].withdraw(10 + i * 10);
      cout << endl;
   }
   
   return 0;
}

/*
Enter name: Priyansh
Enter Account Number: 544114155
Enter Account Type: savings
Enter Balance: 74512

Enter name: Arya
Enter Account Number: 5545555
Enter Account Type: current
Enter Balance: 25223

Enter name: Rinku    
Enter Account Number: 23212521
Enter Account Type: savings
Enter Balance: 525652

Enter name: Raman
Enter Account Number: 545521222
Enter Account Type: savings
Enter Balance: 22522 

Enter name: Ramandeep
Enter Account Number: 542222
Enter Account Type: current
Enter Balance: 545222

Enter name: Sara
Enter Account Number: 552285  
Enter Account Type: current
Enter Balance: 52222

Enter name: Kavya
Enter Account Number: 5522141
Enter Account Type: savings
Enter Balance: 5454252545

Enter name: Enter Account Number: Enter Account Type: Enter Balance:
Enter name: Enter Account Number: Enter Account Type: Enter Balance:
Enter name: Enter Account Number: Enter Account Type: Enter Balance: Name: Priyansh
Balance: 74512
Deposited: 100
Withdrawn: 10

Name: Arya
Balance: 25223
Deposited: 110
Withdrawn: 20

Name: Rinku
Balance: 525652
Deposited: 120
Withdrawn: 30

Name: Raman
Balance: 22522
Deposited: 130
Withdrawn: 40

Name: Ramandeep
Balance: 545222
Deposited: 140
Withdrawn: 50

Name: Sara
Balance: 52222
Deposited: 150
Withdrawn: 60

Name: Kavya
Balance: 2.14748e+009
Deposited: 160
Withdrawn: 70

Name:
Balance: 2.14748e+009
Deposited: 170
Withdrawn: 80

Name:
Balance: 2.14748e+009
Deposited: 180
Withdrawn: 90

Name:
Balance: 2.14748e+009
Deposited: 190
Withdrawn: 100*/