package study.random.OOP.OOP3;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void presentation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
