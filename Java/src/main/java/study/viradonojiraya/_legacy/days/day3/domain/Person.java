package study.viradonojiraya._legacy.days.day3.domain;

// ************* SHORTCUTS *************
// ALT + INSERT: generate getters and setters

public class Person {
    // the Person's attributes must be directly visible only for the class itself, allowing decoupling
    // another class should access Person's attributes through get and set methods, which we call inheritance
    private String name; // it can only be accessed by the class itself, not its instances (the objects)
    private int age;
    private char gender;

    public void presentation() {
        // get and set methods should only be accessed by other classes
        // use "this" for referencing name and age
        System.out.printf("""
                Name: %s
                Age: %d
                """, this.name, this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
