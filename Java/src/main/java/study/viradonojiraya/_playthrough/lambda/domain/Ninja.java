package study.viradonojiraya._playthrough.lambda.domain;

import study.viradonojiraya._playthrough.lambda.enums.Village;
import study.viradonojiraya._playthrough.lambda.interfaces.Fighter;

public class Ninja extends Character implements Fighter {
    protected long attack;
    protected long defense;

    public Ninja(String name, int age, Village village) {
        super(name, age, village);
    }

    public Ninja(String name, int age, Village village, int attack, int defense) {
        super(name, age, village);
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public long attack() {
        System.out.println("Attacked");
        return this.attack;
    }

    @Override
    public void defend(int attackPoint) {
        System.out.println("Defended");
        System.out.println("Damage: " + (attackPoint - this.defense));
    }

    public long getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public long getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
