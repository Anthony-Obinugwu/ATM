import java.util.Scanner;

public class DisplayMenu extends ATM {
    public void displayMenu() { // Method to display the ATM menu and handle user choices
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Add Money");
            System.out.println("4. Buy Data");
            System.out.println("5. Buy Credit");
            System.out.println("6. Reset Pin");
            System.out.println("7. Change Pin");
            System.out.println("8. Exit ATM");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // Creating instances for necessary classes
            RechargeLine rechargeLine = new RechargeLine();
            AccountInformation accountInfo;
            accountInfo = new AccountInformation();

            switch (choice) { // Implementing switch case to handle user input
                case 1:
                    checkMoney.checkBalance(); // call method to check user balance
                    break;
                case 2:
                    takeMoney.withdraw(); // call method to withdraw from user current balance
                    break;
                case 3:
                    AddMoney.deposit(); // call method to deposit into user balance
                    break;
                case 4:
                    rechargeLine.buyData();
                    break;
                case 5:
                    rechargeLine.buyCredit();
                    break;
                case 6:
                    accountInfo.setDisplayMenu(this); // set display menu reference in AccountInformation
                    accountInfo.resetPin();
                    break;
                case 7:
                    accountInfo.setDisplayMenu(this); // set display menu reference in AccountInformation
                    accountInfo.changePin();
                    break;
                case 8:
                    System.out.println("Thank you for using our ATM. Goodbye.");
                    return; // exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
