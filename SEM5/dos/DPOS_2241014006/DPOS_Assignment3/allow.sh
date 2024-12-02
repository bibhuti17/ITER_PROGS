#!/bin/bash

echo "Enter your internal marks:"
read marks

echo "Enter your attendance percentage:"
read attendance

if [ $marks -ge 20 ] && [ $attendance -ge 75 ]
then
  echo "Allowed for DOPS end sem"
else
  echo "Not allowed"
fi

