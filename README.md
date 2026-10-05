# DSA Project

## Project Information

**Project Title:** Data Structures and Algorithms Project
**Programming Language:** Java
**Project Type:** Group Project
**Repository:** [DSA-Project](https://github.com/roderickdausab-alt/DSA-Project)

## Submitted By

**Roderick Dausab** — 224031279

## Group Members

| No. | Name            | Student Number |
| --: | --------------- | -------------- |
|   1 | Roderick Dausab | 224031279      |
|   2 | Nelson Osakwe   | 223119024      |
|   3 | Tjameya P.K     | 225071940      |

## Project Description

The Data Structures and Algorithms (DSA) Project is a Java application developed to demonstrate the practical implementation of programming methods, algorithms, and data structures.

The project contains modules for supporting methods, sorting algorithms, and postfix expression evaluation using a stack. These components demonstrate how algorithms process data and how data structures can be used to solve computational problems.

The application is organized into separate Java source files to make the code easier to understand, test, maintain, and extend.

## System Features

### 1. Main Application

`Main.java` contains the main entry point and application interface.

### 2. Supporting Methods

`methods.java` contains supporting methods used by the project.

### 3. Sorting Algorithms

`Sorting.java` contains the project's sorting functionality for demonstrating how algorithms arrange data.

### 4. Postfix Expression Evaluation

`PostfixEvaluation.java` evaluates mathematical expressions written in postfix notation, also known as Reverse Polish Notation.

The module includes:

* **Push:** Adds an operand or calculated result to the stack.
* **Pop:** Removes and returns the top stack element.
* **Peek:** Reads the top element without removing it.
* **Stack display:** Shows the current contents of the stack during evaluation.
* **Arithmetic operations:** Supports addition, subtraction, multiplication, and division.
* **Input validation:** Detects invalid expressions and unsupported operators.
* **Division-by-zero protection:** Prevents division when the second operand is zero.

#### Example

Postfix expression:

```text
5 6 + 2 *
```

Evaluation:

```text
5 + 6 = 11
11 * 2 = 22
```

Final result:

```text
22
```

The postfix evaluator uses integer arithmetic, so division discards any fractional part.

## Technologies Used

* Java
* Java Development Kit (JDK)
* Visual Studio Code
* Git
* GitHub

## Project Structure

```text
DSA-Project/
├── README.md
└── DSA-Project/
    ├── Main.java
    ├── methods.java
    ├── Sorting.java
    └── PostfixEvaluation.java
```

## Requirements

Before compiling the project, ensure that the Java Development Kit (JDK) is installed.

Check the installation using:

```powershell
java --version
javac --version
```

Both commands should display the installed Java version.

## Compilation Instructions

Open a terminal at the repository's root directory and navigate to the folder containing the Java source files:

```powershell
cd DSA-Project
```

Compile the Java files:

```powershell
javac *.java
```

If compilation succeeds, the compiler creates `.class` files for the Java classes.

## How to Run the Application

Run the main application:

```powershell
java Main
```

To run the postfix evaluator independently, when its standalone `main()` method is present, use:

```powershell
java PostfixEvaluation
```

Enter a postfix expression using spaces between numbers and operators.

For example:

```text
8 2 / 3 +
```

The result should be:

```text
Final Result: 7
```

## Testing

The application should be tested using valid and invalid inputs.

Suggested postfix evaluator tests include:

| Expression  |        Expected Result |
| ----------- | ---------------------: |
| `5 6 +`     |                     11 |
| `9 4 -`     |                      5 |
| `3 4 *`     |                     12 |
| `8 2 /`     |                      4 |
| `5 6 + 2 *` |                     22 |
| `8 0 /`     | Division-by-zero error |
| `5 +`       |     Invalid expression |

## GitHub Collaboration

Git and GitHub are used to maintain the project's source code and development history.

Group members should contribute their own code, test their changes, and use meaningful commit messages to document their work.

Example Git commands:

```powershell
git status
git add .
git commit -m "Add postfix expression evaluation using stack"
git push
```

For changes made on a separate branch, push the branch and create a pull request for review and merging.


## Conclusion

The DSA Project demonstrates the application of data structures and algorithms through a modular Java program. Its sorting functionality, supporting methods, and postfix expression evaluator provide practical examples of algorithmic problem-solving and stack operations.

The project can be extended with additional algorithms, improved validation, and further integration between its modules as development continues.
