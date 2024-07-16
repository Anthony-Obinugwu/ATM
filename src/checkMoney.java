import java.util.Scanner;

public class checkMoney extends DisplayMenu {

    // Method to display balance options
    static void checkBalance() {
        System.out.println("1. Current Balance");
        System.out.println("2. Saving Balance");
        System.out.println("3. Go Back");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Current Balance: " + ATM.getBalance()); // Displays current balance using ATM.getBalance()
                break;
            case 2:
                System.out.println("Saving Balance: " + ATM.getSavingBalance()); // Display saving balance using ATM.getSavingBalance()
                break;
            case 3:
                return; //Exit method to go back to previous menu
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
