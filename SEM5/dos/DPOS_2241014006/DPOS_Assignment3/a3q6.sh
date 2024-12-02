#!/bin/bash

echo "Enter a year (leave blank to use the current year):"
read year

if [ -z "$year" ]
then
  year=$(date +%Y)
fi

if [ $year -gt 0 ]; then
  if (( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ))
  then
    echo "$year is a leap year."
  else
    echo "$year is not a leap year."
  fi
else
  echo "Please enter a valid positive year."
fi

