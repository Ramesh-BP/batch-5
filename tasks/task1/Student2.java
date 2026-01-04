
import java.util.Scanner;

class Student2 {
    int id;
    String name;
    int marks;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();

        sc.nextLine(); 
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void printGrade() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);

        if (marks >= 90) {
            System.out.println("Grade : A");
        } else if (marks >= 75) {
            System.out.println("Grade : B");
        } else if (marks >= 60) {
            System.out.println("Grade : C");
        } else if (marks >= 40) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F (Fail)");
        }
    }

    public static void main(String[] args) {
        Student2 s = new Student2();
        s.getDetails();
        s.printGrade();
    }
}
