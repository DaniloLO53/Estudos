package study.random.OOP;

public class Main {
    public static void modifyEnemy(Enemy enemy) {
        enemy.setAttackScore(1000);
    }

    public static void modifyInt(int integer) {
        integer = 10;
    }

    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        Enemy enemy2 = enemy;
        System.out.println(enemy2.getAttackScore());
        modifyEnemy(enemy);

        int points = 100;
        modifyInt(points);

        System.out.println(enemy2.getAttackScore());
        System.out.println(points);
    }
}
