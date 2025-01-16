#include <stdio.h>
#include <stdbool.h>

bool multiple(int n)
{
    if (n % 7 == 0 || n % 11 == 0 || n % 13 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool digitsumEv(int n)
{
    int sum = 0;
    while (n > 0)
    {
        sum += (n % 10);
        n /= 10;
    }
    return sum % 2 ? true : false;
}

bool isPrime(int n)
{
    if (n == 0 || n == 1)
        return false;
    for (int i = 2; i < n / 2; i++)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}

void point(int n, int *a, int *b, int *c) {
   *a = multiple(n);
   *b = digitsumEv(n);
   *c = isPrime(n);
}
void main()
{
    int a = 0, b = 0, c = 0, n;
    while (1)
    {
        printf("\n\nEnter a positive integer(negative value to stop): ");
        scanf("%d", &n);
        if (n < 0)
            break;
        point(n, &a, &b, &c);
        printf("\nIs the value a multiple of 7, 11, or 13? %c", a ? 'y' : 'n');
        printf("\nIs the sum of the digits odd or even? %c", b ? 'e' : 'o');
        printf("\nIs the value a prime number? %c", c ? 'y' : 'n');
    }
}