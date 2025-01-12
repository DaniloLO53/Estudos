
package study.viradonojiraya.day3.domain;

public class Constructors {
    private String name;
    private int age;
    private char gender;
    private double height;

    // Constructor (it doesn't have the returning type)
    public Constructors(String name, int age, char gender) {
        this(); // it calls the Constructor without parameters (not required)
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // Overloading for constructor: it works like method overloading
    public Constructors(String name, int age, char gender, double height) {
        this(name, age, gender); // it calls the Constructor with 3 parameters
        this.height = height;
    }

    // When no constructors are created, the constructor is automatically created at compiling time
    public Constructors() {
        System.out.println("Constructor without parameters");
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
