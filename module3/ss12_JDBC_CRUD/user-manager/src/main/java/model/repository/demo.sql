drop database if exists demo;
create database demo;
use demo;
create table users(
id int(3) auto_increment primary key,
name varchar(450),
email varchar(450),
country varchar(450)
);
insert into users value(1,'Minh','minh@codegym.vn','Viet Nam'),(2,'Kante','kante@che.uk','Kenia');
select * from users