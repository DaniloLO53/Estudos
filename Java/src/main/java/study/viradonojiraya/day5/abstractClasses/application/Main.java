package study.viradonojiraya.day5.abstractClasses.application;

import study.viradonojiraya.day5.abstractClasses.domain.Employee;
import study.viradonojiraya.day5.abstractClasses.domain.Manager;
import study.viradonojiraya.day5.abstractClasses.domain.enums.Bonus;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Cássia", 5000);
        Bonus bonus = Bonus.getBonusByBonusType("MERIT");
        System.out.println(bonus);
    }
}
