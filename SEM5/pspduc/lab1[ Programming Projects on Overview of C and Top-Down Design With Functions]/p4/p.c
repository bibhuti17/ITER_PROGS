#include <stdio.h>
#include <math.h>

void main(){
  double principalAmount,purchaseAmount, interestRate, anuunalInterestRate, borrowedAmount, monthlyPayment, downpayment ;
  int noOfPayments;

  printf("Enter the purchase amount : ");
  scanf("%lf", &purchaseAmount);
  printf("Enter the downpayment amount: ");
  scanf("%lf", &downpayment);
  printf("Enter the annual interest rate: ");
  scanf("%lf", &anuunalInterestRate);
  printf("Enter the number of payments: ");
  scanf("%d", &noOfPayments);

  borrowedAmount = purchaseAmount - downpayment;
  principalAmount = purchaseAmount - downpayment;
  interestRate = anuunalInterestRate / 12;

  monthlyPayment = (interestRate * principalAmount) / (1 - pow((1+interestRate), (1/noOfPayments)));

  printf("The borrowed amount is: %lf $\n", borrowedAmount);
  printf("The monthly payment is: %lf $", monthlyPayment);
}