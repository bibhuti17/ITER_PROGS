#!/bin/bash

echo "Enter the cost price of the item:"
read cost_price

echo "Enter the selling price of the item:"
read selling_price

if [ `echo "$selling_price > $cost_price" | bc` -eq 1 ]
then
	profit=$(echo "$selling_price - $cost_price" | bc)
  echo "The seller has made a profit of: $profit"
elif [ `echo "$selling_price < $cost_price" | bc` -eq 1 ]
then
  loss=$(echo "$cost_price - $selling_price" | bc)
  echo "The seller has incurred a loss of: $loss"
else
  echo "There is no profit or loss."
fi
#end
