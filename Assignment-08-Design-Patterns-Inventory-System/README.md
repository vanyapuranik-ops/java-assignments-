# Assignment 8: Inventory System using Design Patterns in Java

## Objective
To implement an inventory management system using design patterns such as Adapter, Singleton, and Iterator.

## Concepts Used
* Interfaces
* Adapter Design Pattern
* Singleton Design Pattern
* Iterator Pattern
* Collections (ArrayList)
* Object-Oriented Design Principles

## Program Description
This program demonstrates how modern systems can integrate legacy components using design patterns.

### Components:
#### 1. Product (Interface)

* Defines a common method:
  * `displayDetails()`

#### 2. NewProduct
* Represents modern product implementation
* Directly implements Product interface

#### 3. LegacyItem
* Represents old system class
* Uses incompatible method `print()`

#### 4. ProductAdapter (Adapter Pattern)
* Adapts `LegacyItem` to `Product`
* Converts old interface to new interface

#### 5. InventoryManager (Singleton Pattern)
* Ensures only one instance exists
* Stores all products in a list
* Provides:
  * addProduct()
  * returnInventory()

#### 6. Iterator Usage
* Iterates through product list using Java Iterator

#### 7. MainForProduct
* Demonstrates:
  * Adding new products
  * Adapting legacy products
  * Iterating through inventory

## Key Features
* Integration of legacy and modern systems
* Centralized inventory management using Singleton
* Flexible product handling via interface abstraction
* Clean iteration using Iterator pattern

## How to Run
1. Compile:
```bash id="x4n1tj"
javac *.java
```

2. Run:
```bash id="c7v9ms"
java MainForProduct
```
