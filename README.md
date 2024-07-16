Project Overview
A basic ATM with regular functionalities.

Classes and Explanations
ATM.java
Purpose:
Manages ATM operations such as PIN verification, balance checking, withdrawal, and deposit.
Key Methods:
getBalance(): Returns the current account balance.
getSavingBalance(): Returns the saving balance (assuming 2% interest).
calcWithdraw(double amount): Deducts amount from myBalance.
calcDeposit(double amount): Adds amount to myBalance.

main(String[] args): Entry point for the ATM system, handles PIN verification and displays the main menu.
DisplayMenu.java
Purpose:
Displays the main menu options for the ATM system and routes user choices to appropriate actions.
Key Methods:
displayMenu(): Displays the main menu options and handles user choices.
Menu options include checking balance, withdrawing money, depositing money, buying data, buying credit, resetting PIN, changing PIN, and exiting.

AccountInformation.java
Purpose:
Manages account-related information such as user name, card details, and PIN operations.

Key Methods:
resetPin(): Resets the PIN after verifying card details.
changePin(): Changes the current PIN after verification.
displayAccountInformation(): Displays the user's account information.

checkMoney.java
Purpose:
Provides methods to check account balances.

Key Methods:
checkBalance(): Displays current and savings balances based on user selection.
takeMoney.java
Purpose:
Handles the process of withdrawing money from the ATM.

Key Methods:
withdraw(): Allows the user to select predefined or custom withdrawal amounts, verifies balance, and updates account balance accordingly.
AddMoney.java
Purpose:
Handles the process of depositing money into the ATM.

Key Methods:
deposit(): Prompts the user for the amount to deposit, verifies non-negative input, and updates account balance.
RechargeLine.java
Purpose:
Provides methods for buying data and credit for mobile lines.

Key Methods:
buyData(): Allows the user to select data packages and deducts the corresponding amount from the account balance.
buyCredit(): Allows the user to select credit amounts and deducts the corresponding amount from the account balance.
credit(String number): Determines the mobile network provider based on the first four digits of the phone number.

Usage
Copy the code into your respective IDE then run it (dont forget to import the necessary JAVA dependencies!)

Notes
This was assignemnt from my CTO at the company im interning - it was fun and not fun to do, but i'm glad i finished (with version 2 anyway).
