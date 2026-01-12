
class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.dept = department;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display Employee
    public void display() {
        System.out.println("\t" + id + "\t" + name + "\t" + dept + "\t" + salary);
    }
}
