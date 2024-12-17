#include <stdio.h>

int within_x_percent(double ref, double data, double x)
{
    double lower_bound, upper_bound;
    lower_bound = ref - (x / 100.0) * ref;
    upper_bound = ref + (x / 100.0) * ref;
    return (data >= lower_bound && data <= upper_bound);
}

int main()
{
    double obs_bp;
    int found = 0;
    const char *substances[] = {"Water", "Mercury", "Copper", "Silver", "Gold"};
    const double boiling_points[] = {100.0, 357.0, 1187.0, 2193.0, 2660.0};
    const int num_subs = sizeof(boiling_points) / sizeof(boiling_points[0]);

    printf("Please provide the observed boiling point in celcius : ");
    scanf("%lf", &obs_bp);

    for (int i = 0; i < num_subs; i++)
    {
        if (within_x_percent(boiling_points[i], obs_bp, 5.0))
        {
            printf("The substance is: %s\n", substances[i]);
            found = 1;
            break;
        }
    }

    if (!found)
    {
        printf("Substance Unknown\n");
    }

    return 0;
}

// Please provide the observed boiling point in celcius : 1209
// The substance is: Copper