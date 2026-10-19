public class Main {

    // Private data members
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    Main(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdrawal method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: Rs. " + amount);
        }
    }

    // Display account details
    public void display() {
        System.out.println("\nAccount Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Current Balance: Rs. " + getBalance());
    }

    public static void main(String[] args) {

        // Creating a bank account
        Main account = new Main("Rahul", "1234567890", 5000);

        // Display initial details
        System.out.println("Initial Account Details:");
        account.display();

        // Valid deposit
        System.out.println("\n--- Testing Transactions ---");
        account.deposit(2000);

        // Invalid negative deposit
        account.deposit(-500);

        // Valid withdrawal
        account.withdraw(1000);

        // Invalid zero withdrawal
        account.withdraw(0);

        // Invalid negative withdrawal
        account.withdraw(-200);

        // Withdrawal greater than balance
        account.withdraw(10000);

        // Display final balance
        System.out.println("\nFinal Account Details:");
        account.display();
    }
}

