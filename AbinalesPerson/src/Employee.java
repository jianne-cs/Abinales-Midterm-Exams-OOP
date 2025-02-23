// Inheritance: Creating a subclass
public class Employee extends Person {
    private String department;

    // Constructor
    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Getter method
    public String getDepartment() {
        return department;
    }

    // Abstraction: Showing only necessary information
    public void displayEmployeeInfo() {
        displayInfo();
        System.out.println("Department: " + department);
    }
}
