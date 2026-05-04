# Assignment 5: Banking System using Java (OOP)

## Objective
To design and implement a banking system using Object-Oriented Programming concepts such as inheritance, aggregation, encapsulation, and polymorphism.

## Concepts Used
* Classes and Objects
* Inheritance
* Method Overriding
* Encapsulation (Getter/Setter)
* Aggregation (Customer → Accounts)
* ArrayList Collection
* Real-world system modeling

## Program Description
This program simulates a banking system where a customer can have multiple accounts.

### Classes Implemented:
#### 1. Customer
* Stores customer details
* Can hold multiple accounts using ArrayList
* Provides methods to:
  * Add accounts
  * Check balances
  * Update details

#### 2. Account (Base Class)
* Contains common account attributes
* Provides operations:
  * Credit
  * Debit
  * Transfer
  * Check Balance

#### 3. SavingsAccount (Derived Class)
* Inherits from Account
* Adds:

  * Interest rate
  * Minimum balance constraint
* Overrides `debit()` to enforce minimum balance

#### 4. LoanAccount (Derived Class)
* Represents loan details
* Includes:
  * EMI calculation
  * Outstanding amount tracking
  * Loan repayment methods

#### 5. MainForBank
* Demonstrates:
  * Customer creation
  * Account linking
  * Transactions
  * Loan operations
  * Displaying customer and account details

## Key Features
* Real-world banking model
* Multiple account handling per customer
* Method overriding for specialized behavior
* EMI calculation using financial formula

## How to Run
1. Compile:
```bash id="m4h2yt"
javac *.java
```

2. Run:
```bash id="s8k3qp"
java MainForBank
```

## Sample Output
* Savings account operations (credit, debit, balance)
* Loan EMI and outstanding amount
* Customer details with account information
