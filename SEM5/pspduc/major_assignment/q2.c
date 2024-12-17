#include <stdio.h>

// Function to check if a value is within x percent of a reference value
int within_x_percent(double ref, double data, double x) {
    double lower_bound = ref - (x / 100.0) * ref;
    double upper_bound = ref + (x / 100.0) * ref;
    return (data >= lower_bound && data <= upper_bound);
}

int main() {
    // Define substances and their normal boiling points
    const char *substances[] = {"Water", "Mercury", "Copper", "Silver", "Gold"};
    const double boiling_points[] = {100.0, 357.0, 1187.0, 2193.0, 2660.0};
    const int num_substances = sizeof(boiling_points) / sizeof(boiling_points[0]);
    
    double observed_boiling_point;
    
    // Prompt user for observed boiling point
    printf("Enter the observed boiling point in °C: ");
    scanf("%lf", &observed_boiling_point);
    
    int found = 0; // Flag to check if substance is found
    
    // Check against each substance's boiling point
    for (int i = 0; i < num_substances; i++) {
        if (within_x_percent(boiling_points[i], observed_boiling_point, 5.0)) {
            printf("The substance is: %s\n", substances[i]);
            found = 1; // Set flag to indicate a match was found
            break; // Exit the loop as we found a match
        }
    }
    
    // If no match was found, print unknown message
    if (!found) {
        printf("Substance Unknown\n");
    }
    
    return 0;
}
