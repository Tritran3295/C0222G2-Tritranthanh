 drop database db_all_case_study_module3;
create database db_all_case_study_module3;
use db_all_case_study_module3;
create table position (
position_id int auto_increment primary key,
position_name varchar(45),
status bit(1) default 0
);
create table education_degree (
education_degree_id int auto_increment primary key,
education_degree_name varchar(45),
status bit(1) default 0

);
create table division(
division_id int auto_increment primary key,
division_name varchar(45),
status bit(1) default 0
);
 create table `user` (
 user_name varchar(255) primary key,
password varchar(255),
status bit(1) default 0
 );
 create table `role` (
 role_id int auto_increment primary key,
 role_name varchar(255),
 status bit(1) default 0
 );
 create table user_role (
 role_id int,
 user_name varchar(255),
 foreign key(role_id) references `role`(role_id),
 foreign key(user_name) references `user`(user_name),
 status bit(1) default 0
 );
create table employee (
employee_id int auto_increment primary key,
employee_name varchar(45),
employee_birthday varchar(45),
employee_id_card varchar(45),
employee_salary double,
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int,
education_degree_id int,
division_id int,
 user_name varchar(255),
 status bit(1) default 0,
foreign key(position_id) references position (position_id),
foreign key(education_degree_id) references education_degree (education_degree_id),
foreign key(division_id) references division (division_id),
foreign key(user_name) references `user` (user_name)
);

create table customer_type(
customer_type_id int auto_increment primary key,
customer_tpye_name varchar(45),
status bit(1) default 0
);
create table customer(
customer_id int auto_increment primary key,
customer_name varchar(45),
customer_birthday varchar(45),
customer_gender int,
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45),
customer_type_id int,
status bit(1) default 0,
foreign key(customer_type_id) references customer_type (customer_type_id)
);
create table service_type(
service_type_id int auto_increment primary key,
service_type_name varchar(45),
status bit(1) default 0
);
create table rent_type(
rent_type_id int auto_increment primary key,
rent_type_name varchar(45),
rent_type_cost double,
status bit(1) default 0
);
create table service (
service_id int auto_increment primary key,
service_name varchar(45),
service_area int,
service_cost double,
service_max_people int,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors int,
rent_type_id int,
service_type_id int,
status bit(1) default 0,
foreign key(rent_type_id) references rent_type(rent_type_id),
foreign key(service_type_id) references service_type(service_type_id)

);
create table attach_service(
attach_service_id int auto_increment primary key,
attach_service_name varchar(45),
attach_service_cost double,
attach_service_unit int,
attach_service_status varchar(45),
status bit(1) default 0
);
create table contract (
contract_id int auto_increment primary key,
contract_start_date varchar(45),
contract_end_date varchar(45),
contract_deposit double,
contract_total_money double,
employee_id int,
customer_id int,
service_id int,
status bit(1) default 0,
foreign key(employee_id) references employee(employee_id),
foreign key(customer_id) references customer(customer_id),
foreign key(service_id) references service(service_id)
);
create table contract_detail (
contract_detail_id int auto_increment primary key,
quantity int,
contract_id int,
attach_service_id int,
status bit(1) default 0,
foreign key(contract_id) references contract(contract_id),
foreign key(attach_service_id) references attach_service(attach_service_id)
);
insert into customer_type value 
(1,'Diamond',0),
(2,'Platinium',0),
(3,'Gold',0),
(4,'Silver',0),
(5,'Member',0);
insert into customer(customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id) value
('Taì','01/01/2011',1,'123213213','21321321321','Taismile9x@gmail.com','Đà Nẵng',2),
('Phúc','01/01/2011',0,'123213213','21321321321','Taismile9x@gmail.com','Đà Nẵng',3);
insert into education_degree value
(1,'Trung Cấp',0),
(2,'Cao Đẳng',0),
(3,'Đại Học',0),
(4,'Sau Đại Học',0);
insert into position value
(1,'Lễ Tân',0),
(2,'Phục Vụ',0),
(3,'Chuyên Viên',0),
(4,'Giám Sát',0),
(5,'Quản Lý',0),
(6,'Giám Đốc',0);
insert into division value 
(1,'Sale-Marketing',0),
(2,'Hành Chính',0),
(3,'Phục Vụ',0),
(4,'Quản Lý',0);
insert into user value 
('1123','123123',0),
('1124','123123',0);
insert into employee(employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id,user_name) value
('Lê Thị Tài','01/01/1997','1212121',12121.21,'2121311','lethitai@gmail.com','Quảng Trị',2,3,4,'1123'),
('Lê Thị Tài','01/01/1997','1212121',12121.21,'2121311','lethitai@gmail.com','Quảng Trị',2,3,4,'1124');