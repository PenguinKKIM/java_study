CREATE TABLE goods(
	CODE VARCHAR(20) PRIMARY KEY,
	NAME VARCHAR(100) NOT NULL,
	price INT,
	stock INT,
	category VARCHAR(100)
);

CREATE TABLE `ORDER`(
	NO INT PRIMARY KEY,
	customer VARCHAR(100) NOT NULL,
	productCode VARCHAR(20) REFERENCES goods(CODE),
	amount INT,
	isCanceled TINYINT
);

select count(*), SUM(o.amount*g.price) 
from `order` o join goods g ON o.productCode=g.CODE 
where customer='홍길동' and isCanceled=1;

SELECT * FROM `order`;

DELETE FROM goods;
DELETE FROM `order`;