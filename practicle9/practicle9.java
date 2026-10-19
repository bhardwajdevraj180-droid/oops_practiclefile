public class Main {

    String name;
    double salary;

    // Static variable to count employees
    static int count = 0;

    // No-argument constructor
    Main() {
        this("Unknown", 0.0);
    }

    // Parameterized constructor
    Main(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }
a
    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: Rs. " + this.salary);
        System.out.println();
    }

    // Static method to display employee count
    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }

    public static void main(String[] args) {

        // Creating objects
        Main e1 = new Main();
        Main e2 = new Main("Rahul", 25000);
        Main e3 = new Main("Aman", 30000);

        // Display employee details
        System.out.println("Employee 1:");
        e1.display();

        System.out.println("Employee 2:");
        e2.display();

        System.out.println("Employee 3:");
        e3.display();

        // Display total employee count
        displayCount();
    }
}

