 drop database if exists ss5_bai_tap;
create database ss5_bai_tap;
use ss5_bai_Tap;
create table product_control(
id_product int auto_increment primary key ,
code_product varchar(255),
name_product varchar(255),
price_product bigint,
amount_product int,
`description` varchar (255),
status bit(1) default 0
);
insert into product_control (code_product,name_product,price_product,amount_product,`description`,status)
value ('CH101','Iphone',10000,5,'chính hãng',0),
('CH102','SamSung',9000,5,'chính hãng',0),
('CK101','Iphone',5000,5,'second hand',0),
('CK102','SamSung',4000,5,'second hand',0);

-- task 1
explain select * from product_control;

create unique index unique_index on product_control(code_product);

create index composite_index on product_control(name_product,price_product);

explain select * from product_control
where code_product = 4;

-- task 2:
 create view view_product_control as 
 select code_product,name_product,price_product,status from product_control;
 
 -- update
 set sql_safe_updates = 0;
 update product_control
 set name_product = 'huawei'
 where code_product = 'CH101';
 set sql_safe_updates = 1;
 
 -- delete:
 drop view product_control;
 
 -- cau 3:
 -- Tạo procedure
 DELIMITER //
 create procedure getProduct()
 begin
		select * from product
        where status = 0;
end //
DELIMITER ;
call getProduct() ;

-- thêm 1 sản phẩm mới :

DELIMITER //
create procedure add_new_product(code_product varchar(255),name_product varchar(255),price_product double,amount_product int,`description` varchar (255))
  begin
    INSERT INTO product_control (code_product,name_product,price_product,amount_product,`description`)
    value (code_product,name_product,price_product,amount_product,`description`);
  end //
DELIMITER ;
call addadd_new_productadd_new_product_new_product('CH109','Laptop',150000,5,'ádsad');

-- sửa 1 sản phẩm
set sql_safe_updates = 0;
DELIMITER //
create procedure edit_product_by_id(id int,`name` varchar(255))
begin 
	update product_control
    set name_product = `name`
    where id_product = id;
    end//
DELIMITER ;
call edit_product_by_id(2,'hasagi');
set sql_safe_updates = 1;

-- xoá theo id:

DELIMITER //
create procedure delete_product_by_id(id int)
begin
	update product_control
    set status = 1
    where id_product = id;
end//
DELIMITER ;
call delete_product_by_id(1);
    
    drop procedure delete_product_by_id;

	
 
 
 
