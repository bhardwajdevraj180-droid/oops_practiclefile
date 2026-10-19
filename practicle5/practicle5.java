
class ComplexNumber {
    double real;
    double imaginary;

    // Constructor
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    ComplexNumber add(ComplexNumber other) {
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;

        return new ComplexNumber(r, i);
    }

    // Method to display a complex number
    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating two complex number objects
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(2, 5);

        // Displaying the original numbers
        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        // Adding the complex numbers
        ComplexNumber sum = c1.add(c2);

        // Displaying the result
        System.out.print("Sum: ");
        sum.display();
    }
}

