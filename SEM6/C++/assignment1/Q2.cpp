#include <iostream>
using namespace std;

void swap(int &a, int &b) {
    a += b;
    b = a - b;
    a = a - b;
}

int main() {
    int a, b;
    cout << "Enter two numbers: ";
    cin >> a >> b;
    cout << "Before swapping: " << a << " " << b << endl;
    swap(a, b);
    cout << "After swapping: " << a << " " << b << endl;
    return 0;
}

