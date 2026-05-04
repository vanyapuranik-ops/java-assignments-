# Assignment 10: JavaFX + JDBC Inventory Management System

## Objective
To build a GUI-based inventory management system using JavaFX integrated with JDBC for database operations.

## Technologies Used
* Java
* JavaFX (GUI)
* JDBC
* MySQL
* DAO Design Pattern

## Features
* GUI-based interaction
* Insert data into database
* Execute SELECT queries
* Update records
* Delete records
* Display output using TextArea

## Project Structure
### 1. DBConnection
* Handles MySQL connection

### 2. DAO Classes
* RestaurantDAO → Inserts restaurant data
* MenuItemDAO → Handles CRUD operations

### 3. MainFX
* JavaFX UI
* Buttons for:
  * Insert
  * Select
  * Update
  * Delete
* Displays output in TextArea

## Database Setup
Run `schema.sql`:
```sql id="s8m2qz"
CREATE DATABASE inventory_db;
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
```

## How to Run
### 1. Add Dependencies
* MySQL Connector JAR
* JavaFX SDK

### 2. Compile
```bash id="r3v7kx"
javac --module-path "path_to_javafx/lib" --add-modules javafx.controls *.java
```

### 3. Run
```bash id="n5t1yw"
java --module-path "path_to_javafx/lib" --add-modules javafx.controls MainFX
```

## Important Notes

* Ensure MySQL server is running
* Update DB credentials in DBConnection.java
* JavaFX must be correctly configured

## Observations
* GUI improves usability over console apps
* DAO separates DB logic from UI
* JavaFX enables event-driven programming
