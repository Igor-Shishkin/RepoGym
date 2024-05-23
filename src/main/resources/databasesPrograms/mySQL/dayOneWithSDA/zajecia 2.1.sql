select * from mysql.user;

select User, Select_priv from mysql.user;

select * from mysql.db

create user andrzej

select * from mysql.tables_priv

Grant all privileges ON testowa_baza.* to andrzej;
flush privileges;

show grants for andrzej;

#
CREATE TABLE Products(
	productId int AUTO_INCREMENT PRIMARY KEY,
    productName varchar(255) UNIQUE,
	price DECIMAL(10,2)
);

CREATE TABLE Orders(
	orderId int AUTO_INCREMENT PRIMARY KEY,
    orderDate date,
    totalAmount DECIMAL(10,2) ,
	productId int,
	FOREIGN KEY (productId) REFERENCES Products(productId)
);

INSERT INTO Products (productName, price) VALUES
('Koszulka', 39.99),
('Spodnie', 68.99),
('Buty', 119.99);

INSERT INTO Orders (orderDate, totalAmount, productId) VALUES
('2023-07-01', 40, 1),
('2023-08-02', 70, 2),
('2023-09-05', 120, 3),
('2023-10-07', 80, 2),
('2023-11-01', 140, 1);

SELECT * FROM Orders;

SELECT * FROM Products;

SELECT orderDate, totalAmount FROM Orders;

SELECT productName from Products;

SELECT * FROM Orders AS o
join Products AS p ON o.productId = p.productId;

SELECT orderDate as Data_zamowienia, totalAmount, productName FROM Orders AS o
join Products AS p ON o.productId = p.productId;

SELECT * FROM Orders AS o
join Products AS p ON o.productId = p.productId;

INSERT INTO Products (productName, price) VALUES
('Koszulka Adidas', 57);

INSERT INTO Orders (orderDate, totalAmount, productId) VALUES
('2023-12-24', 50, null)