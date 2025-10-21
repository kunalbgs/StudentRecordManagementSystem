import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecordSystem
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            ArrayList<Student> students = new ArrayList<>();

            while (true) {
                System.out.println("\n--- Student Record Management ---");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = getValidInt(sc);

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = getValidInt(sc);
                        sc.nextLine(); // Clear newline

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        while (!name.matches("[a-zA-Z ]+")) {
                            System.out.println("Invalid name! Please enter alphabets only.");
                            System.out.print("Enter Name again: ");
                            name = sc.nextLine();
                        }

                        System.out.print("Enter Marks: ");
                        double marks = getValidDouble(sc);

                        Student s = new Student(id, name, marks);
                        students.add(s);
                        System.out.println("Student added successfully!");
                        break;

                    case 2:
                        System.out.println("\n--- Student List ---");
                        if (students.isEmpty()) {
                            System.out.println("No records found.");
                        } else {
                            for (Student st : students) {
                                st.display();
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter ID to update: ");
                        int updateId = getValidInt(sc);
                        boolean found = false;

                        for (Student st : students) {
                            if (st.id == updateId) {
                                sc.nextLine(); // Clear newline
                                System.out.print("Enter new name: ");
                                String newName = sc.nextLine();
                                while (!newName.matches("[a-zA-Z ]+")) {
                                    System.out.println("Invalid name! Please enter alphabets only.");
                                    System.out.print("Enter Name again: ");
                                    newName = sc.nextLine();
                                }

                                System.out.print("Enter new marks: ");
                                double newMarks = getValidDouble(sc);

                                st.name = newName;
                                st.marks = newMarks;
                                System.out.println("Student updated successfully!");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student with ID " + updateId + " not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int deleteId = getValidInt(sc);
                        found = false;

                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).id == deleteId) {
                                students.remove(i);
                                System.out.println("Student deleted successfully!");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Student with ID " + deleteId + " not found.");
                        }
                        break;

                    case 5:
                        System.out.println("Exiting... Thank you!");
                        sc.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        // ✅ Valid integer input method
        public static int getValidInt(Scanner sc) {
            while (true) {
                try {
                    return Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input! Please enter a valid integer: ");
                }
            }
        }

        // ✅ Valid double input method
        public static double getValidDouble(Scanner sc) {
            while (true) {
                try {
                    double value = Double.parseDouble(sc.nextLine());
                    if (value >= 0 && value <= 100) {
                        return value; // ✅ Valid marks
                    } else {
                        System.out.print("Marks must be between 0 and 100. Try again: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input! Please enter valid marks (e.g. 85.5): ");
                }
            }
        }


    }
