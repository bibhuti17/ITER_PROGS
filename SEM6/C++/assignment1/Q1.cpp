#include <iostream>
using namespace std;

int main() {
    enum day { Monday = 1, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday };
    
    int d;
    cout << "Enter the day number: ";
    cin >> d;

    if (d < 1 || d > 7) {
        cout << "Invalid day number" << endl;
        return -1;
    }

    day dayName = static_cast<day>(d);
    
    switch (dayName) {
        case Monday:
            cout << "Monday" << endl;
            break;
        case Tuesday:
            cout << "Tuesday" << endl;
            break;
        case Wednesday:
            cout << "Wednesday" << endl;
            break;
        case Thursday:
            cout << "Thursday" << endl;
            break;
        case Friday:
            cout << "Friday" << endl;
            break;
        case Saturday:
            cout << "Saturday" << endl;
            break;
        case Sunday:
            cout << "Sunday" << endl;
            break;
        default:
            cout << "Invalid day number" << endl;
    }

    cout << "End of the program" << endl;
    return 0;
}
