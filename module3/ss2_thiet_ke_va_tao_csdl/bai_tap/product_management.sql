create database product_management;
use product_management;
create table customer(
customer_id int auto_increment primary key,
customer_name varchar(45),
customer_age int
);
create table order_list (
order_id int auto_increment primary key,
order_date date,
order_total_price double,
customer_id int,
foreign key(customer_id) references customer(customer_id)
);
create table product(
product_id int auto_increment primary key,
product_name varchar(45),
product_price double);
create table order_detail(
odQTY int auto_increment primary key,
order_id int,
product_id int,
foreign key (order_id) references order_list(order_id),
foreign key (product_id) references product(product_id));