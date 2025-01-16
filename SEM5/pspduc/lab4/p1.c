#include <stdio.h>

void atm_dispenser(int amount, int *fifty, int *twenty , int *ten) {
    *fifty = amount / 50;
    amount %= 50;
    *twenty = amount / 20;
    amount %= 20;
    *ten = amount / 10;
    amount %= 10;
}
void main() {
    int amount, fifty, twenty, ten;

    printf("Enter the amount ");
    scanf("%d", &amount);

    if (amount % 10 != 0) {
        return;
    }

    atm_dispenser(amount, &fifty, &twenty, &ten);
    printf("fifty = %d \t twenty = %d \t ten = %d \n", fifty, twenty, ten);
    printf("Total amount of bills : %d", (fifty+twenty+ten));

}