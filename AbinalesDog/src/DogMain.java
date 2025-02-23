public class DogMain {
    public static void main(String[] args) {
        // Create instances of the Dog class
        Dog shihTzu = new Dog("Patchi", "Shih Tzu");
        Dog chowChow = new Dog("Onslaught", "Chow Chow");

        // Display their information
        System.out.println("Shih Tzu Information:");
        shihTzu.displayInfo();
        shihTzu.displayInfo("Joel Abinales");
        System.out.println(shihTzu.toString());

        System.out.println("\nChow Chow Information:");
        chowChow.displayInfo();
        chowChow.displayInfo("Lilibeth Abinales");
        System.out.println(chowChow.toString());
    }
}
