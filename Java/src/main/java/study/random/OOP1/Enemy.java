package study.random.OOP1;

public abstract class Enemy {
    protected float health;
    protected EnemyMode mode;
    protected static float attackScore;
    protected static float defenseScore;
    protected static Item[] items;
    protected EnemyHorde horde;
    public static final float MAX_HEALTH = 2000;

    static {
        attackScore = EnemySavedStatus.getAttackScore();
        defenseScore = EnemySavedStatus.getDefenseScore();
    }

    public Enemy() {

    }

    public Enemy(EnemyMode mode) {
        this.mode = mode;
    }

    public Enemy(EnemyMode mode, Item[] items) {
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

    public EnemyMode getMode() {
        return mode;
    }

    public void setMode(EnemyMode mode) {
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
