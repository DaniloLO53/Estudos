package study.random.OOP3;

public class Team {
    private Manager manager;
    private Developer[] developers;

    public Team() {
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Developer[] getDevelopers() {
        return developers;
    }

    public void setDevelopers(Developer[] developers) {
        this.developers = developers;
    }
}
