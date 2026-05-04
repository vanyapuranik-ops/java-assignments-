CREATE DATABASE IF NOT EXISTS inventory_db;
USE inventory_db;

CREATE TABLE Restaurant (
    Id INT PRIMARY KEY,
    Name VARCHAR(100),
    Address VARCHAR(200)
);

CREATE TABLE MenuItem (
    Id INT PRIMARY KEY,
    Name VARCHAR(100),
    Price INT,
    ResId INT,
    FOREIGN KEY (ResId) REFERENCES Restaurant(Id)
);

