// Encapsulation: Hiding data and showing only necessary information
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstraction: Showing only necessary information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
