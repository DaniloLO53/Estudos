package study.random.OOP.OOP3;

public class Main {

    public static void main(String[] args) {
        Team team = new Team();
        Manager manager = new Manager("Danilo");
        Developer developer1 = new Developer("Matheus");
        Developer developer2 = new Developer("Marcos");

        team.setManager(manager);
        manager.setTeam(team);

        team.setDevelopers(developer1, developer2);
        developer1.setTeam(team);
        developer2.setTeam(team);

        manager.setSalary(6000);
        developer1.setSalary(4000);
        developer2.setSalary(5000);

        System.out.println("Developer 1 bonus: " + developer1.calculateBonus());
        System.out.println("Developer 2 bonus: " + developer2.calculateBonus());
        System.out.println("Manager bonus: " + manager.calculateBonus());
    }
}
