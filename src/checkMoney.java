import java.util.Scanner;

public class checkMoney extends DisplayMenu {
    static void checkBalance() {
        System.out.println("1. Current Balance");
        System.out.println("2. Saving Balance");
        System.out.println("3. Go Back");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Current Balance: " + ATM.getBalance());
                break;
            case 2:
                System.out.println("Saving Balance: " + ATM.getSavingBalance());
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
