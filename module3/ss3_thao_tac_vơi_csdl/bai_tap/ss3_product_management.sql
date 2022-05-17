 -- drop database ss3_product_csdl;
create database ss3_product_csdl;
use ss3_product_csdl;
create table customer(
customer_id int auto_increment primary key,
customer_name varchar(45),
customer_age int
);
create table order_list (
order_id int auto_increment primary key,
order_date date,
order_total_price varchar(45),
customer_id int,
foreign key(customer_id) references customer(customer_id)
);
create table product(
product_id int auto_increment primary key,
product_name varchar(45),
product_price double);
create table order_detail(
odQTY int,
order_id int,
product_id int,
foreign key (order_id) references order_list(order_id),
foreign key (product_id) references product(product_id));

insert into customer value
(1,'Minh Quan',10),(2,'Ngoc Oanh',20),(3,'Hong Ha',50);
insert into order_list value
(1,'2006/03/21',null,1),(2,'2006/03/23',null,2),(3,'2006/03/16',null,1);
insert into product value
(1,'May Giat',3),(2,'Tu Lanh',5),(3,'Dieu Hoa',7),(4,'Quat',1),(5,'Bep Dien',2);

insert into order_detail value
(3,1,1),(7,1,3),(2,1,4),(1,2,1),(8,3,1),(4,2,5),(3,2,3);
 select order_list.order_id,order_list.order_date,order_list.order_total_price from order_list;
 -- select customer.customer_name,product.product_name from order_detail
 -- left join customer on order_list.customer_id = customer.customer_id
 -- left join order_detail on order_detail.order_id = order_list.order_id
 -- left join product on product.product_id = order_detail.product_id;
 select order_list.order_id,order_list.order_date,sum(order_detail.odQTY * product.product_price)
 as 'gia_tien' from order_list
 inner join order_detail on order_detail.order_id = order_list.order_id
 inner join product on product.product_id=order_detail.product_id
 group by order_id;
 
 


