package study.viradonojiraya._legacy.days.review.domain.client;

import study.viradonojiraya._legacy.days.review.domain.bankAccount.BankAccount;
import study.viradonojiraya._legacy.days.review.domain.person.Person;

public class Client extends Person {
    protected BankAccount bankAccount;

    public Client(String name, int age) {
        super(name, age);
    }

    public Client(String name, int age, BankAccount bankAccount) {
        this(name, age);
        this.bankAccount = bankAccount;
    }

    @Override
    public void report() {
        System.out.printf("""
                Name: %s
                Balance: %f
                """, this.name, this.bankAccount.getBalance());
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
