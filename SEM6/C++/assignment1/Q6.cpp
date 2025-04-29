#include <iostream>
using namespace std;

void readMatrix(int **matrix, int n, int m = 3) {
    cout << "Enter the matrix elements:" << endl;
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            cout << "Enter element [" << i << "][" << j << "]: ";
            cin >> matrix[i][j];
        }
    }
}

void displayMatrix(int **matrix, int n, int m = 3) {
    cout << "\nThe matrix is:" << endl;
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    int m, n;
    cout << "Enter the number of columns: ";
    cin >> n;
    cout << "Enter the number of rows (default is 3): ";
    cin >> m;

    int **matrix = new int*[m];
    for(int i = 0; i < m; i++) {
        matrix[i] = new int[n];
    }

    if(m == 3) {
        readMatrix(matrix, n);  // Using default row value
        displayMatrix(matrix, n);
    } else {
        readMatrix(matrix, n, m);  // Using provided row value
        displayMatrix(matrix, n, m);
    }

    for(int i = 0; i < m; i++) {
        delete[] matrix[i];
    }
    delete[] matrix;

    return 0;
}
