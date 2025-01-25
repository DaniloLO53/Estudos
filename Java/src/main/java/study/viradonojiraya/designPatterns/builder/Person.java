package study.viradonojiraya.designPatterns.builder;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    private Person(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String email;

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }
        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, age, email);
        }
    }
}
