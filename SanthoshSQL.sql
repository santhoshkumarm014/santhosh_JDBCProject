create database Santhosh;
use Santhosh;
create table Login(username varchar(20), password varchar(20));
insert into Login values('santhosh','kumar');
select*from Login;
select*from Product;
insert into  Product values(14,'Book',200,500,20);

create table Product(product int,productname varchar(20),minsell int,price int,quantity int);

