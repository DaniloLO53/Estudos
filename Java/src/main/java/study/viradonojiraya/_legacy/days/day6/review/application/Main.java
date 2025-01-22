package study.viradonojiraya._legacy.days.day6.review.application;

import study.viradonojiraya._legacy.days.day6.review.domain.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Cássia", 27);

        System.out.println("Manager contract type: " + Manager.contractType);
    }
}
