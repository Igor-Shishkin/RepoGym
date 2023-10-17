-- Select all columns from products table
SELECT *
FROM manufacturing.products;


-- Select specific columns
SELECT name, manufacturing_cost
FROM manufacturing.products;


-- Filter the rows returned
SELECT name, manufacturing_cost, category_id
FROM manufacturing.products
WHERE category_id = 3;


-- Make sure your data types agree in the WHERE clause!
SELECT name, manufacturing_cost
FROM manufacturing.products
WHERE product_id = 'KE9W';


-- Use comparison operators < (less than) or > (greater than)
SELECT name, manufacturing_cost
FROM manufacturing.products
WHERE manufacturing_cost < 10;