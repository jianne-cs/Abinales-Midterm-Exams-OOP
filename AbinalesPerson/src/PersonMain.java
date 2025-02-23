public class PersonMain {
    public static void main(String[] args) {
        // Create instances of the Employee class
        Employee zayne = new Employee("Zayne", 25, "Captain");
        Employee xavier = new Employee("Xavier", 30, "Engineer");
        Employee caleb = new Employee("Caleb", 20, "Pilot");
        Employee sylus = new Employee("Sylus", 28, "Navigator");
        Employee rafayel = new Employee("Rafayel", 22, "Communications Officer");

        // Display their information
        zayne.displayEmployeeInfo();
        xavier.displayEmployeeInfo();
        caleb.displayEmployeeInfo();
        sylus.displayEmployeeInfo();
        rafayel.displayEmployeeInfo();
    }
}
