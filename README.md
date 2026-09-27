# Java Exercises

A collection of small Java exercises created while learning and practicing Java programming.

The main goal of this repository is to practice Java fundamentals, improve problem-solving skills, and keep track of my progress while learning the language.

## Exercises

### 1. Weight Converter

A console-based weight conversion program that converts values between pounds and kilograms.

#### Supported Conversions

- Pounds (`lbs`) → Kilograms (`kg`)
- Kilograms (`kg`) → Pounds (`lbs`)

#### Conversion Formulas

**Pounds to Kilograms:**

```text
kilograms = pounds × 0.45359237
```

**Kilograms to Pounds:**

```text
pounds = kilograms × 2.20462262
```

The program validates the user's input to make sure that:

- The selected conversion is either `1` or `2`.
- The entered weight is a valid number.
- The weight is greater than `0`.

#### Concepts Practiced

- `Scanner` and user input
- `if / else if / else` statements
- `do-while` loops
- `boolean` variables
- `int` and `double` data types
- Input validation
- Arithmetic operations
- Unit conversion

---

### 2. Basic Calculator

A console-based calculator that performs different arithmetic operations based on user input.

#### Supported Operations

| Operator | Operation |
|----------|-----------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `^` | Power |
| `%` | Modulo / Remainder |

The program validates user input and prevents division by zero.

The calculator separates different tasks into individual methods:

- `takingNumber()` — reads and validates a number from the user.
- `takingOperator()` — reads and validates the selected operator.
- `calculation()` — performs the selected mathematical operation.

#### Concepts Practiced

- `Scanner` and user input
- Methods
- Parameters and arguments
- Return values
- `double` and `char` data types
- `boolean` variables
- `if / else` statements
- `switch / case`
- `do-while` loops
- Input validation
- Arithmetic operators
- `Math.pow()`

---

## Technologies

- Java
- Eclipse IDE

## Learning Notes

These exercises were created as part of my Java learning process.

While developing the projects, I focused on understanding Java fundamentals such as user input, conditional statements, loops, methods, input validation, arithmetic operations, and `switch / case`.

AI was also used as a source of inspiration during development, particularly for exploring method parameters, method calls, and alternative approaches to structuring conditional logic. The exercises were used to understand and practice these concepts rather than simply generating complete solutions.

## Possible Improvements

These exercises can be extended as I continue learning Java.

Possible future improvements include:

- More comprehensive input and error handling
- Handling additional mathematical edge cases
- Improving user interaction and output formatting
- Adding more exercises as new Java concepts are learned

## Purpose

This repository is a record of my progress while learning Java and practicing programming fundamentals through small, hands-on exercises.
