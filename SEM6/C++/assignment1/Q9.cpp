#include <iostream>
using namespace std;

double power(double m, int n = 2) {
    double result = 1;
    for(int i = 0; i < n; i++) {
        result *= m;
    }
    return result;
}

double power(int m, int n = 2) {
    double result = 1;
    for(int i = 0; i < n; i++) {
        result *= m;
    }
    return result;
}

int main() {
    double m_double;
    int m_int, n;
    char choice;

    cout << "Enter a double value for base (m): ";
    cin >> m_double;
    cout << "Enter an integer value for base (m): ";
    cin >> m_int;

    cout << "Do you want to enter the power (y/n)? ";
    cin >> choice;

    if(choice == 'y' || choice == 'Y') {
        cout << "Enter the power (n): ";
        cin >> n;
        cout << m_double << " raised to power " << n << " is: " << power(m_double, n) << endl;
        cout << m_int << " raised to power " << n << " is: " << power(m_int, n) << endl;
    } else {
        cout << m_double << " squared is: " << power(m_double) << endl;
        cout << m_int << " squared is: " << power(m_int) << endl;
    }

    return 0;
}
