
    import java.util.Scanner;

//BankAccount class to store account balance
class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
    
     balance += amount;
 }

 public boolean withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         return true; // Successful withdrawal
     } else {
         return false; // Insufficient balance
     }
 }
}

//ATM class to interact with the user
public class ATM {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Create a bank account with an initial balance
     BankAccount account = new BankAccount(1000.0);

     System.out.println("Welcome to the ATM!");
     System.out.println("1. Check Balance");
     System.out.println("2. Deposit");
     System.out.println("3. Withdraw");
     System.out.println("4. Exit");

     while (true) {
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.println("Your balance: $" + account.getBalance());
                 break;
             case 2:
                 System.out.print("Enter deposit amount: $");
                 double depositAmount = scanner.nextDouble();
                 account.deposit(depositAmount);
                 System.out.println("Deposit successful!");
                 break;
             case 3:
                 System.out.print("Enter withdrawal amount: $");
                 double withdrawalAmount = scanner.nextDouble();
                 if (account.withdraw(withdrawalAmount)) {
                     System.out.println("Withdrawal successful!");
                 } else {
                     System.out.println("Insufficient balance.");
                 }
                 break;
             case 4:
                 System.out.println("Thank you for using the ATM!");
                 scanner.close();
                 System.exit(0);
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
 }
}


