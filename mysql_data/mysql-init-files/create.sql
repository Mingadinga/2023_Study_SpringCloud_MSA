-- CREATE DATABASE mydb;
USE mydb;

create table orders (
    id int auto_increment primary key,
    product_id varchar(20) not null,
    qty int default 0,
    unit_price int default 0,
    total_price int default 0,
    user_id varchar(50) not null,
    order_id varchar(50) not null,
    created_at datetime default NOW()
);
