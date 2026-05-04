# Assignment 6: Employee Payroll System 

## Objective
To implement an employee payroll system demonstrating abstraction, inheritance, and method overriding in Java.

## Concepts Used
* Abstract Classes
* Inheritance
* Method Overriding
* Encapsulation (Getter/Setter)
* Polymorphism
* Real-world modeling

## Program Description
This program models different types of employees and calculates their Cost to Company (CTC) based on role-specific logic.

### Class Structure:
#### 1. Employee (Abstract Class)
* Contains common employee attributes
* Declares abstract methods:
  * `calcBenefits()`
  * `calcCTC()`

#### 2. Payroll
* Stores salary-related data:
  * Base salary
  * Bonus
  * Insurance
  * Working hours
  * Hourly rates

#### 3. FullTimeEmployee
* Extends Employee
* Calculates:
  * Benefits (insurance, PF, health insurance)
  * CTC = base salary + bonus + benefits

#### 4. Manager
* Extends FullTimeEmployee
* Adds:
  * Travel allowance
  * Education allowance
* Overrides benefit and CTC calculation

#### 5. ContractEmployee
* Extends Employee
* Calculates:
  * CTC based on hourly work
  * Minimal benefits

#### 6. MainForEmployee
* Demonstrates creation of different employee types
* Calculates and displays CTC for each category

## Key Features
* Abstract class enforces implementation of core methods
* Inheritance reduces code duplication
* Method overriding enables role-specific behavior
* Flexible payroll handling for different employee types

## How to Run
1. Compile:
```bash id="p1g8wd"
javac *.java
```

2. Run:
```bash id="y6n2kt"
java MainForEmployee
```

## Sample Output
* Displays CTC for:
  * Full-time employee
  * Manager
  * Contract employee

## Important Observations
* Abstract classes cannot be instantiated.
* Method overriding enables runtime polymorphism.
* Payroll object separates salary data from employee logic.
* Design follows real-world HR system modeling.
