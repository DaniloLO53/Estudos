package study.viradonojiraya._playthrough.lambda.domain;

import study.viradonojiraya._playthrough.lambda.enums.Village;

abstract public class Character {
    protected String name;
    protected int age;
    protected Village village;

    public Character(String name, int age, Village village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    public void walk() {
        System.out.println(this.name + " is walking...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }
}
