
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Multiple inheritance using interfaces
class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Base class
class Machine {
    void powerOn() {
        System.out.println("Machine is powered on.");
    }
}

// Derived class implementing an interface
class SmartPrinter extends Machine implements Printable, Scannable {

    public void print() {
        System.out.println("SmartPrinter is printing...");
    }

    public void scan() {
        System.out.println("SmartPrinter is scanning...");
    }

    void connectToWiFi() {
        System.out.println("SmartPrinter connected to Wi-Fi.");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Multiple Inheritance Using Interfaces ===");
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        System.out.println("\n=== Hybrid Inheritance ===");
        SmartPrinter smartPrinter = new SmartPrinter();
        smartPrinter.powerOn();
        smartPrinter.print();
        smartPrinter.scan();
        smartPrinter.connectToWiFi();
    }
}

