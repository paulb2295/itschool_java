package session9.homework.bancking_app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import static java.lang.Math.abs;

public class Account {

    private final UUID accountId;
    private String accountHolder;
    private double accountBalance;

    private ArrayList<String> transactions = new ArrayList<>();

    public Account(String accountHolder, double accountBalance) {
        this.accountId = UUID.randomUUID();
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public Account() {
        accountId = UUID.randomUUID();
    }

    public UUID getAccountId() {
        return accountId;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void transaction(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            transactions(amount);
        } else if (amount < 0 && abs(amount) <= accountBalance) {
            accountBalance += amount;
            transactions(amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    private void transactions(double amount) {
        StringBuilder transaction = new StringBuilder();
        if (amount > 0) {
            transaction.append("Date o deposit: " + LocalDateTime.now() + "\nAmount: " + amount + "\nCurrent balance: " + accountBalance);
        } else {
            transaction.append("Date o withdraw: " + LocalDateTime.now() + "\nAmount: " + abs(amount) + "\nCurrent balance: " + accountBalance);
        }
        transactions.add(transaction.toString());

    }

    public void showTransactions() {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }


}
