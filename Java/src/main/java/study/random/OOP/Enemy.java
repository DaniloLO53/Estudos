package study.random.OOP;

public class Enemy {
    private float health = 5000;
    private char mode;
    private static float attackScore;
    private static float defenseScore;
    private static Item[] items;
    private EnemyHorde horde;

    static {
        attackScore = EnemySavedStatus.getAttackScore();
        defenseScore = EnemySavedStatus.getDefenseScore();
    }

    public Enemy() {

    }

    public Enemy(char mode) {
        this.mode = mode;
    }

    public Enemy(char mode, Item[] items) {
        this(mode);
        Enemy.items = items;
    }

    public void showItems() {
        if (items != null) {
            for (Item item : items) {
                System.out.println(item.getName());
            }
        } else {
            System.out.println("NONE");
        }
    }

    public EnemyHorde getHorde() {
        return horde;
    }

    public void setHorde(EnemyHorde horde) {
        this.horde = horde;
    }

    public static Item[] getItems() {
        return items;
    }

    public static void setItems(Item[] items) {
        Enemy.items = items;
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
        this.mode = mode;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public static float getAttackScore() {
        return attackScore;
    }

    public static void setAttackScore(float attackScore) {
        Enemy.attackScore = attackScore;
    }

    public static float getDefenseScore() {
        return defenseScore;
    }

    public static void setDefenseScore(float defenseScore) {
        Enemy.defenseScore = defenseScore;
    }
}
