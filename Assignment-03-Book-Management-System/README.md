# Assignment 3: Book Management System using Java

## Objective
To implement a book management system using Java that demonstrates exception handling, object-oriented programming, and the use of ArrayList.

## Concepts Used
* Classes and Objects
* Constructor Overloading
* Copy Constructor
* Exception Handling (Custom Exceptions)
* ArrayList Collection
* Lambda Expressions (forEach)
* Data Validation

## Program Description
This program defines a `Book` class with attributes such as title, price, ISBN, genre, and author.

### Key Features:
* **Custom Exceptions**
  * `InvalidPriceException` → thrown when price is negative
  * `InvalidTitleException` → thrown when title is null

* **Constructors**
  * Default constructor
  * Parameterized constructor with validation
  * Copy constructor

* **ArrayList Usage**
  * Stores multiple Book objects dynamically

* **Operations Performed**
  * Adding books to ArrayList
  * Handling invalid inputs using try-catch
  * Displaying all book details
  * Calculating average price of books
  * Filtering and displaying fiction books

## How to Run
1. Compile:
```bash id="xj91pd"
javac Book.java InvalidPriceException.java InvalidTitleException.java ArrayListOfBooks.java
```

2. Run:
```bash id="u2p8vz"
java ArrayListOfBooks
```

## Sample Output
* Displays details of all valid books
* Shows exception messages for invalid inputs
* Prints average price
* Lists fiction books

## Important Observations
* Custom exceptions improve program robustness and readability.
* Copy constructor creates a new object with duplicated values.
* ArrayList allows dynamic resizing compared to arrays.
* Lambda expressions simplify iteration.
