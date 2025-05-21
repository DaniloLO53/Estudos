package study.random.OOP.OOP1;

public class SubBoss extends Enemy {
    private String specialPower;

    public SubBoss(String specialPower) {
        this.specialPower = specialPower;
    }

    public SubBoss(String specialPower, EnemyMode mode, Item[] items) {
        super(mode, items);
        this.specialPower = specialPower;
    }

    @Override
    public void showItems() {
        super.showItems();
        System.out.println("I'm the boss and my attack is: " + SubBoss.getAttackScore());
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }
}
