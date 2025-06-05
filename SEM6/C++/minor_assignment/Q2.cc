#include <iostream>
#include <vector>
#include <stdexcept>

class Vector {
    std::vector<float> elements;

public:
    Vector(size_t size = 0, float init = 0.0f) : elements(size, init) {
        if(size < 0) throw std::invalid_argument("Invalid vector size");
    }

    void setElement(size_t index, float value) {
        if(index >= elements.size()) throw std::out_of_range("Index out of bounds");
        elements[index] = value;
    }

    Vector add(const Vector& other) const {
        if(elements.size() != other.elements.size())
            throw std::invalid_argument("Vector size mismatch");
        
        Vector result(elements.size());
        for(size_t i = 0; i < elements.size(); ++i)
            result.elements[i] = elements[i] + other.elements[i];
        
        return result;
    }

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
        Vector v1(2);
        v1.setElement(0, 5.5f);
        v1.setElement(1, 7.2f);
        
        Vector v2(2);
        v2.setElement(0, 3.1f);
        v2.setElement(1, 4.8f);
        
        Vector v3 = v1.add(v2);
        
        std::cout << "Vector 1: "; v1.display();
        std::cout << "Vector 2: "; v2.display();
        std::cout << "Sum: "; v3.display();
    }
    catch(const std::exception& e) {
        std::cerr << "Error: " << e.what() << '\n';
    }
    return 0;
}
