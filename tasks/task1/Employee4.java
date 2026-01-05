
import java.util.Scanner;

class Employee4 {
    String name;
    double salary;

    Employee4(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    
    void incSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Employee Name");
        String name=sc.next();
        System.out.println("Enter Emp salary");
        double salary=sc.nextDouble();

        Employee4 emp = new Employee4(name,salary);

        System.out.println("Salary before increase: " + emp.salary);
        emp.incSalary(10); // Increase by 10%
        System.out.println("Salary after increase: " + emp.salary);
    }
}
