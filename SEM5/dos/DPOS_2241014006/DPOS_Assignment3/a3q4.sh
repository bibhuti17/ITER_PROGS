#sum of digits of a five digit number

echo 'Enter a five digit number!'
read a

sum=0

while [ $a != 0 ]
do
	rem=`expr $a % 10`
	sum=`expr $rem + $sum`
	a=`expr $a / 10`
done

echo 'sum of digits is: ' $sum

#the end

