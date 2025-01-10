package study.viradonojiraya.day7.review.domain.client;

import study.viradonojiraya.day7.review.domain.bankAccount.BankAccount;

public class PremiumClient extends Client {
    private double credit;

    public PremiumClient(String name, int age) {
        super(name, age);
    }

    public PremiumClient(String name, int age, BankAccount bankAccount) {
        super(name, age, bankAccount);
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
