package study.random.OOP;

public class Enemy {
    private float attackScore;
    private float defenseScore;
    private String name;
    private String[] weaknesses;

    {

    }

    public Enemy(float attackScore, float defenseScore) {
        this.attackScore = attackScore;
        this.defenseScore = defenseScore;
    }

    public Enemy(float attackScore, float defenseScore, String name) {
        this(attackScore, defenseScore);
        this.name = name;
    }

    public Enemy() {

    }

    public void showInfo(float attackScore) {
        System.out.printf("""
                Attack score: %s
                """, attackScore);
    }

    public void showInfo(float attackScore, float defenseScore) {
        System.out.printf("""
                Attack score: %s
                Defense score: %s
                """, attackScore, defenseScore);
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
