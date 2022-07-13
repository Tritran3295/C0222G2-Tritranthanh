drop database management_house;
create database management_house;
use management_house;
create table ma_ho_khau
(id_ho_khau int auto_increment primary key,
ten_ho_khau varchar (255)
);
create table family
(
id int auto_increment primary key,
cmnd varchar(255),
ngay_sinh varchar(255),
ten_chu_ho varchar(255),
so_luong_thanh_vien int,
ngay_lap_ho_khau varchar(255),
dia_chi varchar(255),
id_ho_khau int,
foreign key(id_ho_khau) references ma_ho_khau(id_ho_khau)
);
insert into ma_ho_khau value
(1,'HK_001'),
(2,'HK_112'),
(3,'HK_223'),
(4,'HK_444');
insert into family(cmnd,ngay_sinh,ten_chu_ho,so_luong_thanh_vien,ngay_lap_ho_khau,dia_chi,id_ho_khau) value
('1112121','07/09/1996','Nguyễn Văn A',4,'10/10/2010','Đà nẵng',1),
('1112112','07/10/1994','Nguyễn Văn B',6,'10/10/2018','Đà nẵng',2),
('1112133','07/01/1992','Nguyễn Văn C',7,'10/10/2019','Đà nẵng',3);