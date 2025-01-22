package study.viradonojiraya._legacy.days.day3.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void apresentation() {
        System.out.printf("""
                Name: %s
                Age: %d
                Gender: %c
                """, this.name, this.age, this.gender);
    }
}
