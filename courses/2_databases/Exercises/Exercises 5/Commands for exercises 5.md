CREATE TABLE Products
(
    ProductID   INTEGER PRIMARY KEY AUTOINCREMENT,
    ProductName TEXT,
    Price       REAL,
    Category    TEXT
);

INSERT INTO Products (ProductName, Price, Category)
VALUES ('Laptop', 999.99, 'Electronics'),
       ('Smartphone', 699.99, 'Electronics'),
       ('Tablet', 399.99, 'Electronics'),
       ('Coffee Table', 199.99, 'Furniture'),
       ('Desk', 299.99, 'Furniture'),
       ('Chair', 149.99, 'Furniture'),
       ('Sofa', 599.99, 'Furniture'),
       ('T-shirt', 19.99, 'Clothing'),
       ('Jeans', 49.99, 'Clothing'),
       ('Jacket', 89.99, 'Clothing');

SELECT name
FROM sqlite_master
WHERE type = 'table';

SELECT Count(*)
FROM Products;

SELECT Count(*)
FROM Products
WHERE Category = 'Electronics';

SELECT SUM(Price)
FROM Products
WHERE Category = 'Electronics';

SELECT AVG(Price)
FROM Products
WHERE Category = 'Electronics';

SELECT max(Price)
from Products;

SELECT min(Price)
from Products;

SELECT Category, COUNT(*) as ProductCount
FROM Products
GROUP BY Category;

SELECT Count(Category), Category
FROM Products
GROUP BY Category
Having Count(Category) > 3;

SELECT *
FROM Products
WHERE Price > (SELECT AVG(Price) FROM Products);

-- Create Customers table
CREATE TABLE Customers
(
    CustomerID   INTEGER PRIMARY KEY AUTOINCREMENT,
    CustomerName TEXT,
    ContactName  TEXT,
    Address      TEXT,
    City         TEXT,
    PostalCode   TEXT,
    Country      TEXT
);

-- Insert data into Customers table
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('Alfreds Futterkiste', 'Maria Anders', 'Obere Str. 57', 'Berlin', '12209', 'Germany'),
       ('Ana Trujillo Emparedados y helados', 'Ana Trujillo', 'Avda. de la Constitución 2222', 'México D.F.', '05021',
        'Mexico'),
       ('Antonio Moreno Taquería', 'Antonio Moreno', 'Mataderos 2312', 'México D.F.', '05023', 'Mexico');

-- Create Suppliers table
CREATE TABLE Suppliers
(
    SupplierID   INTEGER PRIMARY KEY AUTOINCREMENT,
    SupplierName TEXT,
    ContactName  TEXT,
    Address      TEXT,
    City         TEXT,
    PostalCode   TEXT,
    Country      TEXT
);

-- Insert data into Suppliers table
INSERT INTO Suppliers (SupplierName, ContactName, Address, City, PostalCode, Country)
VALUES ('Exotic Liquid', 'Charlotte Cooper', '49 Gilbert St.', 'London', 'EC1 4SD', 'UK'),
       ('New Orleans Cajun Delights', 'Shelley Burke', 'P.O. Box 78934', 'New Orleans', '70117', 'USA'),
       ('Grandma Kelly''s Homestead', 'Regina Murphy', '707 Oxford Rd.', 'Ann Arbor', '48104', 'USA');


SELECT City
From Customers
UNION
Select City
From Suppliers
Order by City;

SELECT City
From Customers
UNION ALL
Select City
From Suppliers
Order by City;

select Category, count(*) as ProductCount
from Products
GROUP BY Category
ORDER BY ProductCount DESC;

select Category, count(*) as ProductCount
from Products
GROUP BY Category
Having ProductCount >= 3
ORDER BY ProductCount DESC;

Select ProductName, Price
from Products
Where Price > (Select AVG(Price) from Products)
Order by Price;

Select CustomerName
From Customers
union
Select ContactName
from Suppliers;

INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('John Doe', 'John Doe', '123 Main St', 'New York', '10001', 'USA');
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('Billy Doe', 'Billy Doe', '126 Main St', 'Buffalo', '13001', 'USA');

CREATE VIEW CustomersInUS AS
SELECT CustomerName
FROM Customers
WHERE Country = 'USA';

SELECT *
from CustomersInUS;
