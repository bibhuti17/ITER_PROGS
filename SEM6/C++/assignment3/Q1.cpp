#include <iostream>
#include <string>
using namespace std;

class String {
private:
    string str;

public:
    String() : str("") {}

    String(const char* s) : str(s) {}

    String(const String& other) : str(other.str) {}

    String add(const String& other) const {
        String result;
        result.str = str + other.str;
        return result;
    }

    void display() const {
        cout << str << endl;
    }
};

int main() {
    String s1;
    cout << "Uninitialized String: ";
    s1.display();

    String s2("Well done!");
    cout << "String initialized with constant: ";
    s2.display();

    String s3(" Hello");
    String s4 = s2.add(s3);
    cout << "Concatenated String: ";
    s4.display();

    String s5(s2);
    cout << "Copied String: ";
    s5.display();

    return 0;
}
