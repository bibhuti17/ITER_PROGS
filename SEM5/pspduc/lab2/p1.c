#include <stdio.h>


void convertToBearing(double heading) {
    char mainDirection, turnDirection;
    double angle;

    if (heading < 0 || heading > 360) {
        printf("Invalid compass heading. Please enter a value between 0 and 360 degrees.\n");
        return;
    }

    if (heading >= 0 && heading < 90) {
        mainDirection = 'N';
        turnDirection = 'E';
        angle = heading;
    } else if (heading >= 90 && heading < 180) {
        mainDirection = 'S';
        turnDirection = 'E';
        angle = 180 - heading;
    } else if (heading >= 180 && heading < 270) {
        mainDirection = 'S';
        turnDirection = 'W';
        angle = heading - 180;
    } else {
        mainDirection = 'N';
        turnDirection = 'W';
        angle = 360 - heading;
    }

    printf("Compass bearing: %c %.1f degrees %c\n", mainDirection, angle, turnDirection);
}

int main() {
    double heading;

    printf("Enter the compass heading in degrees (0 to 360): ");
    scanf("%lf", &heading);
    convertToBearing(heading);

    return 0;
}
