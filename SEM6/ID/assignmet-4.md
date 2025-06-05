# assignmet-4

table 1

create table customer(cust_no varchar2(5) check(cust_no like 'C%'), name varchar2(20) not null,phone_no number (10),city varchar2(9) not null,primary key (cust_no));

![image.png](image.png)

INSERT INTO customer (CUST_NO, NAME, PHONE_NO, CITY) VALUES ('C0001', 'RAJ ANAND SINGH', '9861258466', 'DELHI');
INSERT INTO customer (CUST_NO, NAME, PHONE_NO, CITY) VALUES ('C0002', 'ANKITA SINGH', '9879958651', 'BANGALORE');
INSERT INTO customer (CUST_NO, NAME, PHONE_NO, CITY) VALUES ('C0003', 'SOUMYA JHA', '9885623344', 'MUMBAI');
INSERT INTO customer (CUST_NO, NAME, PHONE_NO, CITY) VALUES ('C0004', 'ABHIJIT MISHRA', '9455845425', 'MUMBAI');
INSERT INTO customer (CUST_NO, NAME, PHONE_NO, CITY) VALUES ('C0005', 'YASH SARAF', '9665854585', 'KOLKATA');
INSERT INTO customer (CUST_NO, NAME, PHONE_NO, CITY) VALUES ('C0006', 'SWAROOP RAY', '9437855466', 'CHENNAI');
INSERT INTO customer (CUST_NO, NAME, PHONE_NO, CITY) VALUES ('C0007', 'SURYA NARAYAN', '9937955212', 'GURGAON');
INSERT INTO customer (CUST_NO, NAME, PHONE_NO, CITY) VALUES ('C0008', 'PRANAV PRAVEEN', '9336652441', 'PUNE');
INSERT INTO customer (CUST_NO, NAME, PHONE_NO, CITY) VALUES ('C0009', 'STUTI MISRA', '7870266534', 'DELHI');
INSERT INTO customer (CUST_NO, NAME, CITY) VALUES ('C0010', 'ASLESHA TIWARI', 'MUMBAI');

![image.png](image%201.png)

table 2

create table  branch (branch_code varchar2(4) check (branch_code like 'B%') primary key, branch_name varchar2(25) not null, branch_city varchar2(8) check (branch_city in ('Delhi', 'Mumbai','Kolkata', 'Chennai')));

![image.png](image%202.png)

insert into branch values ('B001', 'Janakpuri Branch', 'Delhi');
insert into branch values ('B002', 'Chandnichowk Branch', 'Delhi');
insert into branch values ('B003', 'Juhu Branch', 'Mumbai');
insert into branch values ('B004', 'Andheri Branch', 'Mumbai');
insert into branch values ('B005', 'Saltlake Branch', 'Kolkata');
insert into branch values ('B006', 'Srirampuram Branch', 'Chennai');

![image.png](image%203.png)

table 3

create table account (
 account_no varchar2(5) check(account_no like 'A%') primary key,
  type varchar2(2),
  balance number(7) check( balance < 10000000 ),
  branch_code varchar2(4) check(branch_code like 'B%'),
foreign key(branch_code) references branch(branch_code));                                            

![image.png](image%204.png)

insert into account values ('A0001', 'SB', 200000, 'B003');
insert into account values ('A0002', 'SB', 15000, 'B002');
insert into account values ('A0003', 'CA', 850000, 'B004');
insert into account values ('A0004', 'CA', 35000, 'B004');
insert into account values ('A0005', 'FD', 28500, 'B005');
insert into account values ('A0006', 'FD', 550000, 'B005');
insert into account values ('A0007', 'SB', 48000, 'B001');
insert into account values ('A0008', 'SB', 7200, 'B002');
insert into account values ('A0009', 'SB', 18750, 'B003');
insert into account values ('A0010', 'FD', 99000, 'B004');

![image.png](image%205.png)

table 4

create table depositor(
cust_no varchar2(5) check(cust_no like 'C%'),
account_no varchar2(5) check(account_no like 'A%'),
foreign key(cust_no) references customer(cust_no),
foreign key(account_no) references Account(account_no),
primary key(cust_no, account_no));

![image.png](image%206.png)

insert into depositor values ('C0003', 'A0001');
insert into depositor values ('C0004', 'A0001');
insert into depositor values ('C0004', 'A0002');
insert into depositor values ('C0006', 'A0003');
insert into depositor values ('C0006', 'A0004');
insert into depositor values ('C0001', 'A0005');
insert into depositor values ('C0002', 'A0005');
insert into depositor values ('C0010', 'A0006');
insert into depositor values ('C0009', 'A0007');
insert into depositor values ('C0008', 'A0008');
insert into depositor values ('C0007', 'A0009');
insert into depositor values ('C0006', 'A0010');

![image.png](image%207.png)

table 5

create table loan(
loan_no varchar2(5) check(loan_no like 'L%') primary key,
cust_no varchar2(5) check(cust_no like 'C%'),
amount number(10) check(amount > 1000),
branch_code varchar2(4) check(branch_code like 'B%'),
foreign key(branch_code) references Branch(branch_code),
foreign key(cust_no) references customer(cust_no));

![image.png](image%208.png)

insert into loan values ('L0001', 'C0005', 3000000, 'B006');
insert into loan values ('L0002', 'C0001', 50000, 'B005');
insert into loan values ('L0003', 'C0002', 8000000, 'B004');
insert into loan values ('L0004', 'C0010', 100000, 'B004');
insert into loan values ('L0005', 'C0009', 9500000, 'B005');
insert into loan values ('L0006', 'C0008', 25000, 'B006');

![image.png](image%209.png)

table 6

```sql
create table installment(
inst_no number(2) check(inst_no <= 10),
loan_no varchar2(5) check(loan_no like 'L%'),
inst_amount numeric(20) not null,
primary key(inst_no, loan_no),
foreign key(loan_no) references loan(loan_no));
```

![image.png](image%2010.png)

insert into installment values (1, 'L0005', 500000);
insert into installment values (1, 'L0002', 10000);
insert into installment values (1, 'L0003', 50000);
insert into installment values (1, 'L0004', 20000);
insert into installment values (2, 'L0005', 500000);
insert into installment values (1, 'L0006', 3000);
insert into installment values (2, 'L0002', 10000);
insert into installment values (3, 'L0002', 10000);
insert into installment values (2, 'L0003', 50000);
insert into installment values (2, 'L0004', 20000);

![image.png](image%2011.png)