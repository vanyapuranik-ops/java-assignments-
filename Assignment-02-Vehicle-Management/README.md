# Assignment 2: Vehicle Management System using Java

## Objective
To implement a vehicle management system demonstrating Object-Oriented Programming concepts such as constructors, encapsulation, method overloading, and arrays of objects.

## Concepts Used
* Classes and Objects
* Constructor Overloading
* Copy Constructor
* Encapsulation (Getter and Setter)
* Arrays of Objects
* Methods and Control Statements

## Program Description
This program defines a `Vehicle` class with multiple attributes such as brand name, model name, price, fuel type, mileage, etc.

### Key Features:
* **Multiple Constructors**
  * Default constructor
  * Parameterized constructors
  * Copy constructor

* **Encapsulation**
  * Private variable `mfgID` accessed via getter and setter methods

* **Behavioral Methods**
  * `start()`, `drive()`, `stop()`
  * `changeSpeed()`
  * `calcMileage()`

The `MainForVehicle` class creates multiple vehicle objects using different constructors and stores them in an array.
It then generates a formatted vehicle inventory report and demonstrates object behaviors.

## How to Run
1. Compile:
```bash
javac Vehicle.java MainForVehicle.java
```

2. Run:
```bash
java MainForVehicle
```

## Sample Output
The program displays:
* Vehicle inventory table
* Speed changes
* Mileage calculations
* Vehicle actions (start, drive, stop)

## Important Observations
* Assigning `v5 = v4` creates a reference copy, not a deep copy.
* Copy constructor creates a separate object with duplicated values.
* Getter and setter methods ensure controlled access to private data.
