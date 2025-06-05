#include <iostream>
using namespace std;

class FLOAT {
private:
    float value;
public:
    // Constructors
    FLOAT() : value(0.0f) {}
    FLOAT(float v) : value(v) {}

    // Overload +
    FLOAT operator+(const FLOAT& other) const {
        return FLOAT(value + other.value);
    }

    // Overload -
    FLOAT operator-(const FLOAT& other) const {
        return FLOAT(value - other.value);
    }

    // Overload *
    FLOAT operator*(const FLOAT& other) const {
        return FLOAT(value * other.value);
    }

    // Overload /
    FLOAT operator/(const FLOAT& other) const {
        if (other.value == 0.0f) {
            cout << "Error: Division by zero!" << endl;
            return FLOAT(0.0f);
        }
        return FLOAT(value / other.value);
    }

    void display() const {
        cout << value << endl;
    }
};

int main() {
    FLOAT a(10.5f), b(2.5f);

    FLOAT sum = a + b;
    FLOAT diff = a - b;
    FLOAT prod = a * b;
    FLOAT quot = a / b;

    cout << "a + b = ";
    sum.display();

    cout << "a - b = ";
    diff.display();

    cout << "a * b = ";
    prod.display();

    cout << "a / b = ";
    quot.display();

    return 0;
}
