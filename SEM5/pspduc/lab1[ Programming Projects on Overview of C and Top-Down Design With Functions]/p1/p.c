// PROBLEM
// Write a program to assist in the design of a hydroelectric dam. Prompt the user for the height
//  of the dam and for the number of cubic meters of water that are projected to flow from the top
//  to the bottom of the dam each second. Predict how many megawatts (1MW = 106W) of power
//  will be produced if 90% of the work done on the water by gravity is converted to electrical
//  energy. Note that the mass of one cubic meter of water is 1000 kg. Use 9.80 meters/second2
//  as the gravitational constant g . Be sure to use meaningful names for both the gravitational
//  constant and the 90% efficiency constant. For one run, use a height of 170 m and flow of
//  1.30 × 103 m3/s. The relevant formula ( w = work, m = mass, g = gravity, h = height) is: ws
//  = mgh.


#include <stdio.h>
#define g 9.8
#define efficiency 0.9
#define wcmc 1000
#define megawatt_conversion 1e6

void main()
{
    double mass, h, work, flow, power, mw;
    printf("Enter the flow rate.");
    scanf("%lf", &flow);
    printf("Enter the height of the dam.");
    scanf("%lf", &h);
    mass = flow * wcmc;
    work = mass * g * h;
    power = work * efficiency;
    mw = power / megawatt_conversion;
    printf("Predicted power output: %lf MW", mw);
}
