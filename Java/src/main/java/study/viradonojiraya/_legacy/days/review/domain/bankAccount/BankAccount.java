package study.viradonojiraya._legacy.days.review.domain.bankAccount;

import study.viradonojiraya._legacy.days.review.domain.client.Client;
import study.viradonojiraya._legacy.days.review.domain.interfaces.Information;

public class BankAccount implements Information {
    private double balance;
    private Client owner;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void report() {
        System.out.printf("""
                Owner: %s
                Balance: %f
                """, this.owner.getName(), this.balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Your account balance now is: " + this.balance);
    }

    public void withDraw(double amount) {
        this.balance -= amount;
        System.out.println("Your account balance now is: " + this.balance);
    }
}
