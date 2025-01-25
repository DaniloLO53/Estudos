package study.viradonojiraya.threads.test;

import study.viradonojiraya.threads.domain.Account;

public class ThreadAccountTest implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) throws InterruptedException {
        ThreadAccountTest threadAccountTest = new ThreadAccountTest();
        Thread t1 = new Thread(threadAccountTest, "Danilo");
        Thread t2 = new Thread(threadAccountTest, "Cássia");

        // If withdraw was not synchronized, we'd had a synchronism problem. The synchronized locks the method until
        // it's fully executed
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10);
            if (account.getBalance() < 0) {
                System.out.println("No money!");
            }
        }
    }

    private synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " withdrawing...");
        if(account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " withdraw successful. Current balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
