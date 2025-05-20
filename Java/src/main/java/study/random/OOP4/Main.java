package study.random.OOP4;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();

        developer.setName("Danilo");
        developer.setSalary(2000);

        manager.setName("Carlos");
        manager.setSalary(3000);

        System.out.println(manager.calculateBonus());
        System.out.println(developer.calculateBonus());

        developer.showNicePhrase();
    }
}
