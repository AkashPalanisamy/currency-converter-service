create database if not exists `currency`;
use `currency`;

drop table if exists `exchangeValue`;

create table `exchangeValue`(
id int (10) not null,
currencyFrom varchar(10) not null,
currencyTo varchar(10) not null,
conversionRate varchar(20) not null,
servicePort int(5),
primary key(id)
);

-- Inserting some sample values to the database --

insert into `exchangeValue`(id,currencyFrom,currencyTo,conversionRate)
values
(10001,'USD','INR','73.23'),
(10002,'EUR','INR','89.03'),
(10003,'JPY','INR','0.67'),
(10004,'GBP','INR','103.30'),
(10005,'MYR','INR','17.82'),
(10006,'BTC','INR','3325237.36');