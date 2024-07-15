import java.util.Scanner; //

public class ATM {
    private static final byte CODE = (byte) 1234;
    private static double myBalance = 1000;

    public static double getBalance() {
        return myBalance;
    }

    public static double getSavingBalance() {
        return myBalance / 0.02;
    }

    public static double calcWithdraw(double amount) {
        myBalance -= amount;
        return myBalance;
    }

    public static double calcDeposit(double amount) {
        myBalance += amount;
        return myBalance;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to ActivEdge Technologies ATM");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please input your pin: ");
            byte pin = (byte) scanner.nextInt();
            if (pin == CODE) {
                System.out.println("Pin Correct");
                DisplayMenu mainMenu = new DisplayMenu();
                mainMenu.displayMenu();
                break;
            } else {
                System.out.println("Wrong Pin");
            }
        }

        scanner.close();
    }
}
