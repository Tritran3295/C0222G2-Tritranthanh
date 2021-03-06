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
service_free varchar(255),
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
('Ta??','01/01/2011',1,'123213213','21321321321','Taismile9x@gmail.com','???? N???ng',2),
('Ta??','01/01/2011',1,'123213213','21321321321','Taismile9x@gmail.com',' Qu???ng Tr???',2),
('Ph??c','01/01/2011',0,'123213213','21321321321','Taismile9x@gmail.com','???? N???ng',3);
insert into education_degree value
(1,'Trung C???p',0),
(2,'Cao ?????ng',0),
(3,'?????i H???c',0),
(4,'Sau ?????i H???c',0);
insert into position value
(1,'L??? T??n',0),
(2,'Ph???c V???',0),
(3,'Chuy??n Vi??n',0),
(4,'Gi??m S??t',0),
(5,'Qu???n L??',0),
(6,'Gi??m ?????c',0);
insert into division value 
(1,'Sale-Marketing',0),
(2,'H??nh Ch??nh',0),
(3,'Ph???c V???',0),
(4,'Qu???n L??',0);
insert into user value 
('1123','123123',0),
('1124','123123',0);
insert into employee(employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id,user_name) value
('L?? Th??? T??i','01/01/1997','1212121',12121.21,'2121311','lethitai@gmail.com','Qu???ng Tr???',2,3,4,'1123'),
('L?? Th??? T??i','01/01/1997','1212121',12121.21,'2121311','lethitai@gmail.com','Qu???ng Tr???',2,3,4,'1124');
insert into service_type value
(1,'Villa',0),
(2,'House',0),
(3,'Room',0);
insert into rent_type value
(1,'year',0),
(2,'month',0),
(3,'day',0),
(4,'hour',0);
insert into service(service_name,service_area,service_cost,service_max_people,standard_room,description_other_convenience,pool_area,number_of_floors,service_free,rent_type_id,service_type_id) 
value
('Villa Beach Front','25000',10000000,10,'Vip','C?? h??? b??i',500,4,'Buffe bu???i s??ng',3,1),
('House Princess 01 ','1400',5000000,7,'Vip','C?? th??m b???p n?????ng',null,3,'Ch???y b??? mi???n ph??',2,2),
('Room Twin 01','5000',1000000,2,'normal','C?? tivi',null,null,'U???ng n?????c free',4,3);
