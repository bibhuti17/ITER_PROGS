#floating point number aritmatic

echo Enter the first number!
read a
echo Enter the second number!
read b

sum=`echo $a + $b | bc`
echo Sum: $sum
diff=`echo $a - $b | bc`
echo Difference: $diff
product=`echo $a \* $b | bc`
echo Product: $product
quotient=`echo $a / $b | bc`
echo Quotient: $quotient
remainder=`echo $a % $b | bc`
echo Remainder: $remainder
#end
