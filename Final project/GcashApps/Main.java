package GcashApps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Accounts ac1 = new Accounts("Marte", 1000.0);

        System.out.println("\n👋 Welcome to GCash Banking, Marte!");
        //System.out.println("Your current balance is: ₱" + ac1.getBalance());

        int choice;
        do {
            
            System.out.println("\nWhat would you like to do today?");
            System.out.println("1️⃣  Deposit Money");
            System.out.println("2️⃣  Withdraw Money");
            System.out.println("3️⃣  Check Balance");
            System.out.println("4️⃣  Exit");
            System.out.print("👉 Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("💰 Enter amount to deposit: ₱");
                    double depositAmount = scanner.nextDouble();
                    ac1.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("🏧 Enter amount to withdraw: ₱");
                    double withdrawAmount = scanner.nextDouble();
                    ac1.withdraw(withdrawAmount);
                    break;

                case 3:
                    ac1.showBalance();
                    break;

                case 4:
                    System.out.println("🙏 Thank you for using GCash Banking. Have a great day!");
                    break;

                default:
                    System.out.println("❌ Please choose a valid option (1-4).");
            }

        } while (choice != 4);

        scanner.close();
    }
}
