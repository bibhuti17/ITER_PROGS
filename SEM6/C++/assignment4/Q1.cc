#include <iostream>
#include <cmath>
using namespace std;

class Polar
{
private:
    double radius;
    double angle;

public:
    Polar(double r, double a) : radius(r), angle(a) {}

    void toRectangular(double &x, double &y) const
    {
        x = radius * cos(angle);
        y = radius * sin(angle);
    }

    Polar rectangleToPolar(double x, double y) const
    {
        double radius = sqrt(x * x + y * y);
        double angle = atan2(y, x);
        return Polar(radius, angle);
    }

    Polar operator+(const Polar p) const
    {
        double x1, y1, x2, y2;
        toRectangular(x1, y1);
        p.toRectangular(x2, y2);
        double x = x1 + x2;
        double y = y1 + y2;
        return rectangleToPolar(x, y);
    }
    void display() const
    {
        cout << "Polar coordinates: (" << radius << ", " << angle << ")" << endl;
    }
};

double toRadians(double angle)
{
    return angle * (3.14 / 180);
}

int main()
{
    Polar p1(5, toRadians(30));
    double x, y;
    p1.toRectangular(x, y);
    Polar p2(10, toRadians(60));
    p2.toRectangular(x, y);
    Polar p3 = p1 + p2;
    p1.display();
    p2.display();
    p3.display();
}