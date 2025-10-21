📘 Student Record Management System
This is a command-line Java application that allows users to manage student records using basic CRUD operations (Create, Read, Update, Delete). It demonstrates practical use of object-oriented programming, ArrayList, input validation, and menu-driven logic.

Technologies Used
- Java: Core programming language used to build the application.
- Scanner: Used to take user input from the command line.
- ArrayList: Used to store and manage student records dynamically.
- IntelliJ IDEA or VS Code: Recommended IDEs for writing and running the code.
- Command Line Interface (CLI): The program runs in the terminal and interacts with the user via text-based menu options.
- Input Validation: Ensures safe and correct input for integers, names, and marks.

Features
- Add new student with ID, name, and marks.
- View all student records.
- Update student details by ID.
- Delete student record by ID.
- Input validation:
- Integer values for ID and menu choice.
- Name must contain only alphabets and spaces.
- Marks must be between 0 and 100.

Project Structure
- Student.java: Defines the Student class with fields and display method.
- StudentRecordSystem.java: Contains the main method, menu logic, and input validation.
- README.md: Project documentation.


How It Works
- The Student class defines the structure of each student record.
- The StudentRecordSystem class contains the main logic:
- Uses ArrayList to store student objects.
- Displays a menu to the user.
- Handles input safely using custom methods.
- Performs CRUD operations based on user choice.


    How to Run
- Open the project in IntelliJ IDEA or VS Code.
- Make sure both Student.java and StudentRecordSystem.java are in the same folder or package.
- Run StudentRecordSystem.java.
- Use the menu to add, view, update, or delete student records.


--- Student Record Management ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter ID: 101
Enter Name: Kunal
Enter Marks: 88.5
Student added successfully!

Validation Logic
- ID must be a valid integer.
- Name must contain only alphabets and spaces.
- Marks must be between 0 and 100.


Learning Outcomes
- Understand and apply object-oriented programming in Java.
- Use ArrayList for dynamic data storage.
- Implement input validation and error handling.
- Build a menu-driven CLI application.
- Structure code for readability and scalability.

Future Enhancements
- Prevent duplicate IDs.
- Save and load records from a file.
- Sort students by marks or name.
- Add GUI using Java Swing or JavaFX.
- Convert to web-based version using Spring Boot.


Author
Kunal

