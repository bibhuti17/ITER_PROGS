#include <stdio.h>
void predictSquareRoot(int n, double lg, double *ng)
{
    *ng = 0.5 * (lg + n / lg);
    while (fabs(lg - *ng) > .005)
    {
        lg = *ng;
        *ng = .5 * (lg + (n / lg));
    }
}
void main()
{
    
}