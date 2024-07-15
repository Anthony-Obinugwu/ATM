import java.util.Scanner;

public class DisplayMenu extends ATM {
    public void displayMenu() {
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Add Money");
            System.out.println("4. Buy Data");
            System.out.println("5. Buy Credit");
            System.out.println("Exit ATM");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            RechargeLine rechargeLine = new RechargeLine();
            switch (choice) {
                case 1:
                    checkMoney.checkBalance();
                    break;
                case 2:
                    takeMoney.withdraw();
                    break;
                case 3:
                    AddMoney.deposit();
                    break;
                case 4:
                    rechargeLine.buyData();
                    break;
                case 5:
                    rechargeLine.buyCredit();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
