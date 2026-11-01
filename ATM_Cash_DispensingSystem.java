import java.util.Scanner;

public class ATM_Cash_DispensingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 10000.0; // Initial balance
        String pin = "1234"; // Default PIN

        System.out.println("Welcome to ATM Cash Dispensing System");
        System.out.print("Enter your PIN: ");
        String enteredPin = scanner.nextLine();

        if (!pin.equals(enteredPin)) {
            System.out.println("Invalid PIN. Exiting...");
            return;
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: Rs." + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    if (amount > balance) {
                        System.out.println("Insufficient balance.");
                    } else if (amount <= 0) {
                        System.out.println("Invalid amount.");
                    } else {
                        balance -= amount;
                        System.out.println("Withdrawal successful. Dispensed Rs. " + amount);
                        System.out.println("Remaining balance: Rs. " + balance);
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
