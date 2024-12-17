#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void scan_data(char *operator, double * operand)
{
    scanf(" %c %lf", operator, operand);
}

void do_next_op(char operator, double operand, double *acc)
{
    switch (operator)
    {
    case '+':
        *acc += operand;
        break;
    case '-':
        *acc -= operand;
        break;
    case '*':
        *acc *= operand;
        break;
    case '/':
        if (operand != 0)
        {
            *acc /= operand;
        }
        else
        {
            printf("Error: Division by zero.\n");
        }
        break;
    case '^':
        *acc = pow(*acc, operand);
        break;
    case 'e':
        // to quit the function
        break;
    default:
        printf("Error: Invalid operator '%c'.\n", operator);
    }
}

int main()
{
    char operator;
    double operand, acc = 0.0;

    printf("<-------------------Simple Calculator------------------------>\n");
    printf("Enter operations in the format: operator operand\n");
    printf("Valid operators: +, -, *, /, ^ (power), e (exit)\n");

    while (1)
    {
        scan_data(&operator, &operand);

        if (operator== 'e')
        {
            break; // Exit
        }

        do_next_op(operator, operand, &acc);
        printf("Result so far is %.4lf\n", acc);
    }

    printf("Final result is %.4lf\n", acc);
    return 0;
}

// <-------------------Simple Calculator------------------------>
// Enter operations in the format: operator operand
// Valid operators: +, -, *, /, ^ (power), e (exit)
// + 5
// Result so far is 5.0000
// ^ 2
// Result so far is 25.0000
// / 2.0
// Result so far is 12.5000
// e
// 0
// Final result is 12.5000