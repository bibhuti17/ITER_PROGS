#include <iostream>
#include <vector>
#include <stdexcept>

class Vector {
    std::vector<float> elements;

public:
    // (a) Create vector
    Vector(size_t size = 0, float init = 0.0f) : elements(size, init) {
        if(size < 0) throw std::invalid_argument("Invalid vector size");
    }

    // (b) Modify element
    void setElement(size_t index, float value) {
        if(index >= elements.size()) throw std::out_of_range("Index out of bounds");
        elements[index] = value;
    }

    // (c) Multiply by scalar
    void multiplyByScalar(float scalar) noexcept {
        for(auto& elem : elements) elem *= scalar;
    }

    // (d) Display vector
    void display() const noexcept {
        std::cout << "(";
        for(size_t i = 0; i < elements.size(); ++i) {
            std::cout << elements[i];
            if(i != elements.size() - 1) std::cout << ", ";
        }
        std::cout << ")\n";
    }
};

int main() {
    try {
        Vector v(3);
        v.setElement(0, 10.5f);
        v.setElement(1, 20.25f);
        v.setElement(2, 30.75f);
        
        std::cout << "Original vector: ";
        v.display();
        
        v.multiplyByScalar(1.5f);
        std::cout << "Scaled vector: ";
        v.display();
    }
    catch(const std::exception& e) {
        std::cerr << "Error: " << e.what() << '\n';
    }
    return 0;
}
