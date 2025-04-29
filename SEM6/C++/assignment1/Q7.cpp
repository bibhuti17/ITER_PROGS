#include <iostream>
using namespace std;

#define MAX3(a, b, c) ((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c))

int main() {
    int num1, num2, num3;
    cout << "Enter three numbers: ";
    cin >> num1 >> num2 >> num3;
    
    cout << "The largest number is: " << MAX3(num1, num2, num3) << endl;
    
    return 0;
}
