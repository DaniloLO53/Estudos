package study.random.OOP.OOP3;

public class Developer extends Employee {
    private Team team;

    public Developer(String name) {
        super(name);
    }

    @Override
    public void presentation() {
        System.out.println("My name is " + this.name);
    }

    @Override
     public float calculateBonus() {
        return this.salary * 0.05f;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
