package session9.homework.bancking_app;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Create account.");
        System.out.println("Insert your name");
        String name = scanner.nextLine();
        Account account = new Account(name, 50);
        driverFunction(account);

    }


    public static void driverFunction(Account account) {
        Scanner scanner = new Scanner(System.in);
        menu();
        String option = scanner.nextLine();

        while (!option.equals("0")) {
            switch (option) {
                case "1" -> {
                    System.out.println("Insert the amount you want to deposit:");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    account.transaction(amount);
                    System.out.println("Account balance: " + account.getAccountBalance());
                }
                case "2" -> {
                    System.out.println("Insert the amount you want to withdraw:");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    amount *= -1;
                    account.transaction(amount);
                    System.out.println("Account balance: " + account.getAccountBalance());
                }
                case "3" -> {
                    account.showTransactions();
                }
                case "4" -> {
                    System.out.println("Account balance: " + account.getAccountBalance());
                }
                default -> System.out.println("Invalid input!");
            }
            menu();
            option = scanner.nextLine();
        }

    }


    public static void menu() {
        System.out.println("MENU");
        System.out.println("0: EXIT PROGRAM.");
        System.out.println("1: Deposit.");
        System.out.println("2: Withdraw.");
        System.out.println("3: View summary of recent transactions.");
        System.out.println("4: Account balance.");
    }
}
