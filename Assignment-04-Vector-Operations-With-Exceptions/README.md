# Assignment 4: Vector Operations with Exception Handling in Java

## Objective
To implement vector operations (addition, subtraction, dot product) with proper dimension validation using custom exception handling.

## Concepts Used
* Classes and Objects
* Exception Handling (Custom + Built-in)
* Arrays
* Encapsulation
* Defensive Copying (clone)
* Input Handling using Scanner

## Program Description
This program performs operations on vectors of dimensions 2D or 3D.

### Key Features:
* **Custom Exception**
  * `CheckDimensionsException` is thrown when:
    * Vector is null or empty
    * Vector dimension is not 2 or 3
    * Two vectors have mismatched dimensions

* **Vector Operations**
  * Addition
  * Subtraction
  * Dot Product

* **Validation**
  * Ensures only valid vectors are created
  * Ensures operations are performed on compatible vectors

* **Defensive Programming**
  * Uses `clone()` to prevent external modification of internal array

* **Exception Handling**
  * Handles:
    * `InputMismatchException` (invalid user input)
    * `CheckDimensionsException` (invalid vector operations)

## How to Run
1. Compile:
```bash id="z1pd8q"
javac VectorOperations.java MainForVectors.java CheckDimensionsException.java
```

2. Run:
```bash id="j9k2sx"
java MainForVectors
```

## Sample Output
* Displays vector addition and subtraction
* Prints dot product
* Shows error messages for invalid inputs

## Important Observations
* Custom exceptions improve robustness and readability.
* Defensive copying protects internal data from external modification.
* Dimension validation ensures mathematical correctness.
* Exception handling prevents program crashes.
