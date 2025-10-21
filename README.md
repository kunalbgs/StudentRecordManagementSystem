🧾 Student Record Management System (Java Console Project)
📘 Overview

The Student Record Management System is a simple Java console-based CRUD (Create, Read, Update, Delete) application.
It allows the user to add, view, update, and delete student records using basic Java concepts like:

Classes & Objects

Constructors

ArrayList for data storage

Input validation using Scanner

Exception handling (try-catch)

Loops and conditional statements

This program is menu-driven, meaning the user interacts via numbered options in the terminal.

🧠 Project Objective

To practice Core Java fundamentals such as:

Object-Oriented Programming (OOP)

Data structures (ArrayList)

Input validation

Exception handling

Loops & Control structures

⚙️ Technologies Used
Component	Technology
Language	Java (JDK 8 or above)
IDE	IntelliJ IDEA / VS Code / Eclipse
Data Structure	ArrayList<Student>
Input	Scanner class
Output	Console (System.out)
📂 Project Structure
StudentRecordSystem.java
│
├── public class StudentRecordSystem
│   ├── main(String[] args)
│   ├── getValidInt(Scanner sc)
│   ├── getValidDouble(Scanner sc)
│
└── class Student
    ├── int id
    ├── String name
    ├── double marks
    ├── display()

🧩 Main Features
1️⃣ Add Student

User can add a new student by entering:

Student ID (integer)

Student Name (only alphabets allowed)

Marks (0–100 range)

The program validates all inputs:

Invalid names (with numbers/symbols) → error message

Invalid marks (outside 0–100) → re-enter prompt

Invalid integers → handled gracefully

2️⃣ View Students

Displays all students in the list.

If list is empty → prints “No records found.”

3️⃣ Update Student

User can enter the student ID to update.

If found → program asks for new name & marks.

Otherwise → prints “Student not found.”

4️⃣ Delete Student

User can enter the student ID to delete.

If found → removes student from the list.

Otherwise → “Student not found.”

5️⃣ Exit

Gracefully terminates the program using System.exit(0).

Closes the Scanner object.

📥 Input Validation Logic
Type	Method	Description
Integer	getValidInt(Scanner sc)	Loops until a valid integer is entered.
Double	getValidDouble(Scanner sc)	Loops until a valid double (0–100) is entered.
Name	Regex [a-zA-Z ]+	Accepts only alphabets and spaces.
Example Validation Flow
Enter Marks: abc
Invalid input! Please enter valid marks (e.g. 85.5):
> -5
Marks must be between 0 and 100. Try again:
> 95.6

🧑‍💻 How to Run the Program
✅ Option 1 — Using Command Line

Save file as StudentRecordSystem.java

Open terminal in the same directory.

Compile:

javac StudentRecordSystem.java


Run:

java StudentRecordSystem

✅ Option 2 — Using IntelliJ IDEA / VS Code

Create a new Java project.

Copy this file inside src/ folder.

Click Run ▶️ on main() method.

💻 Sample Console Output
--- Student Record Management ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1

Enter ID: 101
Enter Name: Rahul Kumar
Enter Marks: 89.5
Student added successfully!

--- Student Record Management ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 2

--- Student List ---
ID: 101, Name: Rahul Kumar, Marks: 89.5

🧱 Class Explanation
Student Class

Represents a single student record.

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}


Responsibilities:

Stores ID, Name, and Marks.

Has a constructor for initialization.

display() prints student info in a readable format.

🧮 Core Logic Flow
Step	Action	Description
1	Display menu	Shows available options.
2	Take input	User enters choice using keyboard.
3	Switch-case	Routes to appropriate block (Add/View/Update/Delete/Exit).
4	Perform operation	Based on input.
5	Loop again	Until user exits.
⚠️ Error Handling

Invalid Input (non-numeric) → Gracefully handled with error message.

Out of range marks → User asked to re-enter.

Non-existing ID (update/delete) → Message shown.

Empty student list → “No records found.”

💡 Possible Future Enhancements
Feature	Description
🧾 File Storage	Save student data to a text/CSV file to persist after exit.
🧰 Encapsulation	Use private fields with getters/setters for better OOP design.
🆔 Unique ID Check	Prevent duplicate student IDs during add operation.
🔍 Search Function	Search students by name or ID.
📊 Sorting	Sort by marks or name before displaying.
💾 Database	Integrate MySQL for backend storage.
🖥 GUI	Add Swing or JavaFX-based user interface.
🧑‍🏫 Learning Outcomes

By working on this project, you learn:

✔️ Basic structure of a Java application

✔️ Using Scanner for input

✔️ Exception handling (try-catch)

✔️ Using ArrayList for dynamic data

✔️ Implementing CRUD operations

✔️ Writing modular code using methods

✔️ Practicing object-oriented design

🧑‍💻 Author

👨‍💼 Kunal Kumar
Service Quality Officer at Ujjivan Small Finance Bank
🎓 Aspiring Java Backend Developer
📍 Begusarai, Bihar
📧 kunalkumarbuj@gmail.com

📄 License

This project is open-source and available for educational purposes.
You may modify and redistribute with proper credit to the author.
