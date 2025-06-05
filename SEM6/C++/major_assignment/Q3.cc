#include <iostream>
#include <iomanip>
using namespace std;

const int MAX_ITEMS = 100;

class ShoppingList {
    int codes[MAX_ITEMS];
    float prices[MAX_ITEMS];
    int count;

public:
    ShoppingList() : count(0) {}

    void addItem(int code, float price) {
        if (count < MAX_ITEMS) {
            codes[count] = code;
            prices[count] = price;
            count++;
            cout << "Item added successfully.\n";
        } else {
            cout << "Shopping list is full!\n";
        }
    }

    void deleteItem(int code) {
        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (codes[i] == code) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            for (int i = pos; i < count - 1; i++) {
                codes[i] = codes[i + 1];
                prices[i] = prices[i + 1];
            }
            count--;
            cout << "Item deleted successfully.\n";
        } else {
            cout << "Item with code " << code << " not found!\n";
        }
    }

    void displayItems() const {
        if (count == 0) {
            cout << "Shopping list is empty.\n";
            return;
        }
        cout << left << setw(10) << "Code" << setw(10) << "Price" << endl;
        for (int i = 0; i < count; i++) {
            cout << left << setw(10) << codes[i] << setw(10) << prices[i] << endl;
        }
    }

    void totalValue() const {
        float total = 0;
        for (int i = 0; i < count; i++) {
            total += prices[i];
        }
        cout << "Total value of the order: " << total << endl;
    }
};

int main() {
    ShoppingList list;
    int choice, code;
    float price;

    do {
        cout << "\n--- Shopping List Menu ---\n";
        cout << "1. Add item\n";
        cout << "2. Delete item\n";
        cout << "3. Display all items\n";
        cout << "4. Print total value\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
        case 1:
            cout << "Enter item code: ";
            cin >> code;
            cout << "Enter item price: ";
            cin >> price;
            list.addItem(code, price);
            break;
        case 2:
            cout << "Enter item code to delete: ";
            cin >> code;
            list.deleteItem(code);
            break;
        case 3:
            list.displayItems();
            break;
        case 4:
            list.totalValue();
            break;
        case 5:
            cout << "Exiting...\n";
            break;
        default:
            cout << "Invalid choice! Try again.\n";
        }
    } while (choice != 5);

    return 0;
}
