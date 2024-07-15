import java.util.InputMismatchException;
import java.util.Scanner;

public class AddMoney extends DisplayMenu {
    static void deposit() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Current Account Balance: " + ATM.getBalance());
            System.out.print("Amount you want to deposit: ");
            double amount = input.nextDouble();
            if (amount >= 0) {
                ATM.calcDeposit(amount);
                System.out.println("Current Account Balance: " + ATM.getBalance());
            } else {
                System.out.println("Deposit amount cannot be negative.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid amount.");
            input.next();
        }
    }
}
