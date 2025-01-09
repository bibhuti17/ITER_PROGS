#include <stdio.h>
#include <math.h>

void analyze_number(int num, int *multiple_check, int *digit_sum_check, int *perfect_square_check) {
    *multiple_check = (num % 3 == 0) || (num % 5 == 0) || (num % 8 == 0);
    
    int sum_of_digits = 0;
    int temp = num;
    while (temp > 0) {
        sum_of_digits += temp % 10;
        temp /= 10;
    }
    *digit_sum_check = (sum_of_digits % 4 == 0);
    
    int sqrt_num = (int)sqrt(num);
    *perfect_square_check = (sqrt_num * sqrt_num == num);
}

int main() {
    int numbers[] = {15, 27, 81, 100, 49, 153};
    int size = sizeof(numbers) / sizeof(numbers[0]);
    
    for (int i = 0; i < size; i++) {
        int multiple_check, digit_sum_check, perfect_square_check;
        analyze_number(numbers[i], &multiple_check, &digit_sum_check, &perfect_square_check);
        
        printf("Number: %d\n", numbers[i]);
        printf("Multiple of 3, 5, or 8: %s\n", multiple_check ? "Yes" : "No");
        printf("Sum of digits divisible by 4: %s\n", digit_sum_check ? "Yes" : "No");
        printf("Perfect square: %s\n", perfect_square_check ? "Yes" : "No");
        printf("\n");
    }

    return 0;
}
