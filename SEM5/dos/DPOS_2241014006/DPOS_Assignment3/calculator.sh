#!/bin/bash

#Give input along with command
# Check for 3- arguments 
if [ $# -ne 3 ]
then
  echo "Invalid input"
  echo "Enter input in the following format:"
  echo "op1 operator op2"
  exit 1
fi


op1=$1
operator=$2
op2=$3

# Perform the arithmetic operation
case $operator in
  +)
    result=$(echo "$op1 + $op2" | bc)
    echo "$op1 + $op2 = $result"
    ;;
  -)
    result=$(echo "$op1 - $op2" | bc)
    echo "$op1 - $op2 = $result"
    ;;
  x)
    result=$(echo "$op1 * $op2" | bc)
    echo "$op1 x $op2 = $result"
    ;;
  /)
    result=$(echo "$op1 / $op2" | bc)
    echo "$op1 / $op2 = $result"
    ;;
  %)
    result=$(echo "$op1 % $op2" | bc)
    echo "$op1 % $op2 = $result"
    ;;
  ^)
    result=$(echo "$op1 ^ $op2" | bc)
    echo "$op1 ^ $op2 = $result"
    ;;
  *)
    echo "Invalid input"
    echo "Enter input in the following format:"
    echo "op1 operator op2"
    ;;
esac
#end
