package domain;

import enums.Status;

public abstract class Person {
    private String name;
    private String email;
    private Status status;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
