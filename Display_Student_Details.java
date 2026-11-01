import java.util.Scanner;
class Display_Student_Details {
    String name;
    int age;
    String grade;

    void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = scanner.nextLine();
        System.out.print("Enter student's age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student's grade: ");
        grade = scanner.nextLine();
        scanner.close();
    }


    void displayDetails() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Age: " + age);
        System.out.println("Student's Grade: " + grade);
    }

    public static void main(String[] args) {
        Display_Student_Details student = new Display_Student_Details();
        student.inputDetails();
        student.displayDetails();
        
    }
}