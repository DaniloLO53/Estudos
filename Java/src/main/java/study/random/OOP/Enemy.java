package study.random.OOP;

public class Enemy {
    private float attackScore;
    private float defenseScore;

    public void talk(String message) {
        System.out.println(message);
    }

    public float getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(float attackScore) {
        this.attackScore = attackScore;
    }

    public float getDefenseScore() {
        return defenseScore;
    }

    public void setDefenseScore(float defenseScore) {
        this.defenseScore = defenseScore;
    }
}
