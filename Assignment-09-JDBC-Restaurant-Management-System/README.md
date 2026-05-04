# Assignment 9: JDBC Restaurant Management System (Database CRUD)

## Objective
To implement a restaurant management system using Java JDBC that performs database operations such as insert, select, update, and delete.

## Concepts Used
* JDBC (Java Database Connectivity)
* MySQL Database
* DAO (Data Access Object) Design Pattern
* SQL (DDL & DML)
* PreparedStatement and Statement
* ResultSet Processing
* Exception Handling

## Project Structure
* **DBConnection**
  * Handles database connection using JDBC

* **RestaurantDAO**
  * Inserts restaurant records into database

* **MenuItemDAO**
  * Handles:
    * Insert menu items
    * Select queries
    * Update operations
    * Delete operations
    * Display data

* **MainForRestaurant**
  * Executes all operations step-by-step

## Database Schema
The project uses MySQL database `inventory_db`.

### Tables:
* Restaurant(Id, Name, Address)
* MenuItem(Id, Name, Price, ResId)

Refer to `schema.sql` to create the database.

## How to Run
1. Create database using schema.sql
2. Add MySQL Connector JAR
3. Compile:
```bash id="a8z3np"
javac -cp ".;mysql-connector-j-9.7.0.jar" *.java
```
4. Run:
```bash id="f4x7lr"
java -cp ".;mysql-connector-j-9.7.0.jar" MainForRestaurant
```

## Features
* Inserts sample restaurant and menu data
* Displays all menu items
* Filters items by price
* Joins tables to fetch restaurant-specific data
* Updates menu prices
* Deletes items based on condition
