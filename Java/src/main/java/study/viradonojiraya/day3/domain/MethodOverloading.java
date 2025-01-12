package study.viradonojiraya.day3.domain;

public class MethodOverloading {
    private String name;
    private int age;
    private char gender;

    public void init(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method overloading - it allows to write 2 methods with the same name
    // Another class can choose which method to use
    // It avoids the necessity of modifying the method at all the places it's being used
    // Without this, modifying the original method will break all the uses of the method if not modified
    public void init(char gender) {
        this.gender = gender;
    }

    public void presentation() {
        System.out.printf("""
                Name: %s
                Age: %d
                """, this.name, this.age);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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
