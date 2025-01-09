#include <stdio.h>
#include <math.h>

int main() {
    double purchasePrice, downPayment, annualInterestRate;
    double principal, monthlyInterestRate, monthlyPayment;
    int totalPayments;

    printf("Enter the purchase price of the car: ");
    scanf("%lf", &purchasePrice);
    printf("Enter the down payment amount: ");
    scanf("%lf", &downPayment);
    printf("Enter the annual interest rate (as a percentage): ");
    scanf("%lf", &annualInterestRate);
    printf("Enter the total number of payments (e.g., 36, 48, 60): ");
    scanf("%d", &totalPayments);

    principal = purchasePrice - downPayment;

    monthlyInterestRate = (annualInterestRate / 100) / 12;

    monthlyPayment = (monthlyInterestRate * principal) /
                     (1 - pow(1 + monthlyInterestRate, -totalPayments));

    printf("Amount borrowed: $%.2f\n", principal);
    printf("Monthly payment: $%.2f\n", monthlyPayment);

    return 0;
}
