#include <stdio.h>

double acceleration(double, double, double);
void main()
{
    double initialSpeed, finalSpeed, time, timeHours, a, timeToRest, timeToRestMinutes;
    printf("Enter the initial speed of cyclist: ");
    scanf("%lf", &initialSpeed);
    printf("Enter the final speed of cyclist: ");
    scanf("%lf", &finalSpeed);
    printf("Enter the time taken  to go to 2.5 mi/hr cyclist: ");
    scanf("%lf", &time);
    timeHours = time / 60.0;
    a = acceleration(initialSpeed, finalSpeed, time);
    timeToRest = -initialSpeed / a;
    timeToRestMinutes = timeToRest * 60.0;

    printf("Acceleration: %lf mi/hr^2\n", a);
    printf("Time to come to rest: %lf minutes\n", timeToRestMinutes);
}

double acceleration(double u, double v, double t)
{
    return (u - v) / t;
}