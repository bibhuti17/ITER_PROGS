#include <iostream>
using namespace std;

class Distance
{
private:
   int km;
   int m;
   int cm;

public:
   void input_distance(int kilometers, int meters, int centimeters)
   {
      km = kilometers;
      m = meters;
      cm = centimeters;

      // Normalize the values
      m += cm / 100;
      cm = cm % 100;

      km += m / 1000;
      m = m % 1000;
   }

   void display()
   {
      cout << km << " kilometers, " << m << " meters, " << cm << " centimeters" << endl;
   }

   static Distance add_distance(const Distance &d1, const Distance &d2)
   {
      Distance sum;
      
      sum.cm = d1.cm + d2.cm;
      sum.m = d1.m + d2.m;
      sum.km = d1.km + d2.km;

      // Normalize centimeters to meters (100 cm = 1 m)
      if (sum.cm >= 100)
      {
         sum.m += sum.cm / 100;
         sum.cm %= 100;
      }
      // Normalize meters to kilometers (1000 m = 1 km)
      if (sum.m >= 1000)
      {
         sum.km += sum.m / 1000;
         sum.m %= 1000;
      }

      return sum;
   }
};

int main()
{
   int n;
   cout << "Enter the number of distances: ";
   cin >> n;

   Distance *distances = new Distance[n];

   for (int i = 0; i < n; i++)
   {
      int km, m, cm;
      cout << "\nEnter distance " << i + 1 << ":" << endl;
      cout << "Kilometers: ";
      cin >> km;
      cout << "Meters: ";
      cin >> m;
      cout << "Centimeters: ";
      cin >> cm;

      distances[i].input_distance(km, m, cm);
   }

   // Display all distances
   cout << "\nAll distances:" << endl;
   for (int i = 0; i < n; i++)
   {
      cout << "Distance " << i + 1 << ": ";
      distances[i].display();
   }

   // Add two distances
   int index1, index2;
   cout << "\nEnter indices of two distances to add (1 to " << n << "): ";
   cin >> index1 >> index2;

   // Adjust indices to 0-based
   index1--;
   index2--;

   if (index1 >= 0 && index1 < n && index2 >= 0 && index2 < n)
   {
      Distance sum = distances[index1].add_distance(distances[index2]);
      cout << "\nSum of distances " << index1 + 1 << " and " << index2 + 1 << " is: ";
      sum.display();
   }
   else
   {
      cout << "Invalid indices!" << endl;
   }

   delete[] distances;
   return 0;
}
