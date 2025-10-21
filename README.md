📘 Student Record Management System
A simple, menu-driven Java CLI application to manage student records using Object-Oriented Programming and ArrayList. This project demonstrates CRUD operations (Create, Read, Update, Delete) with input validation and real-world logic.

🧰 Technologies Used
|  |  | 
|  |  | 
|  |  | 
|  |  | 
|  |  | 



🎯 Features
- ✅ Add new student with ID, name, and marks
- ✅ View all student records
- ✅ Update student details by ID
- ✅ Delete student record by ID
- ✅ Input validation for:
- Integer values (ID, menu choice)
- Name (only alphabets allowed)
- Marks (must be between 0 and 100)

📂 Project Structure
StudentRecordSystem/
├── StudentRecordSystem.java   # Main class with menu and logic
├── Student.java               # Student class with fields and display method
└── README.md                  # Project documentation



🧱 How It Works
- Student Class
- Fields: id, name, marks
- Constructor to initialize values
- display() method to print student details
- Main Class (StudentRecordSystem)
- Uses ArrayList<Student> to store records
- Menu-driven loop with options 1–5
- Input validation using custom methods:
- getValidInt() → ensures integer input
- getValidDouble() → ensures marks are between 0–100

🚀 How to Run
- Open project in IntelliJ or VS Code
- Make sure both Student.java and StudentRecordSystem.java are in the same package or folder
- Run StudentRecordSystem.java
- Use the menu to interact with the system

🧪 Sample Interaction
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



📌 Validation Logic
|  |  | 
|  |  | 
|  |  | 
|  |  | 



📈 Learning Outcomes
- Practical use of Java classes and objects
- Real-world application of ArrayList
- Input validation and error handling
- CLI-based user interaction
- Modular code structure for scalability

🛠️ Future Enhancements
- 🔒 Prevent duplicate IDs
- 📁 Save/load records to a file
- 📊 Sort students by marks or name
- 🖥️ GUI version using Java Swing or JavaFX
- 🌐 Web-based version using Spring Boot

👨‍💻 Author
Kunal
Customer Care Representative turned aspiring Java Developer
Passionate about building real-world tech projects and mastering OOP concepts

Would you like me to help you format this for GitHub or turn it into a portfolio page? I can also help you write a project description for your resume!
