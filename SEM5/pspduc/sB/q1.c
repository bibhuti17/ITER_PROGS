#include <stdio.h>
#include <math.h>

double calculate_square_root(double N) {
    double LG = 1.0;
    double NG;
    
    do {
        NG = 0.5 * (LG + N / LG);
        if (fabs(NG - LG) < 0.005) {
            break;
        }
        LG = NG;
    } while (1);
    
    return NG;
}

int main() {
    double numbers[] = {4, 120.5};
    
    for (int i = 0; i < 2; i++) {
        double sqrt_value = calculate_square_root(numbers[i]);
        printf("Square root of %.2f is approximately %.5f\n", numbers[i], sqrt_value);
    }
    
    return 0;
}
