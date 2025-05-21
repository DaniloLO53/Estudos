package study.random.OOP.OOP3;

public class Manager extends Employee {
    private Team team;

    public Manager(String name) {
        super(name);
    }

    @Override
    public void presentation() {
        System.out.println("My name is " + this.name);
    }

    @Override
    public float calculateBonus() {
        Developer[] teamDevelopers = team.getDevelopers();

        float developersTotalBonus = 0;
        for (Developer teamDeveloper : teamDevelopers) {
            developersTotalBonus += teamDeveloper.calculateBonus();
        }

        return this.salary * 0.1f + developersTotalBonus * 0.2f;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
