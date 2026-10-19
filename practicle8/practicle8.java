public class Main {
    String productName;
    double price;
    int quantity;

    // 1. No-argument constructor
    Main() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    // 2. Constructor with product name only
    Main(String name) {
        productName = name;
        price = 0.0;
        quantity = 0;
    }

    // 3. Constructor with product name and price
    Main(String name, double p) {
        productName = name;
        price = p;
        quantity = 0;
    }

    // 4. Constructor with all three fields
    Main(String name, double p, int q) {
        productName = name;
        price = p;
        quantity = q;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Rs. " + calculateTotalCost());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        // Object using no-argument constructor
        Main p1 = new Main();

        // Object using product name constructor
        Main p2 = new Main("Laptop");

        // Object using product name and price constructor
        Main p3 = new Main("Mobile", 15000.0);

        // Object using all three fields
        Main p4 = new Main("Headphones", 1000.0, 3);

        System.out.println("Product 1: No-Argument Constructor");
        p1.display();

        System.out.println("Product 2: Name Constructor");
        p2.display();

        System.out.println("Product 3: Name and Price Constructor");
        p3.display();

        System.out.println("Product 4: All-Fields Constructor");
        p4.display();
    }
}


