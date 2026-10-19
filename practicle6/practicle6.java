public class Main {

    String title;
    String author;
    double price;

    // No-argument constructor
    Main() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Main(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Copy constructor
    Main(Main b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        // No-argument constructor
        Main b1 = new Main();

        // Parameterized constructor
        Main b2 = new Main("Java Programming", "James Gosling", 500.0);

        // Copy constructor
        Main b3 = new Main(b2);

        System.out.println("Book 1 - No-Argument Constructor:");
        b1.display();

        System.out.println("Book 2 - Parameterized Constructor:");
        b2.display();

        System.out.println("Book 3 - Copy Constructor:");
        b3.display();

        // Modify the copied object
        b3.title = "Python Programming";
        b3.price = 600.0;

        System.out.println("After modifying the copied object:");

        System.out.println("Original Book:");
        b2.display();

        System.out.println("Modified Copy:");
        b3.display();
    }
}
