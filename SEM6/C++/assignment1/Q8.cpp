#include <iostream>
using namespace std;

double power(double m, int n = 2) {
    double result = 1;
    for(int i = 0; i < n; i++) {
        result *= m;
    }
    return result;
}

int main() {
    double m;
    int n;
    char choice;

    cout << "Enter the base number (m): ";
    cin >> m;

    cout << "Do you want to enter the power (y/n)? ";
    cin >> choice;

    if(choice == 'y' || choice == 'Y') {
        cout << "Enter the power (n): ";
        cin >> n;
        cout << m << " raised to power " << n << " is: " << power(m, n) << endl;
    } else {
        cout << m << " squared is: " << power(m) << endl;
    }

    return 0;
}
