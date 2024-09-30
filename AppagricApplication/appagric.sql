CREATE DATABASE AppagricDB DROP IF EXISTS;

USE AppagricDB;


CREATE TABLE Users (
    userID INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50),
    role VARCHAR(20),
    contactInfo VARCHAR(100)
);

CREATE TABLE Products (
    productID INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    category VARCHAR(50),
    price DECIMAL(10,2),
    quantity INT
);

CREATE TABLE Orders (
    orderID INT PRIMARY KEY AUTO_INCREMENT,
    userID INT,
    productID INT,
    quantity INT,
    totalPrice DECIMAL(10,2),
    orderDate DATETIME,
    FOREIGN KEY (userID) REFERENCES Users(userID),
    FOREIGN KEY (productID) REFERENCES Products(productID)
);