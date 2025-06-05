# assignment5

A1

select name, phone_no, cust_no from customer
where cust_no = (select cust_no from depositor where account_no='A0004');

![image.png](image.png)

A2

select name from customer
where cust_no not in
(select cust_no from loan);

![image.png](image%201.png)

A3

select account_no, balance from account
where account_no = (select account_no from depositor where cust_no='C0010');

![image.png](image%202.png)

A4

select branch_city from branch where branch_code = (select branch_code from loan where cust_no = (select cust_no from customer where name='ASLESHA TIWARI'));

![image.png](image%203.png)

A5

```sql
select * from installment 
where loan_no in 
(select loan_no from loan where cust_no in 
(select cust_no from customer where name='ANKITA SINGH'));
```

![image.png](image%204.png)

A6

```sql
select branch_name, branch_city from branch
where branch_code in (select branch_code from account where account_no in (select account_no from depositor where cust_no in (select cust_no from customer where name='ABHIJIT MISHRA')));

```

![image.png](image%205.png)

A7

```sql
	create table account_type(
	account_no varchar2(5) check(account_no like 'A%') primary key,
	type varchar2(2) check(type in ('SB','FD','CA')));
```

![image.png](image%206.png)

A8

```sql
insert into account_type
(select account_no, type from account where balance < 50000);

```

![image.png](image%207.png)

A9

```sql
 update account_type set type='FD' 
 where Account_no=(select account_no from depositor where cust_no='C0007');
```

![image.png](image%208.png)

A10

```sql
 delete from account_type where account_no in
 (select account_no from account where balance < 20000);
```

![image.png](image%209.png)

A11

```sql
select account_no from account
where balance > any(select balance from account where type='FD');
```

![image.png](image%2010.png)

A12

```sql
select account_no from account 
where balance > all(select balance from account where type='FD');
```

![image.png](image%2011.png)

A13

```sql
select * from branch B
where exists (select * from loan L where L.branch_code = B.branch_code);

```

A14

```sql
select * from loan L
where not exists (select * from installment I 
where I.loan_no = L.loan_no);
select * from loan L
where not exists (select * from installment I 
where inst_no = 1 and L.loan_no = I.loan_no);
```

A15

```sql
update account
  set balance =
             (
                     case when balance > 80000
                     then
                             balance+0.06*balance
                     else
                             balance+0.05*balance
                    end
             );
```

![image.png](image%2012.png)

```jsx
1)
	select L.loan_no from loan L
	join branch B on L.branch_code = B.branch_code
	where B.branch_city = 'Mumbai';

2)
	select A.type from account A
	join branch B on A.branch_code = B.branch_code
	where B.branch_city='Delhi';

3)
	select C.name, C.phone_no from customer C
	join depositor D on C.cust_no = D.cust_no
	join account A on A.account_no = D.account_no
	where A.balance > 100000;

4)
   select I.inst_no, I.inst_amount from installment I
   join loan L on L.loan_no = I.loan_no
   join customer C on C.cust_no = L.cust_no
   where C.name='RAJ ANAND SINGH';

5)
   select distinct C.name from customer C
   join depositor D on D.cust_no = C.cust_no
   join account A on A.account_no = D.account_no
   where A.type!='SB';

6)
   select distinct C.name from customer C
   join loan L on L.cust_no = C.cust_no
   join installment I on I.loan_no = L.loan_no
   where I.inst_amount >= 50000;

7)
   select C.phone_no from customer C
   join depositor D on D.cust_no = C.cust_no
   join account A on A.account_no = D.account_no
   join branch B on B.branch_code = A.branch_code
   where B.branch_name='Saltlake Branch';

8)
   select B.branch_name, B.branch_city from branch B
   join account A on A.branch_code = B.branch_code
   join depositor D on D.account_no = A.account_no
   join customer C on C.cust_no = D.cust_no
   where C.name='ABHIJIT MISHRA';

9)
   select A.type, A.balance from account A
   join depositor D on D.account_no = A.account_no
   join customer C on C.cust_no = D.cust_no
   where C.name='SWAROOP RAY';

10)
   WITH BranchTotalBalance AS (
      select branch_code, sum(balance) TotalBalance
      from account group by branch_code
   ),
   AverageBranchBalance AS (
      select avg(TotalBalance) AvgBalance
      from BranchTotalBalance
   )
   select B.branch_code
   from BranchTotalBalance B, AverageBranchBalance A
   where B.TotalBalance > A.AvgBalance
```