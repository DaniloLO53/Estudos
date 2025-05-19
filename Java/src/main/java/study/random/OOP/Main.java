package study.random.OOP;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Sword");
        Item item2 = new Item("Shield");
        Enemy enemy1 = new Enemy('A', new Item[]{item1, item2});
        Enemy enemy2 = new Enemy('B', new Item[]{item1});

        EnemyHorde enemyHorde = new EnemyHorde(enemy1, enemy2);

        enemy1.showItems();
    }
}
