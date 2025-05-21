package study.random.OOP.OOP1;

public class EnemySavedStatus {
    private static float attackScore;
    private static float defenseScore;

    public static float getAttackScore() {
        return attackScore;
    }

    public static void setAttackScore(float attackScore) {
        EnemySavedStatus.attackScore = attackScore;
    }

    public static float getDefenseScore() {
        return defenseScore;
    }

    public static void setDefenseScore(float defenseScore) {
        EnemySavedStatus.defenseScore = defenseScore;
    }
}

