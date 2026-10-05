DSA Project

Overview

This repository contains a Java-based Data Structures and Algorithms (DSA) group project.

The project demonstrates the implementation and practical use of data structures and algorithms through multiple Java classes.

Current Project Files

DSA-Project/
└── DSA-Project/
    ├── Main.java
    ├── methods.java
    ├── Sorting.java
    └── PostfixEvaluation.java

Features

Main Application

Main.java serves as the main entry point for the project and coordinates the application's functionality.

Supporting Methods

methods.java contains supporting methods used by the project.

Sorting

Sorting.java contains the sorting-related functionality implemented for the DSA project.

Postfix Evaluation

PostfixEvaluation.java evaluates postfix (Reverse Polish Notation) expressions using a stack.

The postfix module demonstrates the following stack operations:

push() – adds a value to the stack.

pop() – removes and returns the top value.

peek() – reads the top value without removing it.

displayStack() – displays the current stack.

evaluatePostfix() – evaluates the complete postfix expression.

Supported operators include:

+
-
*
/
×
÷

The implementation also checks for invalid expressions and division by zero.

Example: Postfix Evaluation

Input:

5 6 + 2 *

Processing:

5 6 + = 11
11 2 * = 22

Final result:

22

Requirements

To compile and run the project, install a Java Development Kit (JDK) and ensure that java and javac are available from the terminal.

Check the installation with:

java --version
javac --version

Running the Project in Visual Studio Code

Open the terminal in the directory containing the Java files:

cd "C:\Users\osakw\Documents\School\DSA-Project\DSA-Project"

Compile all Java source files:

javac *.java

Run the main project:

java Main

Running the Postfix Evaluator Separately

If PostfixEvaluation.java is being used as a standalone class with its own main() method:

java PostfixEvaluation

Then enter a postfix expression such as:

8 2 / 3 +

Git and GitHub Workflow

This project is maintained using Git and GitHub.

Check the current status:

git status

Create a feature branch for your work:

git checkout -b your-name-feature

Stage your changes:

git add .

Commit your changes:

git commit -m "Add postfix expression evaluation"

Push your branch:

git push -u origin your-name-feature

For shared group work, submit a pull request from the feature branch to the project's main branch when required by the group workflow.

Git Identity

Each group member should use their own GitHub-associated Git identity.

Check the configured identity with:

git config user.name
git config user.email

The commit email should be associated with the contributor's GitHub account so GitHub can attribute the commit correctly.

Submitted By

Roderick Dausab — Student No. 224031279

Group Members

Member

Student Number

Roderick Dausab

224031279

Nelson Osakwe

223119024

Tjameya P.K

225071940

Individual Contribution Record

Contributions should reflect the work actually completed by each member.

Nelson Osakwe

Contribution: Postfix expression evaluation using the Stack data structure

File: PostfixEvaluation.java

Other Group Members

Roderick Dausab: Add the actual contribution and files completed.

Tjameya P.K: Add the actual contribution and files completed.

Development Notes

New DSA functionality should be added to the existing project structure and integrated with the project's main application where appropriate.

The postfix evaluation implementation is intended to demonstrate practical use of the Stack data structure and related operations.


Academic Use

This repository is for academic and educational purposes as part of a group DSA project.
