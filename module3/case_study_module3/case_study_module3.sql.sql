
create database case_study_module3;
use case_study_module3;
create table vi_tri(
id int,
name varchar(50)
);
insert into vi_tri
value (1,'Quản lý'),(2,'Nhân viên');
create table trinh_do(
ma_trinh_do int,
ten_trinh_do varchar(50)
);
insert into trinh_do
value (1,'Trung Cấp'),(2,'Cao Đẳng'),(3,'Đại Học'),(4,'Sau Đại Học');
create table bo_phan(
ma_bo_phan int,
ten_bo_phan varchar(50)
);
insert into bo_phan
value(1,'Sale-Marketing'),(2,'Hành Chính'),(3,'Phục vụ'),(4,'Quản lý');

