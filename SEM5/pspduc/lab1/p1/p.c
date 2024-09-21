#include <stdio.h>
#define g 9.8
#define efficiency 0.9
#define wcmc 1000
#define megawatt_conversion 1e6

void main() {
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
