# Assignment 7: Student File Management System (CRUD using Java File I/O)

## Objective
To implement a student management system using Java File I/O that supports Create, Read, Update, and Delete (CRUD) operations on a CSV file.

## Concepts Used
* File Handling (BufferedReader, BufferedWriter, FileReader, FileWriter)
* Exception Handling (IOException)
* Collections (ArrayList)
* Object to CSV Mapping
* Data Processing

## Program Description
This program manages student records stored in a CSV file (`Students.csv`).

### Classes Implemented:
#### 1. Student
* Represents a student entity
* Stores marks and percentage
* Provides `toCSV()` method to convert object into CSV format

#### 2. StudentService
Handles all file operations:
* **createFile()**
  * Creates CSV file with header and initial records
* **addStudents()**
  * Appends new student records
* **readStudents()**
  * Reads CSV file and converts rows into Student objects
* **updateMarks()**
  * Updates missing marks (marks4, marks5)
* **calculatePercentage()**
  * Computes percentage for each student
* **deleteStudent(id)**
  * Deletes a student based on ID
* **display()**
  * Displays file contents
* **showException()**
  * Demonstrates exception handling for file not found

#### 3. MainForStudent
* Demonstrates full CRUD workflow step-by-step

## Key Features
* CSV-based persistent storage
* Complete CRUD operations
* Object ↔ file data mapping
* Exception handling for file operations

## How to Run
1. Compile:
```bash id="p3k7nx"
javac *.java
```
2. Run:
```bash id="t8v2jm"
java MainForStudent
```

## Sample Output
* Displays CSV contents after each operation
* Shows updates in marks and percentage
* Demonstrates deletion of a record
* Displays handled exception message
