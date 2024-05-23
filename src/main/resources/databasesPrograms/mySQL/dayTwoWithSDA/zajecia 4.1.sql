USE northwind;

#Znajdz wszystkich klientów, którzy zrobili więcej niż 5 zamówień
SELECT CompanyName FROM customers;

SELECT customerId, Count(orderId) as numberOfOrders FROM Orders
group by customerId
HAVING numberOfOrders > 5;

SELECT customerId, CompanyName FROM customers
WHERE customerId IN
(SELECT customerId FROM Orders
group by customerId
HAVING Count(orderId) > 5);

#JOIN
SELECT c.CompanyName, count(o.orderId) as ilosc_zamowien FROM customers as c
join Orders as o ON c.customerId = o.customerId
group by c.CompanyName
having ilosc_zamowien > 5;

SELECT * FROM customers
where country IN ('USA','UK','Canada');

SELECT * FROM products 
where price between 22 AND 30;

SELECT * FROM products 
where productName between 'A%' AND 'C%'