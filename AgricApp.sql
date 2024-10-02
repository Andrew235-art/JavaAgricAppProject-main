
CREATE DATABASE IF NOT EXISTS AgricAppDB;

USE AgricAppDB;

CREATE TABLE Products (
    productID INT PRIMARY KEY,
    name VARCHAR(255),
    category VARCHAR(255),
    price DECIMAL(10, 2),
    quantity INT
);

CREATE TABLE Users (
    userID INT PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255),
    role VARCHAR(50),
    contactInfo VARCHAR(255)
);

CREATE TABLE Orders (
    orderID INT PRIMARY KEY,
    userID INT,
    productID INT,
    quantity INT,
    totalPrice DECIMAL(10, 2),
    orderDate DATE,
    FOREIGN KEY (userID) REFERENCES Users(userID),
    FOREIGN KEY (productID) REFERENCES Products(productID)
);

CREATE TABLE Payments (
    paymentID INT PRIMARY KEY,
    orderID INT,
    paymentMethod VARCHAR(50),
    amount DECIMAL(10, 2),
    paymentStatus VARCHAR(50),
    paymentDate DATE,
    FOREIGN KEY (orderID) REFERENCES Orders(orderID)
);
