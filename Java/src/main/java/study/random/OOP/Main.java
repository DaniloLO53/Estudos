package study.random.OOP;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Sword");
        Item item2 = new Item("Shield");
        Enemy enemy1 = new SubBoss("Fire");
        Enemy enemy2 = new SubBoss("Ice", EnemyMode.BERSERK, new Item[]{item1});

        EnemyHorde enemyHorde = new EnemyHorde(enemy1, enemy2);

        enemy1.showItems();
    }
}
