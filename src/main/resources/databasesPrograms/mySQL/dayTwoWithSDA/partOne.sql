#netstat -aon

#services.msc

show index from categories;
​
CREATE INDEX idx_categoryName ON CATEGORIES(CategoryName);
​
DROP INDEX idx_categoryName on categories;
​
SELECT * FROM employees;
​
SELECT MIN(BirthDate) AS oldest_employee FROM employees;
​
SELECT LastName, BirthDate AS youngest_employee FROM employees
order by birthDate DESC
LIMIT 1;
​
SELECT LastName, BirthDate FROM employees
where birthDate = (Select MIN(BirthDate) from employees);
​
SELECT AVG(price) AS avg_price FROM products;
​
SELECT COUNT(ProductId) AS amount_of_products FROM products;
​
SELECT SUM(price) AS sum_price FROM products;
​
#ILOŚĆ ZAMÓWIEŃ DLA KAŻDEGO KLIENTA
SELECT c.CompanyName, COUNT(o.OrderId) AS NumberOfOrders FROM orders AS o
JOIN customers AS c ON o.CustomerID = c.CustomerID
GROUP BY c.CompanyName;
​
#Średnia cena produktu w każdej kategorii
SELECT c.CategoryName, AVG(p.price) as avgProductPrice FROM products as p
JOIN categories as c on p.CategoryID = c.CategoryID
GROUP BY c.CategoryName;
​
#ILOŚĆ zamówień dla każdego kraju klienta:
SELECT c.country, count(o.orderId) as numberOfOrders FROM Orders as o
JOIN Customers as c ON o.CustomerID = c.CustomerID
GROUP BY c.country
ORDER BY numberOfOrders DESC;
​
#Ile wydali klienci z poszczególnych krajów
SELECT c.country, sum(p.price) AS pricePerCountry FROM Customers as c
JOIN Orders as o ON o.CustomerID = c.CustomerID
JOIN OrderDetails as od ON od.OrderId = o.OrderId
JOIN Products as p ON p.ProductId = od.ProductId
GROUP BY c.country
ORDER BY pricePerCountry DESC;
​
#Posortować zamówienia po datach
SELECT * FROM Orders
Order by OrderDate ASC LIMIT 5
​
SELECT * FROM Products
WHERE ProductName = 'Ikura'
​
SELECT CompanyName, Address FROM Customers
WHERE country = 'Germany' OR country = 'UK'
​
SELECT CompanyName, Address FROM Customers
WHERE country = 'Germany' AND city = 'Berlin'
​
SELECT CompanyName, Address FROM Customers
WHERE NOT country = 'Germany'
​
SELECT CompanyName, Address FROM Customers
WHERE country = 'UK' AND (city = 'London' OR city = 'Cowes')
​
SELECT CompanyName, Address, Country FROM Customers
WHERE country LIKE 'U_A'
​
SELECT c.country, sum(p.price) AS pricePerCountry FROM Customers as c
JOIN Orders as o ON o.CustomerID = c.CustomerID
JOIN OrderDetails as od ON od.OrderId = o.OrderId
JOIN Products as p ON p.ProductId = od.ProductId
GROUP BY c.country
HAVING pricePerCountry > 1000
ORDER BY pricePerCountry DESC;
​
#Kategorie z największym obrotem:
SELECT categoryName, SUM(p.price * od.quantity) as max_Sum_price from Categories as c
JOIN Products as p ON p.CategoryId = c.CategoryId
JOIN OrderDetails as od ON od.ProductId = p.ProductId
GROUP BY categoryName