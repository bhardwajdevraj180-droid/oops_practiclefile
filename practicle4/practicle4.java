
class Calculator {

    // Method overloading: two integer arguments
    int add(int a, int b) {
        return a + b;
    }

    // Method overloading: three integer arguments
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading: two double arguments
    double add(double a, double b) {
        return a + b;
    }
}

// Base class
class Employee {
    double calculatePay() {
        return 0.0;
    }
}

// First derived class
class FullTimeEmployee extends Employee {
    double calculatePay() {
        return 50000.0;
    }
}

// Second derived class
class PartTimeEmployee extends Employee {
    double calculatePay() {
        return 20000.0;
    }
}

public class Main {
    public static void main(String[] args) {

        // Method Overloading
        System.out.println("=== Method Overloading ===");

        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: "
                + calc.add(10, 20));

        System.out.println("Sum of three integers: "
                + calc.add(10, 20, 30));

        System.out.println("Sum of two doubles: "
                + calc.add(5.5, 4.5));

        // Method Overriding
        System.out.println("\n=== Method Overriding ===");

        Employee emp;

        emp = new FullTimeEmployee();
        System.out.println("Full-time Employee Pay: "
                + emp.calculatePay());

        emp = new PartTimeEmployee();
        System.out.println("Part-time Employee Pay: "
                + emp.calculatePay());
    }
}

