import java.util.HashMap; // The utility for the mapping function below
import java.util.InputMismatchException;
import java.util.Map; // The utility for the mapping function below
import java.util.Scanner;

public class RechargeLine extends DisplayMenu {
    // Method to buy data
    public void buyData() {
        Scanner scanner = new Scanner(System.in);
        boolean repeatTransaction = true; // Using boolean to instantiate while loop name
        while (repeatTransaction) {
            System.out.println("Please enter recipient's phone number: ");
            String number = scanner.nextLine();

            // Determines the telecom line associated with the phone number
            String line = credit(number);
            System.out.println("This is an " + line + " number, do you wish to proceed? (Yes/No) ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Yes")) { //using .equalsIgnoreCase to not return an error if user does not use right case
                Scanner input = new Scanner(System.in);
                System.out.println("How much would you like to buy: ");
                System.out.println("1. N100 - 200MB");
                System.out.println("2. N500 - 1.0GB");
                System.out.println("3. N1000 - 3.0GB");
                System.out.println("4. Custom amount");
                int choice = input.nextInt();
                double amount = 0;
                switch (choice) { // Implementing switch case to handle user input
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
                }
                try {
                    if ((ATM.getBalance() - amount) >= 0 && amount >= 0) { // To check if there is enough balance and the amount is valid
                        ATM.calcWithdraw(amount);
                        System.out.println("\nYour new account balance: " + ATM.getBalance());
                        System.out.println("The" + credit(number) + " line has been successfully credited with " + amount + " worth of data.");
                    } else {
                        System.out.println("\nInsufficient balance.");
                    }
                } catch (InputMismatchException e) { // Catches error (anything that is not an integer) then throws statement.
                    System.out.println("\nInvalid input. Please enter a valid amount.");
                    input.next();
                }
            } else {
                System.out.println("Cancelled");
            }
            System.out.println("\nWould you like to repeat this transaction?: (Yes/No) ");
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("Yes")) { //using .equalsIgnoreCase to not return an error if user does not use right case
                repeatTransaction = true;
            } else {
                return;
            }
        }
    }

    public void buyCredit() {
        Scanner scanner = new Scanner(System.in);
        boolean repeatTransaction = true; // Using boolean to instantiate while loop name
        while (repeatTransaction) {
            System.out.println("Please enter receipent's phone number: ");
            String number = scanner.nextLine();

            // Determine the telecom line associated with the phone number
            String line = credit(number);
            System.out.println("This is an " + line + " number, do you wish to proceed? (Yes/No) ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Yes")) { //using .equalsIgnoreCase to not return an error if user does not use right case
                Scanner input = new Scanner(System.in);
                System.out.println("How much would you like to buy: ");
                System.out.println("1. N100");
                System.out.println("2. N500");
                System.out.println("3. N1000");
                System.out.println("4. Custom amount");
                int choice = input.nextInt();
                double amount = 0;
                switch (choice) { // Implementing switch case to handle user input
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
                }
                try {
                    if ((ATM.getBalance() - amount) >= 0 && amount >= 0) { // To check if there is enough balance and the amount is valid
                        ATM.calcWithdraw(amount);
                        System.out.println("\nYour new account balance: " + ATM.getBalance());
                        System.out.println("The" + credit(number) + " line has been successfully credited with " + amount + " naira worth of credit.");
                    } else {
                        System.out.println("\nInsufficient balance.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nInvalid input. Please enter a valid amount.");
                    input.next();
                }
            } else {
                System.out.println("Cancelled");
            }
            System.out.println("\nWould you like to repeat this transaction?: (Yes/No) ");
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("Yes")) { //using .equalsIgnoreCase to not return an error if user does not use right case
                repeatTransaction = true;
            } else {
                return;
            }
        }
    }
    private static Map<String, String> CreditLine() { // Method to map telecom prefixes to their corresponding network names
        Map<String, String> credit = new HashMap<>();
        credit.put("0703", "MTN");
        credit.put("0706", "MTN");
        credit.put("0803", "MTN");
        credit.put("0806", "MTN");
        credit.put("0810", "MTN");
        credit.put("0813", "MTN");
        credit.put("0814", "MTN");
        credit.put("0816", "MTN");
        credit.put("0903", "MTN");
        credit.put("0906", "MTN");
        credit.put("0913", "MTN");
        credit.put("0916", "MTN");
        credit.put("0705", "Glo");
        credit.put("0805", "Glo");
        credit.put("0807", "Glo");
        credit.put("0811", "Glo");
        credit.put("0815", "Glo");
        credit.put("0905", "Glo");
        credit.put("0915", "Glo");
        credit.put("0701", "Airtel");
        credit.put("0708", "Airtel");
        credit.put("0802", "Airtel");
        credit.put("0808", "Airtel");
        credit.put("0812", "Airtel");
        credit.put("0907", "Airtel");
        credit.put("0912", "Airtel");
        credit.put("0809", "Etisalat");
        credit.put("0817", "Etisalat");
        credit.put("0818", "Etisalat");
        credit.put("0909", "Etisalat");
        credit.put("0908", "Etisalat");
        return credit;
    }

    public static String credit(String number) { // Method to identify the telecom line based on the phone number prefix
        if (number.length() != 11) { // Condition making sure the number is 11 digits
            return "Number must be equal to 11 digits";
        }
        String digits = number.substring(0, 4); // .substring used to scan the first 4 digits of user input
        Map<String, String> credit = CreditLine();
        String line = credit.get(digits);
            if (line != null) {
                return line;
            } else {
                return " unable to retrieve line";
            }
    }
}
