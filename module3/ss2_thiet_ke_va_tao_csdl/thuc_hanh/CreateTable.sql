-- drop database quan_ly_don_dat_hang;
create database QuanLyDiemThi;

use QuanLyDiemThi;
create table hoc_sinh
(ma_hoc_sinh VARCHAR(20) PRIMARY KEY,
ten_hoc_sinh VARCHAR(50),
ngay_sinh DATETIME,
lop VARCHAR(20),
gt VARCHAR(20)
);
create table mon_hoc
(ma_mon_hoc VARCHAR(20) PRIMARY KEY,
ten_mon_hoc VARCHAR(50));
create table bang_diem(
	ma_hoc_sinh VARCHAR(20),
    ma_mon_hoc VARCHAR(20),
    diem_thi INT,
    ngay_kiem_tra DATETIME,
    PRIMARY KEY (ma_hoc_sinh, ma_mon_hoc),
    FOREIGN KEY (ma_hoc_sinh) REFERENCES hoc_sinh(ma_hoc_sinh),
    FOREIGN KEY (ma_mon_hoc) REFERENCES mon_hoc(ma_mon_hoc));
    create table giao_vien
    (ma_giao_vien VARCHAR(20) PRIMARY KEY,
    ten_giao_vien VARCHAR(20),
    so_dien_thoai VARCHAR(10));
    alter table mon_hoc add ma_giao_vien varchar(20);
