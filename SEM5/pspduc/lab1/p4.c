#include <stdio.h>
#include <math.h>

int main() {
    // Declare variables
    double purchasePrice, downPayment, annualInterestRate;
    double principal, monthlyInterestRate, monthlyPayment;
    int totalPayments;

    // Prompt user for input
    printf("Enter the purchase price of the car: ");
    scanf("%lf", &purchasePrice);
    printf("Enter the down payment amount: ");
    scanf("%lf", &downPayment);
    printf("Enter the annual interest rate (as a percentage): ");
    scanf("%lf", &annualInterestRate);
    printf("Enter the total number of payments (e.g., 36, 48, 60): ");
    scanf("%d", &totalPayments);

    // Calculate the principal amount
    principal = purchasePrice - downPayment;

    // Calculate the monthly interest rate
    monthlyInterestRate = (annualInterestRate / 100) / 12;

    // Calculate the monthly payment using the formula
    monthlyPayment = (monthlyInterestRate * principal) /
                     (1 - pow(1 + monthlyInterestRate, -totalPayments));

    // Display the amount borrowed and the monthly payment
    printf("Amount borrowed: $%.2f\n", principal);
    printf("Monthly payment: $%.2f\n", monthlyPayment);

    return 0;
}
