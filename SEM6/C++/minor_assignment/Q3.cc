#include <iostream>
#include <stdexcept>

class Number {
    int value = 0;

public:
    void setNumber(int n) noexcept { value = n; }
    int getNumber() const noexcept { return value; }
    
    void printNumber() const noexcept { std::cout << value << '\n'; }
    
    bool isNegative() const noexcept {
        return value < 0;
    }
    
    bool isDivisibleBy(int n) const {
        if(n == 0) throw std::invalid_argument("Division by zero");
        return value % n == 0;
    }
    
    int absoluteValue() const noexcept {
        return value < 0 ? -value : value;
    }
};

int main() {
    try {
        Number num;
        num.setNumber(-15);
        
        std::cout << "Number: ";
        num.printNumber();
        
        std::cout << "Absolute value: " << num.absoluteValue() << '\n';
        std::cout << "Is negative? " << std::boolalpha << num.isNegative() << '\n';
        std::cout << "Divisible by 5? " << num.isDivisibleBy(5) << '\n';
        
        // Test edge case
        num.setNumber(0);
        std::cout << "\nZero tests:\n";
        std::cout << "Is negative? " << num.isNegative() << '\n';
        std::cout << "Divisible by 7? " << num.isDivisibleBy(7) << '\n';
    }
    catch(const std::exception& e) {
        std::cerr << "Error: " << e.what() << '\n';
    }
    return 0;
}

