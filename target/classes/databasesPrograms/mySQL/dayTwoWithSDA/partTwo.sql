select CompanyName from customers;

select CustomerID, Count(OrderID) AS number_of_orders from orders
group by CustomerID
having number_of_orders > 5;

select CustomerID, Count(OrderID) AS number_of_orders from orders
group by CustomerID
having number_of_orders > 5;

select CustomerID, CompanyName from customers
WHERE CustomerID IN 
(select CustomerID from orders
group by CustomerID
having Count(OrderID) > 5);



SELECT CompanyName, COUNT(OrderID) AS amoutn_of_orders from customers AS c
JOIN orders AS o ON c.CustomerID = o.CustomerID
GROUP BY c.CompanyName
HAVING amoutn_of_orders > 5;

SELECT * FROM customers
WHERE country IN ('USA', 'UK', 'Canada');

SELECT * FROM products
WHERE price BETWEEN 22 AND 30;

SELECT * FROM products 
WHERE ProductName BETWEEN 'A%' AND 'C%';








