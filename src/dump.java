//import java.util.InputMismatchException;
//
//class dump extends ATM {
//    public dump(double checkBalance) {
//        super(checkBalance);
//    }
//
//    public void withdraw() {
//        boolean end = false;
//        while (!end) {
//            try {
//                System.out.println("\nCurrent Account Balance: " + myBalance);
//                System.out.print("\nAmount you want to withdraw from Checkings Account: ");
//                double amount = scanner.nextDouble();
//                if (( - amount) >= 0 && amount >= 0) {
//                    calcWithdraw(amount);
//                    System.out.println("\nYour new account balance: " + myBalance);
//                    end = true;
//                } else {
//                    System.out.println("\nBalance Cannot be Negative.");
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("\nInvalid Choice.");
//                scanner.next();
//            }
//        }
//    }
//}
