package study.random.OOP.OOP1;

public class EnemyHorde {
    private Enemy[] horde;

    public EnemyHorde(Enemy... enemies) {
        this.horde = enemies;
    }

    public Enemy[] getHorde() {
        return horde;
    }

    public void setHorde(Enemy[] horde) {
        this.horde = horde;
    }
}
