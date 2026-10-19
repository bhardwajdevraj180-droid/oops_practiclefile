public class Main implements AutoCloseable {

    // Constructor
    Main() {
        System.out.println("Object has been created.");
    }

    // Method to use the object
    void display() {
        System.out.println("Object is being used.");
    }

    // Deterministic cleanup; called automatically by try-with-resources.
    @Override
    public void close() {
        System.out.println("Object has been closed.");
    }

    public static void main(String[] args) {
        try (Main obj = new Main()) {
            obj.display();
        }
    }
}
