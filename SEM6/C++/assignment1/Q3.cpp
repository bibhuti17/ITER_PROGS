#include <iostream>
using namespace std;

int main() {
    int M;
    cout << "Enter the size of the vector: ";
    cin >> M;

    int *vctr = new int[M];
    for (int i = 0; i < M; i++) {
        cout << "Enter the element " << i + 1 << ": ";
        cin >> vctr[i];
    }

    cout << "The vector is: ";
    for (int i = 0; i < M; i++) {   
        cout << vctr[i] << " "; 
    }

    cout << endl;

    delete[] vctr;
    return 0;
}
