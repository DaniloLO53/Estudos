package study.random.OOP3;

public class Manager extends Employee {
    private Team team;

    public Manager(String name) {
        super(name);
    }

    @Override
    public float calculateBonus() {
        return this.salary * 0.1f;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
