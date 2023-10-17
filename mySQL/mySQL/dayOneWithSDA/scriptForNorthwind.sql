USE NORTHWIND;
​
#Join orders and customer
SELECT * FROM Orders as o
JOIN Customers as c on o.customerId = c.customerId;
​
#Join orders and customer EMployees i Shippers
SELECT * FROM Orders as o
JOIN Customers as c on o.customerId = c.customerId
JOIN employees as e on e.employeeId = o.employeeId
JOIN shippers as s on s.shipperId = o.shipperId;
​
#Join wszystkie tabele
SELECT * FROM Orders as o
JOIN Customers as c on o.customerId = c.customerId
JOIN employees as e on e.employeeId = o.employeeId
JOIN shippers as s on s.shipperId = o.shipperId
join orderdetails as od on od.orderId = o.orderId
join products as p on od.ProductID = p.ProductID
join suppliers as su on su.supplierId = p.SupplierId
join categories as ca on ca.categoryId = p.CategoryId