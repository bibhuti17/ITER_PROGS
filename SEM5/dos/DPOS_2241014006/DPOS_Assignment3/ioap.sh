#integer aritmatic
echo Enter the first number!
read a
echo Enter the second number!
read b

echo 'sum : ' `expr $a + $b`
echo 'difference : ' `expr $a - $b`
echo 'product : ' `expr $a \* $b`
echo 'quotient : ' `expr $a / $b`
echo 'remainder : ' `expr $a % $b`
#end
