#!/bin/bash
#gross salry calculation 

echo "Enter Ramesh's basic salary:"
read basic_salary

dearness_allowance=`echo "$basic_salary * 0.40" | bc`
house_rent_allowance=`echo "$basic_salary * 0.20" | bc`
gross_salary=`echo "$basic_salary + $dearness_allowance + $house_rent_allowance" | bc`

echo "Ramesh's gross salary is: $gross_salary"
#end




