#include <stdio.h>
#include <math.h>

void main()
{
    double t, v, s, a;
    printf("Enter the takeoff speed (km/hr): ");
    scanf("%lf", &v);
    printf("Enter the distance (meters): ");
    scanf("%lf", &s);
    v = v * 1000 / 3600;
    a = (v * v) / (2 * s);
    t = sqrt((2 * s) / a);
    printf("The time taken is: %lf s\n", t);
    printf("The acceleration is: %lf m/s^2", a);
}
