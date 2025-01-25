package study.viradonojiraya.designPatterns.builder;

public class Test {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstName("Danilo")
                .lastName("Leão")
                .age(28)
                .email("daniloleaodev@gmail.com")
                .build();
    }
}
