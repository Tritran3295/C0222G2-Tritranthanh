-- drop database swap_erd;
create database swap_erd;
use swap_erd;
create table phieu_xuat(
SoPX int auto_increment primary key,
 NgayXuat date
);
create table phieu_nhap(
SoPN int auto_increment primary key,
NgayNhap date
);
create table nha_cung_cap(
ma_nha_cung_cap varchar(255) primary key,
ten_nha_cung_cap varchar(255),
dia_chi varchar(255)
);
create table don_dh (
SoDH int auto_increment primary key,
NgayDH date,
ma_nha_cung_cap varchar(255),
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);
create table vat_tu(
ma_vat_tu int auto_increment primary key,
ten_vat_tu varchar(255));

create table chi_tiet_phieu_xuat (
don_gia_xuat double,
so_luong_xuat varchar(255),
SoPX int,
ma_vat_tu int,
foreign key(SoPX) references phieu_xuat(SoPX),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu));
create table chi_tiet_phieu_nhap(
don_gia_nhap double,
so_luong_nhap varchar(255),
ma_vat_tu int,
SoPN int,
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(SoPN) references phieu_nhap(SoPN));
create table chi_tiet_don_dat_hang(
ma_vat_tu int,
SoDH int,
primary key(ma_vat_tu,SoDH),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(SoDH) references don_dh(SoDH));
create table so_dien_thoai(
so_dien_thoai_ncc varchar(11) primary key,
ma_nha_cung_cap varchar(255),
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);