CREATE TABLE Orders(
	orderID int auto_increment primary key,
    orderDate date,
    totalAmount Decimal(10,2),
    productId int,
    FOREIGN KEY (productId) REFERENCES Products(productID)
);

CREATE TABLE Products(
	productID int auto_increment primary key,
    productName varchar(255),
    price decimal(10,2)
);



INSERT INTO Products (productName, price) VALUES
('T-shirt', 39.99),
('Bread', 3.59),
('Car', 3239.99);

INSERT INTO Orders (orderDate, totalAmount, productId) VALUES
('2023-06-23', 34, 2),
('2023-06-3', 3, 2),
('2023-06-13', 7, 3),
('2023-06-30', 100, 1);

Select * from orders;

Select * from products;

select orderDate, totalAmount from orders;

select orderDate AS data_zamowienia, productName, totalAmount from Orders AS o
join products AS p on o.productId = p.productID;


INSERT INTO Products (productName, price) VALUES
('Tree', 101);

INSERT INTO Orders (orderDate, totalAmount, productId) VALUES
('2023-07-1', 1, null);


select * from Orders AS o
left join products AS p on o.productId = p.productID;

select orderDate AS data_zamowienia, productName, totalAmount from Orders AS o
right join products AS p on o.productId = p.productID;






