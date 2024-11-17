#include <stdio.h>

// Function to convert compass heading to compass bearing
void convertToBearing(double heading) {
    char mainDirection, turnDirection;
    double angle;

    // Check for invalid compass headings
    if (heading < 0 || heading > 360) {
        printf("Invalid compass heading. Please enter a value between 0 and 360 degrees.\n");
        return;
    }

    // Determine the main direction (North or South) and the turning direction (East or West)
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

    // Print the compass bearing
    printf("Compass bearing: %c %.1f degrees %c\n", mainDirection, angle, turnDirection);
}

int main() {
    double heading;

    // Prompt the user for the compass heading in degrees
    printf("Enter the compass heading in degrees (0 to 360): ");
    scanf("%lf", &heading);

    // Convert the compass heading to compass bearing
    convertToBearing(heading);

    return 0;
}
