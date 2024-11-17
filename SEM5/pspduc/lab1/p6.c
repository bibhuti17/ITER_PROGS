#include <stdio.h>

int celsius_at_depth(int depth)
{
    return 10 * depth + 20;
}

int fahrenheit(int celsius)
{
    return 1.8 * celsius + 32;
}

void main()
{
    int depth;
    printf("Enter the depth in kilometers: ");
    scanf("%d", &depth);
    int celsius = celsius_at_depth(depth);
    printf("The temperature at this depth is: %d degrees Celsius\n", celsius);
    int f = fahrenheit(celsius);
    printf("The temperature at this depth is: %d degrees Fahrenheit\n", f);
}