package study.viradonojiraya.day4.domain;

public class Player {
    private String name;
    private Team team;

    public void presentation() {
        System.out.printf("""
                Name: %s
                Team: %s
                """, this.name, this.team != null ? this.team.getName() : "No team");
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

