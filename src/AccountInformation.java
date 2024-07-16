import java.util.Scanner;

public class AccountInformation extends ATM {
    private String userName = "Mr. Ade David";
    private String cardNumber = "5436218381622812";
    private String cvv = "900";
    private String expiryDate = "12/30";
    private static short CODE = (short) 1234;
    private DisplayMenu displayMenu;

    public AccountInformation() {
        // This is the default constructor
    }

    public AccountInformation(String userName, String cardNumber, String cvv, String expiryDate) {
        // Parameter constructors to initialize account information
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    //Initialising Setters and Getters
    public String getUserName() {
        return userName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public static short getPin() {
        return CODE;
    }

    public static void setPin(short pin) {
        AccountInformation.CODE = pin;
    }

    public void setDisplayMenu(DisplayMenu displayMenu) {
        this.displayMenu = displayMenu;
    }

    // Method to reset PIN
    public void resetPin() {
        Scanner scanner = new Scanner(System.in);
        boolean repeatReset = true; // Using boolean to instantiate while loop name
        while (repeatReset) {
            System.out.println("Enter the last 6 digit of your card number: ");
            String cardLast6Digits = scanner.nextLine();
            System.out.println("Your CVV: ");
            String cardCvv = scanner.nextLine();
            System.out.println("Card Expiry Date (MM/YY): ");
            String expiry = scanner.nextLine();

            // Validating card details before allowing PIN reset
            String last6Digits = cardNumber != null ? cardNumber.substring(cardNumber.length() - 6) : ""; // Reading the last six digits of the card number
            if (cardLast6Digits.equals(last6Digits) && cardCvv.equals(this.cvv) && expiry.equals(this.expiryDate)) { // Making sure the card details are validated before user can reset pin
                System.out.println("Enter New Pin: ");
                String newPin = scanner.nextLine();
                System.out.println("Confirm new Pin: ");
                String confirmPin = scanner.nextLine();

                try {
                    short newPinShort = Short.parseShort(newPin);
                    short confirmPinShort = Short.parseShort(confirmPin);

                    if (newPinShort == confirmPinShort) {
                        CODE = newPinShort;
                        System.out.println("Pin successfully reset.");
                    } else {
                        System.out.println("New Pin must match Confirm Pin.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid PIN format. Please enter a numeric value.");
                }
            } else {
                System.out.println("Card details do not match.");
            }
            System.out.println("\nWould you like to change this pin again?: (Yes/No) "); // Check if the user wants to repeat PIN reset
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase("Yes")) { // Return to main menu after PIN reset
                repeatReset = true;
            }
        }  if (displayMenu != null) {
            displayMenu.displayMenu();
        }
    }

    // Method to change PIN
    public void changePin() {
        Scanner scanner = new Scanner(System.in);
        boolean repeatReset = true;
        while (repeatReset) {
            System.out.println("Enter current Pin: ");
            String currentPin = scanner.nextLine();
            if (currentPin.equals(String.valueOf(CODE))) { // Using .equals(String.valueof()) to make sure inputted pin matches current set pin
                System.out.println("Enter new Pin: ");
                String newPin = scanner.nextLine();
                System.out.println("Confirm new Pin: ");
                String confirmPin = scanner.nextLine();
                try {
                    short newPinShort = Short.parseShort(newPin);
                    short confirmPinShort = Short.parseShort(confirmPin);

                    if (newPinShort == confirmPinShort) {
                        CODE = newPinShort;
                        System.out.println("Pin successfully changed.");
                    } else {
                        System.out.println("New Pin must match Confirm Pin.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid PIN format. Please enter numeric value only.");
                }
            } else {
                System.out.println("Current Pin is incorrect.");
            }
            System.out.println("\nWould you like to change this pin again?: (Yes/No) ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase("Yes")) { // Check if the user wants to repeat PIN change
                repeatReset = true;
            }
        } if (displayMenu != null) { // Return to main menu after PIN change
            displayMenu.displayMenu();
        }
    }
        public void displayAccountInformation() { // Method to display all user details
            System.out.println("User Name: " + userName);
            System.out.println("Account Number: " + cardNumber);
            System.out.println("CVV: " + cvv);
            System.out.println("Expiry Date: " + expiryDate);
        }
    }
