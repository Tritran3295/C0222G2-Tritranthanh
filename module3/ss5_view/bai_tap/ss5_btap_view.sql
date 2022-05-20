-- drop database ss5_bai_tap;
create database ss5_bai_tap;
use ss5_bai_Tap;
create table product_control(
id_product int auto_increment primary key ,
code_product varchar(255),
name_product varchar(255),
price_product double,
amount_product int,
ability_product varchar (255)
);
insert into product_control -- (id_product,code_product,name_product,price_product,amount_product,ability_product) 
value (1,'CH101','Iphone',10000,5,'chính hãng'),
(2,'CH102','SamSung',9000,5,'chính hãng'),
(3,'CK101','Iphone',5000,5,'second hand'),
(4,'CK102','SamSung',4000,5,'second hand');

-- task 1
explain select * from product_control;

create unique index unique_index on product_control(code_product);

create index composite_index on product_control(name_product,price_product);

explain select * from product_control
where code_product = 10;

-- task 2:
 create view view_product_control as 
 select code_product,name_product,price_product,ability_product;
 
 set sql_safe_update = 0;
 update view_product
 set name_product = 'huawei'
 where code_product = 0;
 set sql_safe_update = 1;
 
 delete from view_product
 where code_product =0;
 
 drop view view_product;
 
 -- cau 3:
 
