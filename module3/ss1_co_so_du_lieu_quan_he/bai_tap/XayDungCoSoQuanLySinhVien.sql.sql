create database student_management;
use student_management;
create table teacher_management(
name_teacher int primary key,
name varchar(45),
age int,
country varchar(45)
);
insert into teacher_management value(1,"Nguyễn Văn A",40,"Việt Nam");

create table student_management(
name_student int primary key,
name varchar(45),
age int,
country varchar(45)
);
insert into student_management value(1,"Nguyễn Văn B",18,"Việt Nam");

create table class(
id int primary key,
name varchar(45),
name_teacher int,
name_student int,
foreign key(name_teacher) references teacher_management(name_teacher),
foreign key(name_student) references student_management(name_student)

);
