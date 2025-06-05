#include <iostream>
using namespace std;

class Counter {
private:
    int value;
public:

    Counter(int v = 0) : value(v) {}

    // Overload prefix ++
    Counter& operator++() {
        ++value;
        return *this;
    }

    // Overload postfix ++
    Counter operator++(int) {
        Counter temp = *this;
        value++;
        return temp;
    }

    void display() const {
        cout << "Counter value: " << value << endl;
    }
};

int main() {
    Counter c1(5);

    cout << "Initial value: ";
    c1.display();

    ++c1;
    cout << "After prefix ++c1: ";
    c1.display();

    c1++;
    cout << "After postfix c1++: ";
    c1.display();

    Counter c2 = c1++;
    cout << "Value of c2 after c2 = c1++: ";
    c2.display();
    cout << "Value of c1 after c2 = c1++: ";
    c1.display();

    return 0;
}
