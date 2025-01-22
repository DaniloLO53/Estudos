package study.viradonojiraya._legacy.days.day4.heritance.domain;

public class Person {
    // attributes are protected so that we can access these within the Employee class
    // protected methods only can be accessed by its subclasses
    protected String name;
    protected int age;
    protected Address address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Address address) {
        this(name, age);
        this.address = address;
    }

    public void presentation() {
        System.out.printf("""
                Name: %s
                Age: %d
                Address street: %s
                """, this.name, this.age, this.address != null ? this.address.getStreet() : "No address");
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
