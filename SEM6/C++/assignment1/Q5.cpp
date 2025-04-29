#include <iostream>
using namespace std;

void readMatrix(int **matrix, int m, int n) {
    cout << "Enter the matrix elements:" << endl;
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            cout << "Enter element [" << i << "][" << j << "]: ";
            cin >> matrix[i][j];
        }
    }
}

void displayMatrix(int **matrix, int m, int n) {
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
    cout << "Enter the number of rows: ";
    cin >> m;
    cout << "Enter the number of columns: ";
    cin >> n;

    int **matrix = new int*[m];
    for(int i = 0; i < m; i++) {
        matrix[i] = new int[n];
    }

    
    readMatrix(matrix, m, n);
    displayMatrix(matrix, m, n);

    for(int i = 0; i < m; i++) {
        delete[] matrix[i];
    }
    delete[] matrix;

    return 0;
}
