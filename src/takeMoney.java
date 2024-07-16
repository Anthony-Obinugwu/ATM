import java.util.InputMismatchException;
import java.util.Scanner;

public class takeMoney extends DisplayMenu {

    // Method to handle the withdrawal process
    static void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the amount to withdraw:");
        System.out.println("1. N200");
        System.out.println("2. N500");
        System.out.println("3. N1000");
        System.out.println("4. Custom amount");
        int choice = input.nextInt();
        double amount = 0; //Variable to store the withdrawal amount

        switch (choice) { // Switch statement to determine the amount based on user's choice
            case 1:
                amount = 200;
                break;
            case 2:
                amount = 500;
                break;
            case 3:
                amount = 1000;
                break;
            case 4:
                System.out.print("Enter the custom amount: ");
                amount = input.nextDouble();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                return;
        }

        // Try block to handle withdrawal logic and potential exceptions
        try {
            System.out.println("\nCurrent Account Balance: " + ATM.getBalance());
            if ((ATM.getBalance() - amount) >= 0 && amount >= 0) { // Check if sufficient balance and the amount to withdraw is non-negative
                ATM.calcWithdraw(amount);
                System.out.println("\nYour new account balance: " + ATM.getBalance());
            } else {
                System.out.println("\nInsufficient balance.");
            }
        } catch (InputMismatchException e) {
            System.out.println("\nInvalid input. Please enter a valid amount.");
            input.next();
        }
    }
}
