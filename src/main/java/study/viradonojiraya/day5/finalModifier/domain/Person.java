package study.viradonojiraya.day5.finalModifier.domain;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // if we use "public final", this method couldn't be overwritten anymore
    public void presentation() {
        System.out.printf("""
                Name: %s
                Age: %d
                """, this.name, this.age);
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
}
