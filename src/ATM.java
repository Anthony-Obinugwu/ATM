import java.util.Scanner; //

public class ATM {
    // Static variables for ATM functionality
    private static short CODE = (short) 1234; // Static pin code for accessing the ATM
    private static double myBalance = 10000; // Static variable to store the ATM's balance

    public static double getBalance() {
        return myBalance;
    } // Method to retrieve current balance

    public static double getSavingBalance() { // Method to calculate savings balance (assuming interest rate of 2%) (subject to change in version 3)
        return myBalance / 0.02;
    }

    public static double calcWithdraw(double amount) { // Method for withdrawal from the ATM
        myBalance -= amount;
        return myBalance;
    }

    public static double calcDeposit(double amount) { // Method for deposit into the ATM
        myBalance += amount;
        return myBalance;
    }
    // Main method for the ATM
    public static void main(String[] args) {
        System.out.println("Welcome to ActivEdge Technologies ATM");
        Scanner scanner = new Scanner(System.in);

        // Loop to prompt user for PIN until correct PIN is entered
        while (true) {
            System.out.print("Please input your pin: ");
            short pin = (short) scanner.nextInt();
            if (pin == CODE) {
                System.out.println("Pin Correct");
                DisplayMenu mainMenu = new DisplayMenu();
                mainMenu.displayMenu(); // Displays the main menu for the ATM operations
                break; // Exit loop once correct PIN is entered
            } else {
                System.out.println("Wrong Pin");
            }
        }
        scanner.close(); // Closes the scanner
    }
}
