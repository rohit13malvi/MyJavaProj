DDL:
CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(50),
salary DECIMAL(10, 2));
ALTER TABLE employees ADD COLUMN email VARCHAR(100);
DROP TABLE employees;
CREATE INDEX idx_employee_name ON employees (name);
DROP INDEX idx_employee_name;
Constraints include PRIMARY KEY, FOREIGN KEY, UNIQUE, NOT NULL,
and CHECK.
ALTER TABLE orders ADD CONSTRAINT fk_customer FOREIGN
KEY (customer_id) REFERENCES customers(id);
ALTER TABLE orders DROP CONSTRAINT fk_customer;
TRUNCATE TABLE table_name

DQL
SELECT CustomerName, City FROM Customers;
SELECT * FROM Customers WHERE Country='Mexico';
Operators used in WHERE are:
= : Equal
> : Greater than
< : Less than
>= : Greater than or equal
<= : Less than or equal
<> : Not equal
SELECT column1, column2, ... FROM table_name WHERE condition1 AND condition2 AND
condition3 ...;
SELECT column1, column2, ... FROM table_name WHERE condition1 OR condition2 OR
condition3 ...;
SELECT column1, column2, ... FROM table_name WHERE NOT condition;
Example:
SELECT * FROM Customers WHERE Country=’India’ AND City=’Japan’;
SELECT * FROM Customers WHERE Country=’America’ AND (City=’India’ OR
City=’Korea’);
SELECT DISTINCT column1, column2 FROM table_name;
- The percent sign (%) represents zero, one, or multiple characters
- The underscore sign (_) represents one, single character
Example: SELECT * FROM employees WHERE first_name LIKE 'J%';
WHERE CustomerName LIKE 'a%'
- Finds any values that start with "a"
WHERE CustomerName LIKE '%a'
- Finds any values that end with "a"
WHERE CustomerName LIKE '%or%'
- Finds any values that have "or" in any position
WHERE CustomerName LIKE '_r%'
- Finds any values that have "r" in the second position
WHERE CustomerName LIKE 'a_%'
- Finds any values that start with "a" and are at least 2 characters in length
WHERE CustomerName LIKE 'a__%'
- Finds any values that start with "a" and are at least 3 characters in length
WHERE ContactName LIKE 'a%o'
- Finds any values that start with "a" and ends with "o"
SELECT * FROM products WHERE category_id IN (1, 2, 3);
SELECT * FROM orders WHERE order_date BETWEEN '2023-01-01' AND
'2023-06-30';
SELECT * FROM customers WHERE email IS NULL;
SELECT first_name AS "First Name", last_name AS "Last Name" FROM
employees;
Syntax: SELECT column1, column2 FROM table_name ORDER BY column1
[ASC|DESC];
SELECT product_name, price FROM products ORDER BY price DESC;
SELECT first_name, last_name FROM employees ORDER BY last_name,
first_name;
SELECT product_name, price, price * 1.1 AS discounted_price FROM
products ORDER BY discounted_price;
 Example: SELECT column_name FROM table_name ORDER BY column_name
NULLS LAST;
SELECT column_name FROM table_name ORDER BY column_name
NULLS LAST;
Instead of specifying column names, you can sort by column positions in the ORDER
BY clause.
- Example: SELECT product_name, price FROM products ORDER BY 2 DESC, 1
ASC;
SELECT column1, aggregate_function(column2) FROM table_name
GROUP BY column1;
Aggregation Functions:
○ Aggregation functions (e.g., COUNT, SUM, AVG, MAX, MIN) are often used
with GROUP BY to calculate values for each group.
○ Example: SELECT department, AVG(salary) FROM employees GROUP BY
department;
SELECT department, gender, AVG(salary) FROM employees
GROUP BY department, gender;
<-- The HAVING clause is used with GROUP BY to filter groups based on aggregate function results It's similar to the WHERE clause but operates on grouped data.-->
SELECT department, AVG(salary) FROM employees GROUP BY
department HAVING AVG(salary) > 50000;
SELECT department, COUNT(*) FROM employees GROUP BY
department ORDER BY COUNT(*) DESC;
<--COUNT():
-- Counts the number of rows in a group or result set.
-- - SUM():
-- Calculates the sum of numeric values in a group or result set.
-- - AVG():
-- Computes the average of numeric values in a group or result set.
-- - MAX():
-- Finds the maximum value in a group or result set.
-- - MIN():
-- Retrieves the minimum value in a group or result set. -->

DML
INSERT INTO employees (first_name, last_name, salary) VALUES ('John',
'Doe', 50000);
UPDATE table_name SET column1 = value1, column2 = value2, ... WHERE
condition;
UPDATE employees SET salary = 55000 WHERE first_name = 'John';
DELETE FROM table_name WHERE condition;
DELETE FROM employees WHERE last_name = 'Doe'

DCL
GRANT privilege_type
ON object_name
TO user_or_role;
Data Control Language focuses on the management of access rights, permissions, and
security-related aspects of a database system.
There are two main DCL commands in SQL: GRANT and REVOKE.
Granting SELECT privilege on a table named "Employees" to a user named
"Analyst":
GRANT SELECT ON Employees TO Analyst;
REVOKE privilege_type
ON object_name
FROM user_or_role;
Revoking the SELECT privilege on the "Employees" table from the "Analyst" user:
REVOKE SELECT ON Employees FROM Analyst;

<--It essentially filters out non-matching rows and returns only the rows that have matching
-- values in both tables.-->
1) Inner Join
SELECT columns
FROM table1
INNER JOIN table2
ON table1.column = table2.column;
SELECT Customers.CustomerName, Orders.Product
FROM Customers
INNER JOIN Orders ON Customers.CustomerID = Orders.CustomerID;
2) Outer Join
1. Left Outer Join (Left Join):
SELECT Customers.CustomerName, Orders.Product
FROM Customers
LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID;
2. Right Outer Join (Right Join):
SELECT Customers.CustomerName, Orders.Product
FROM Customers
RIGHT JOIN Orders ON Customers.CustomerID = Orders.CustomerID;
3. Full Outer Join (Full Join):
SELECT Customers.CustomerName, Orders.Product
FROM Customers
FULL OUTER JOIN Orders ON Customers.CustomerID = Orders.CustomerID;
3) Cross Join
SELECT columns
FROM table1
CROSS JOIN table2;
SELECT Students.StudentName, Courses.CourseName
FROM Students
CROSS JOIN Courses;
4) Self Join
SELECT columns
FROM table1 AS alias1
JOIN table1 AS alias2 ON alias1.column = alias2.column;
SELECT e1.EmployeeName AS Employee, e2.EmployeeName AS Manager
FROM Employees AS e1
JOIN Employees AS e2 ON e1.ManagerID = e2.EmployeeID;

SET OPERATIONS
● UNION
● INTERSECT
● EXCEPT (or MINUS)
● UNION ALL
UNION Query:
SELECT CustomerName FROM Customers
UNION
SELECT SupplierName FROM Suppliers;
2. INTERSECT:
SELECT CustomerName FROM Customers
INTERSECT
SELECT SupplierName FROM Suppliers;
3. EXCEPT (or MINUS):
SELECT CustomerName FROM Customers
EXCEPT
SELECT SupplierName FROM Suppliers;
4. UNION ALL:
SELECT CustomerName FROM Customers
UNION ALL
SELECT SupplierName FROM Suppliers;

SELECT ProductName, Quantity
FROM Products
WHERE Price * Quantity > (SELECT AVG(Price) FROM Products);
































